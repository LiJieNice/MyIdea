package com.ruizhiqi.controller;


import com.ruizhiqi.code.PictureList;
import com.ruizhiqi.code.TitleContentList;
import com.ruizhiqi.entity.Logo;
import com.ruizhiqi.entity.Picture;
import com.ruizhiqi.entity.TitleContent;
import com.ruizhiqi.service.LogoService;
import com.ruizhiqi.service.PictureService;
import com.ruizhiqi.service.TitleContentService;
import com.ruizhiqi.util.Uid;
import com.ruizhiqi.util.UploadFile;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@RequestMapping("/pc")
@Controller
public class PictureController {


    @Resource
    private PictureService pictureService;
    @Resource
    private TitleContentService titleContentService;
    @Resource
    private LogoService logoService;


    @RequestMapping("/s")
    public String t1(PictureList pictures, TitleContentList titleContents, Logo logo, HttpServletRequest request) throws IOException {

        //首先获取到图片，上传到服务器之后再做判断处理
        String realPath = request.getSession().getServletContext().getRealPath("/");//webapp的路径
        String imgPath = realPath + "zhixin";  //路径
        File zhixin = new File(imgPath);  //创建这个文件夹
        if (!zhixin.exists()) {  //  如果!不存在
            zhixin.mkdir();    //创建这个文件夹
        }


        for (Picture picture : pictures.getPictures()) {
            MultipartFile[] files = picture.getFiles();
            String imgPaths = "";   //图片的路径
            String oldNames = "";   //图片的原名称
            String newNames = "";   //图片的新名称
            //这个做到了上传图片
            for (MultipartFile multipartFile : files) {
                //获取整个文件的名称
                String oldName = multipartFile.getOriginalFilename();
                //得到文件的后缀
                String extension = FilenameUtils.getExtension(oldName);

                //之后给文件起新的名称
                String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                //文件的新名称
                String newName = uuid + "." + extension;


                //上传到对应的文件夹   此时已经将文件上传到对应的文件夹
                multipartFile.transferTo(new File(imgPath, newName));


                //图片的路径impPath   如果这不单单是一个图片，必须进行拼接
                imgPaths += zhixin + "/" + newName + ",";
                oldNames += oldName + ",";    //老名字拼接在一起
                newNames += newName + ",";    //新名字拼接在一起

                //可以先把数据存到数据库，之后再判断图片的大小

            }
            //这些记录的统统是图片
            picture.setImgPath(imgPaths.substring(0, imgPaths.length() - 1));//去除最后一个字符
            System.out.println("图片的路径==========" + picture.getImgPath());
            picture.setOldName(oldNames.substring(0, oldNames.length() - 1));
            System.out.println("图片的之前的名字======" + picture.getOldName());
            picture.setNewName(newNames.substring(0, newNames.length() - 1));
            System.out.println("图片的新的名字========" + picture.getNewName());
        }

//        map.put("oldName",oldName);//老名称
//        map.put("newName",newName);//新名称
//        map.put("imgPath",imgPath);//图片的路径

        //logo文件   不在循环之中
        MultipartFile logoFile = logo.getFile();
        Map<String, String> logoMap = UploadFile.getFile(logoFile, request);
        String oldName = logoMap.get("oldName");
        String newName = logoMap.get("newName");
        String imgUrl = logoMap.get("imgPath");

        logo.setOldName(oldName);
        System.out.println("logo图片的老名字============" + logo.getOldName());
        logo.setNewName(newName);
        System.out.println("logo图片的新名字============" + logo.getNewName());
        logo.setLogoUrl(imgUrl);
        System.out.println("logo图片的路径==============" + logo.getLogoUrl());

        logoService.insert(logo);


        for (TitleContent titleContent : titleContents.getTitleContents()) {  //这是遍历所有的标题和标签
            String tc = titleContent.getTitle() + titleContent.getContent(); //标题和标签组合起来
            for (Picture picture : pictures.getPictures()) {  //每遍历以标题都与所有的图片向组合
                String path = "";
                if (picture.getImgPath() != null) {
                    String imgPaths = picture.getImgPath();
                    String[] imgs = imgPaths.split(",");

                    //得到标题和标签，  creativeName创意名称=标签+图片标签   创意状态再service层添加
                    String creativeName = titleContent.getContent() + picture.getImgContent();
                    titleContent.setCreativeName(creativeName);

                    String uuid = Uid.getUUID();
                    titleContent.setId(uuid);
                    titleContent.setType("暂停");
                    picture.setId(uuid);

                    if (imgs.length == 1) {

                        FileInputStream fileInputStream = new FileInputStream(imgs[0]);
                        BufferedImage read = ImageIO.read(fileInputStream);
                        int width = read.getWidth(); //获取宽度
                        if (width == 370 && titleContent.getTitle().length() <= 44) {  //判断得到这是一个单图，并且字段小于44
                            titleContentService.insert(titleContent);
                            //imgContent=#{imgContent},imgPath=#{imgPath},oldName=#{oldName},newName=#{oldName} where id=#{id}
                            pictureService.update(picture);

                            System.out.println("~!@~!@~!@~!@~!@~!@~!@~!@~!@~!@~!@~@" + titleContent + picture.getImgContent() + imgs[0]);

                        } else {

                            titleContentService.insert(titleContent);
                            pictureService.update(picture);
                            System.out.println("~!@~!@~!@~!@~!@~!@~!@~!@~!@~!@~!@~@" + titleContent + picture.getImgContent() + imgs[0]);  //大图
                        }
                    } else {
                        for (String img : imgs) {
                            path += img + ",";
                        }
                        titleContentService.insert(titleContent);
                        picture.setImgPath(path.substring(0, path.length() - 1));
                        pictureService.update(picture);
                        System.out.println("~!@~!@~!@~!@~!@~!@~!@~!@~!@~!@~!@~@" + titleContent + picture.getImgContent() + path.substring(0, path.length() - 1));//path.substring(0,path.length()-1)
                    }
                }
            }

        }



       /* List<Picture> pictures1 = pictures.getPictures();
        for (Picture picture : pictures1) {
            MultipartFile[] files = picture.getFiles();
            for (MultipartFile file : files) {
                Map<String, String> file1 = UploadFile.getFile(file, request);
                System.out.println(file1.get("oldName"));
                System.out.println(file1.get("newName"));
            }
        }
        for(TitleContent titleContent : titleContents.getTitleContents()){
            System.out.println(titleContent.getTitle());
            System.out.println(titleContent.getContent());
        }

        String originalFilename = logo.getFile().getOriginalFilename();
        System.out.println(originalFilename);*/

        return "redirect:/img3.jsp";
    }
}
