package com.ruizhiqi.controller;


import com.ruizhiqi.entity.Originality;
import com.ruizhiqi.service.OriginalityService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/originality")
public class OriginalityController {


    @Resource
    private OriginalityService originalityService;

    @RequestMapping("/add")
    @ResponseBody
    public String addOriginality(MultipartFile img, String title, String content, String imgContent, HttpServletRequest request) throws IOException {
        //获取文件储存位置
        String projectPath = request.getSession().getServletContext().getRealPath("/");
        String audioPath = projectPath + "audio";
        File audio = new File(audioPath);
        //判断一下这个文件夹是否存在，
        if (!audio.exists()) {
            //创建这个文件夹
            audio.mkdir();
        }


        //重命名
        //originalFilename 上传的原始文件名
        String originalFilename = img.getOriginalFilename();
        //extension 文件的类型  列mp3
        String extension = FilenameUtils.getExtension(originalFilename);
        //通过uuid给文件起的新名字
        String newName = UUID.randomUUID().toString() + "." + extension;

        //图片的路径impPath
        String imgPath = audio + "/" + newName;


        //上传到对应问夹
        try {
            img.transferTo(new File(audioPath, newName));

            //获取图片的宽和高
            File file = new File(imgPath);

            FileInputStream in = new FileInputStream(file);
            BufferedImage bi = ImageIO.read(in);// 通过ImageIO读取输入流来获取一个BufferedImage对象
            int height = bi.getHeight();//获取高度
            int width = bi.getWidth();//获取宽度
            System.out.println("高：" + height);
            System.out.println("宽：" + width);


            originalityService.insert(new Originality(null, title, content, imgPath, imgContent, originalFilename, newName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:index";
        //获取时长，获取大小，保存到数据库  并且也要保存原始上传的文件名，在前端界面显示的时候展示的是原始的文件名
    }


    @RequestMapping("/adds")
    @ResponseBody
    public String addOriginality(MultipartFile[] myfiles, String title, String content, String imgContent, HttpServletRequest request) throws IOException {
        //获取文件储存位置
        //这是webApp的位置
        String realPath = request.getSession().getServletContext().getRealPath("/");
        //路径
        String budioPath = realPath + "budioPath";
        //创建这个文件夹
        File budio = new File(budioPath);
        //判断这个文件夹是否存在
        if (!budio.exists()) {
            //如果不存在创建
            budio.mkdir();
        }

        //因为上传的不只是一个图片，先判断是否为空，
        if (myfiles != null && myfiles.length > 0) {
            for (MultipartFile img : myfiles) {

                //获取文件的名称(包括后缀名称)
                String originalFilename = img.getOriginalFilename();
                //获取文件的类型
                String extension = FilenameUtils.getExtension(originalFilename);
                //给原始文件起新名字
                String s = UUID.randomUUID().toString().replaceAll("-", "");
                String newName = s + extension;


                img.transferTo(new File(budioPath, newName));
            }
        }
        return "index";


        //之后获取原始文件名字


    }

    @RequestMapping("/you")
    @ResponseBody
    //myfiles图片  titles标题   content标题内容   imgContents图片内容
    public void yes(MultipartFile[] myfiles, String[] titles, String[] contents, String[] imgContents, HttpServletRequest request) throws IOException {
        //先获取文件位置 webapp
        String realPath = request.getSession().getServletContext().getRealPath("/");
        //创建文件
        String mu = realPath + "file";
        File up = new File(mu);
        //判断文件是否存在
        if (!up.exists()) {
            //如果没有就创建这个文件
            up.mkdir();
        }
        //标题和标题内容组合

        ArrayList<String> list = new ArrayList<>();


        String str = "";
        if (titles != null && titles.length > 0 && contents != null && contents.length > 0) {
            for (int i = 0; i < titles.length; i++) {
                for (int j = 0; j < contents.length; j++) {
                    if (i == j) {
                        str = titles[i] + "------------------" + contents[j];
                        System.out.println(str);
                        list.add(str);
                    }
                }
            }
        }


        ArrayList<String> list2 = new ArrayList<>();
        String stu = "";
        if (myfiles != null && myfiles.length > 0 && imgContents != null && imgContents.length > 0) {
            for (int i = 0; i < myfiles.length; i++) {
                for (int j = 0; j < imgContents.length; j++) {
                    if (i == j) {
                        stu = myfiles[i] + "-------" + myfiles[j];
                        System.out.println(stu);
                        list2.add(stu);
                    }
                }
            }
        }


        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                System.out.println();
            }
        }


    }


    @RequestMapping("/showAll")
    @ResponseBody
    public List<Originality> showAll() {
        //JSONObject jsonObject = new JSONObject();
        List<Originality> originalities = originalityService.select();
        return originalities;
        //jsonObject.put("list",originalities);
        //return jsonObject;
    }



    /*
    * //下载音频
    @RequestMapping("/down")
    //下载需要穿的参数
    public void down(String url, String oldName, HttpServletRequest request, HttpServletResponse response) throws IOException {
        //找到下载的文件
        String filePath = request.getSession().getServletContext().getRealPath("audio"+"/"+url);
        File file = new File(filePath);

        String extension = FilenameUtils.getExtension(url);
        oldName = oldName+"."+extension;

        try {
          oldName = new String(oldName.getBytes("UTF-8"),"ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //设置响应头,响应类型  mpeg  mp3
        response.setContentType("audio/mpeg");
        response.setHeader("Content-Disposition","attachment;fileName="+oldName);

        //响应流的响应出去
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(FileUtils.readFileToByteArray(file));

    }
    *
    * */

}
