package com.ruizhiqi.controller;


import com.ruizhiqi.code.FinList;
import com.ruizhiqi.entity.Fin;
import com.ruizhiqi.service.FinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
@RequestMapping("/imgfile")
public class ImgFileController {


    @Resource
    private FinService finService;


    @RequestMapping("/file")
    public void add(FinList list, HttpServletRequest request) throws IOException {
 /*       //首先获取到图片，上传到服务器之后再做判断处理
        String realPath = request.getSession().getServletContext().getRealPath("/");//webapp的路径
        String imgPaht = realPath+"zhixin";  //路径
        File zhixin = new File(imgPaht);  //创建这个文件夹
        if(!zhixin.exists()){  //  如果!不存在
            zhixin.mkdir();    //创建这个文件夹
        }

        for (Fin fin : list.getList()) {  //遍历这个集合，获取里面的对象
            MultipartFile[] multipartFiles = fin.getFiles();   //获得到上传的文件
            String imgPaths = "";   //图片的路径
            String oldNames = "";   //图片的原名称
            String newNames = "";   //图片的新名称

            //这个循环只是做到了上传图片
            for (MultipartFile multipartFile : multipartFiles) {
                //获取整个文件的名称
                String oldName = multipartFile.getOriginalFilename();
                //得到文件的后缀
                String extension = FilenameUtils.getExtension(oldName);

                //之后给文件起新的名称
                String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                //文件的新名称
                String newName = uuid+"."+extension;



                //上传到对应的文件夹   此时已经将文件上传到对应的文件夹
                multipartFile.transferTo(new File(imgPaht,newName));


                //图片的路径impPath   如果这不单单是一个图片，必须进行拼接
                imgPaths += zhixin + "/" + newName+",";
                oldNames += oldName+",";    //老名字拼接在一起
                newNames += newName+",";    //新名字拼接在一起

                //可以先把数据存到数据库，之后再判断图片的大小

            }
            //这些记录的统统是图片
            fin.setImgUrls(imgPaths.substring(0,imgPaths.length()-1));//去除最后一个字符
            System.out.println("图片的路径=========="+fin.getImgUrls());
            fin.setOldName(oldNames.substring(0,oldNames.length()-1));
            System.out.println("图片的之前的名字======"+fin.getOldName());
            fin.setNewName(newNames.substring(0,newNames.length()-1));
            System.out.println("图片的新的名字========"+fin.getNewName());




            //更改单图，大图，logo的相关信息
            if(fin.getFile() != null ){
                MultipartFile multipartFile = fin.getFile();  //获取到logo文件
                Map<String,String> map = UploadFile.getFile(multipartFile, request); //调用这个方法，上传图片
                fin.setOldLogoName(map.get("oldName"));//老名称
                System.out.println("logo老名称============="+fin.getOldLogoName());
                fin.setNewLogoName(map.get("newName"));//新名称
                System.out.println("logo新名称========"+fin.getNewLogoName());
                fin.setLogoUrl(map.get("imgPath"));//logo图片的路径
                System.out.println("logo图片的路径====="+fin.getLogoUrl());
            }




        }*/

        for (Fin fin : list.getList()) {
            String titleContent = fin.getTitle() + fin.getContents();

            for (Fin fins : list.getList()) {
                String path = "";

                //String imgUrls = fins.getImgUrls();
                if (fins.getImgUrls() != null) {  //先判断是否有图片
                    String[] imgPath = fins.getImgUrls().split(",");  //这是一数组

                    if (imgPath.length == 1) {
                        FileInputStream fileInputStream = new FileInputStream(imgPath[0]);
                        BufferedImage read = ImageIO.read(fileInputStream);
                        int width = read.getWidth(); //获取宽度
                        if (width == 370 && fin.getContents().length() <= 44) {  //判断得到这是一个单图，并且字段小于44
                            System.out.println(titleContent + fins.getImgContents() + imgPath[0]);

                        } else {
                            System.out.println(titleContent + fins.getImgContents() + imgPath[0]);  //大图
                        }
                    } else {
                        FileInputStream fileInputStream = new FileInputStream(imgPath[0]);  //三图
                        BufferedImage read = ImageIO.read(fileInputStream);
                        int width = read.getWidth(); //获取宽度

                        for (String img : imgPath) {
                            path += img + ",";
                        }
                        System.out.println(titleContent + fins.getImgContents() + path.substring(0, path.length() - 1));
                    }
                }
            }
        }
    }


