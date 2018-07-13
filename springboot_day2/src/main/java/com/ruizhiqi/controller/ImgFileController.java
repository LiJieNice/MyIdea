package com.ruizhiqi.controller;


import com.ruizhiqi.entity.Fin;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/imgfile")
public class ImgFileController {


    @RequestMapping("file")
    public void add(List<Fin> list, HttpServletRequest request) {
        String id = UUID.randomUUID().toString().replaceAll("-", "");

        /*
        *  Jp jp1 = new Jp(id, "标题1", "标题内容1", "这是图片内容one", new String[]{"C:\\cc\\3.jpg"}, "www.baidu.com", "hehe", "xixi");
        Jp jp2 = new Jp(id, "标题2", "标题内容2", "这是图片内容two", new String[]{"C:\\cc\\2.jpg"}, "www.baidu.com", "hehe", "xixi");
        Jp jp3 = new Jp(id, "标题3", "标题内容3", "这是图片内容three", new String[]{"C:\\cc\\download.jpg", "C:\\cc\\2.jpg", "C:\\cc\\3.jpg"}, "www.baidu.com", "hehe", "xixi");
        *
        * */
        //MultipartFile multipartFile = new MultipartFile();

        //Fin fin1 = new Fin(id,"标题1","标题内容1","这是图片内容one",new String[]{"C:\\cc\\3.jpg"},"www.baidu.com","锐之旗","C:\\cc\\3.jpg","hehe", "xixi");
        //Fin fin2 = new Fin(id,"标题1","标题内容1","这是图片内容one",new String[]{"C:\\cc\\2.jpg"},"www.baidu.com","锐之旗","C:\\cc\\3.jpg","hehe", "xixi");
        //Fin fin3 = new Fin(id,"标题1","标题内容1","这是图片内容one",new String[]{"C:\\cc\\download.jpg", "C:\\cc\\2.jpg", "C:\\cc\\3.jpg"},"www.baidu.com","锐之旗","C:\\cc\\3.jpg","hehe", "xixi");



/*        ArrayList<Fin> list = new ArrayList<>();

        list.add(fin1);
        list.add(fin2);
        list.add(fin3);*/


/*        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> contentss = new ArrayList<>();

        for (Fin fin : list) {
            String title = fin.getTitle();
            String contents = fin.getContents();
            titles.add(title);
            contentss.add(contents);
        }*/
        //这是图片  把图片放入一个对象中，因为上传的图片不仅仅是一张，把三张小图放在一块归为一类


        for (int i = 0; i < list.size(); i++) {

            //是标题和标题信息一一对应
            for (Fin fin : list) {
                //遍历图片对象和图片信息集合

                //[标题，标题内容] 截取下标为0的数获取到标题
                //计算出标题的长度

                int titleLength = fin.getTitle().length();


                //得到标题的长度
                System.out.println("标题的长度：" + titleLength);


                //计算图图片的路径
                //for (Jp jp : list) {
                //一个数组为一种

                if (fin.getFiles() != null) {
                    MultipartFile[] files = fin.getFiles();

                    //String[] imgPaths = list.get(i).getImgPath();
                    //System.out.println(i+"========================================================");
                    //如果大于0为3图   否则为大图或单图
                    if (files.length == 1) {
                        try {
                            String s = files[0].toString();

                            FileInputStream in = new FileInputStream(s);
                            BufferedImage bi = ImageIO.read(in);// 通过ImageIO读取输入流来获取一个BufferedImage对象
                            //int height = bi.getHeight();//获取高度
                            int width = bi.getWidth();//获取宽度   //1040*640是大图40个字符  单图370*245占44个字符    是三图370*245占70个字符
                            //System.out.println("宽：" + width);


                            if (width == 370 && titleLength <= 44) {
                                //确定后图片，把图片路径上传到数据库
                                String realPath = request.getSession().getServletContext().getRealPath("/");  //webapp目录下
                                String finPath = realPath + "fin";  //在webapp 下创建一个新的路径
                                File finImg = new File(finPath);  //创建这个文件夹
                                //判断这个文件夹是否存在
                                if (finImg.exists()) {
                                    finImg.mkdir();  //如果不存在就创建这个文件夹
                                }


                                //之后获取文件的名，（包括文件的后缀）
                                String originalFilename = files[0].getOriginalFilename();

                                //得到文件的后缀
                                String extension = FilenameUtils.getExtension(originalFilename);

                                //给文件起新的名称
                                String s1 = UUID.randomUUID().toString().replaceAll("-", "");
                                String newName = s1 + extension;

                                //将图片上传到对应文件夹 img.transferTo(new File(budioPath, newName));
                                files[0].transferTo(new File(finPath, newName));


                                //最后将数据存入到数据库


                                System.out.println(fin.getTitle() + fin.getContents() + s + fin.getImgContents() + "单图=============");
                            }

                            if (width == 1040 && titleLength <= 40) {
                                System.out.println(fin.getTitle() + fin.getContents() + s + fin.getImgContents() + "大图=============");
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else if (files.length > 1) {

                        // try {
                        String img = "";
                        //获取到照片的路径，赋值给Img

                        for (int j = 0; j < files.length; j++) {
                            if (files.length > j) {

                                img += files[j] + ",";
                            }
                        }



                        /*
                        这个方法去除最后一个字符串
                        * img.substring(0,img.length()-1) + jp.getImgContents()
                        *
                        * */
                            /*for (String imgPath : imgPaths) {
                                img += imgPath;
                            }*/
                        //FileInputStream in = new FileInputStream(img);
                        //BufferedImage bi = ImageIO.read(in);// 通过ImageIO读取输入流来获取一个BufferedImage对象
                        //int height = bi.getHeight();//获取高度
                        //int width = bi.getWidth();//获取宽度   //1040*640是大图40个字符  单图370*245占44个字符    是三图370*245占70个字符
                        //System.out.println("高：" + height);
                        //System.out.println("宽：" + width);
                        //img.substring(0, img.length() - 1)   从下标为0开始截取，截取到
                        System.out.println(fin.getTitle() + fin.getContents() + img.substring(0, img.length() - 1) + fin.getImgContents() + "三图=============");
                    }
                }

            }
        }
    }


}
