package com.ruizhiqi.controller;


import com.ruizhiqi.code.ImgList;
import com.ruizhiqi.entity.Img;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/test")
public class ImgController {


    @RequestMapping("/t")  //@RequestParam MultipartFile file
    public void test1(ImgList list) {  //这是把他封装的对象放进来

        System.out.println("=========");
        if (list != null) {

            if (list.getList() != null) {
                List<Img> imgs = list.getList();
                for (Img img : imgs) {
                    System.out.println(img.getFile().getOriginalFilename());
                    System.out.println(img.getContent());
                    System.out.println(img.getName());
                }
            }
        }


    }

    @RequestMapping("/s")  //@RequestParam MultipartFile file
    /*1.用HttpServletRequest接收前台的参数*/

    //false表示不是必须传递该值@RequestParam(value="img",required = false)
    public void test2(Img img, HttpServletRequest request) {  //这是把他封装的对象放进来


        //这个可以同时上传多个文件
        //List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("files");

        MultipartFile file = null;
        /* 2.如果是上传文件请求，获取文件列表*/
        if (request instanceof MultipartHttpServletRequest) {
            file = ((MultipartHttpServletRequest) request).getFile("file");

            if (file != null) {
                System.out.println(file);
                String originalFilename = file.getOriginalFilename();
                System.out.println(originalFilename);
            }


            System.out.println("=========");
            /*if (img != null) {
                String originalFilename = img.getMultipartFile().getOriginalFilename();
                System.out.println(originalFilename);
                System.out.println(img.getMultipartFile());
                System.out.println(img.getContent());
                System.out.println(img.getName());
            }*/
        }
    }


    @RequestMapping("/files")

    public String test3(HttpServletRequest request, ImgList list) {
        List<MultipartFile> file = null;

        if (request instanceof MultipartHttpServletRequest) {
            file = ((MultipartHttpServletRequest) request).getFiles("list");

        }
        if (file != null) {
            for (MultipartFile multipartFile : file) {
                String originalFilename = multipartFile.getOriginalFilename();
                System.out.println(originalFilename);
            }
        }

      /*  if(list != null){

            for (Img img : list.getList()) {
                System.out.println(img.getMultipartFile());

            }
        }*/
        return "redirect:/img.jsp";
    }
}