       /* for (Fin fin : list) {
            String titleContent = fin.getTitle()+fin.getContents();  //标题加标题内容

            for (Fin fin1 : list) {
                String path = "";
                if(fin1.getMultipartFile()!= null){  //先判断是否有图片
                    MultipartFile[] multipartFile = fin1.getMultipartFile();//这是一数组  获取到图片

                    //上传到服务器之后再判断图片的宽高





                    if(multipartFile.length == 1){
                        FileInputStream fileInputStream = new FileInputStream();
                        BufferedImage read = ImageIO.read(fileInputStream);
                        int width = read.getWidth(); //获取宽度
                        if(width == 370 && fin.getContents().length()<=44){  //判断得到这是一个单图，并且字段小于44
                            System.out.println(titleContent+fin1.getImgContents()+imgPath[0]);

                        }else{
                            System.out.println(titleContent+fin1.getImgContents()+imgPath[0]);  //大图
                        }
                    }else{
                        FileInputStream fileInputStream = new FileInputStream(imgPath[0]);  //三图
                        BufferedImage read = ImageIO.read(fileInputStream);
                        int width = read.getWidth(); //获取宽度

                        for (String img : imgPath) {
                            path += img+",";
                        }
                        System.out.println(titleContent+fin1.getImgContents()+path.substring(0,path.length()-1));
                    }
                }
            }
        }*/


}







    /*public void add(List<Fin> list, HttpServletRequest request) {
        String id = UUID.randomUUID().toString().replaceAll("-", "");

        *//*
        *  Jp jp1 = new Jp(id, "标题1", "标题内容1", "这是图片内容one", new String[]{"C:\\cc\\3.jpg"}, "www.baidu.com", "hehe", "xixi");
        Jp jp2 = new Jp(id, "标题2", "标题内容2", "这是图片内容two", new String[]{"C:\\cc\\2.jpg"}, "www.baidu.com", "hehe", "xixi");
        Jp jp3 = new Jp(id, "标题3", "标题内容3", "这是图片内容three", new String[]{"C:\\cc\\download.jpg", "C:\\cc\\2.jpg", "C:\\cc\\3.jpg"}, "www.baidu.com", "hehe", "xixi");
        *
        * *//*
        //MultipartFile multipartFile = new MultipartFile();

        //Fin fin1 = new Fin(id,"标题1","标题内容1","这是图片内容one",new String[]{"C:\\cc\\3.jpg"},"www.baidu.com","锐之旗","C:\\cc\\3.jpg","hehe", "xixi");
        //Fin fin2 = new Fin(id,"标题1","标题内容1","这是图片内容one",new String[]{"C:\\cc\\2.jpg"},"www.baidu.com","锐之旗","C:\\cc\\3.jpg","hehe", "xixi");
        //Fin fin3 = new Fin(id,"标题1","标题内容1","这是图片内容one",new String[]{"C:\\cc\\download.jpg", "C:\\cc\\2.jpg", "C:\\cc\\3.jpg"},"www.baidu.com","锐之旗","C:\\cc\\3.jpg","hehe", "xixi");



*//*        ArrayList<Fin> list = new ArrayList<>();

        list.add(fin1);
        list.add(fin2);
        list.add(fin3);*//*


 *//*        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> contentss = new ArrayList<>();

        for (Fin fin : list) {
            String title = fin.getTitle();
            String contents = fin.getContents();
            titles.add(title);
            contentss.add(contents);
        }*//*
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
                    } *//*else if (files.length > 1) {

                        // try {
                        String img = "";
                        //获取到照片的路径，赋值给Img

                        for (int j = 0; j < files.length; j++) {
                            if (files.length > j) {

                                img += files[j] + ",";
                            }
                        }



                        //这个方法去除最后一个字符串

                         *//**//*img.substring(0,img.length()-1) + jp.getImgContents()


                            for (String imgPath : imgPaths) {
                                img += imgPath;
                            }*//**//*
                        //FileInputStream in = new FileInputStream(img);
                        //BufferedImage bi = ImageIO.read(in);// 通过ImageIO读取输入流来获取一个BufferedImage对象
                        //int height = bi.getHeight();//获取高度
                        //int width = bi.getWidth();//获取宽度   //1040*640是大图40个字符  单图370*245占44个字符    是三图370*245占70个字符
                        //System.out.println("高：" + height);
                        //System.out.println("宽：" + width);
                        //img.substring(0, img.length() - 1)   从下标为0开始截取，截取到
                        System.out.println(fin.getTitle() + fin.getContents() + img.substring(0, img.length() - 1) + fin.getImgContents() + "三图=============");
                    }*//*
                }

            }
        }
    }*/



