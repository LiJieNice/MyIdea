package com.ruizhiqi.util;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class UploadFile {

    //request为空


    public static void getFile(MultipartFile file, HttpServletRequest request) {

        String realPath = request.getSession().getServletContext().getRealPath("/");  //webapp目录下
        String finPath = realPath + "fin";  //在webapp 下创建一个新的路径
        File finImg = new File(finPath);  //创建这个文件

        //判断这个文件夹是否存在
        if (!finImg.exists()) {   //!要有这个！号
            finImg.mkdir();  //如果不存在就创建这个文件夹
        }


        //之后获取文件的名，（包括文件的后缀）
        String originalFilename = file.getOriginalFilename();

        //得到文件的后缀
        String extension = FilenameUtils.getExtension(originalFilename);

        //给文件起新的名称
        String s1 = UUID.randomUUID().toString().replaceAll("-", "");
        String newName = s1 + extension;

        //将图片上传到对应文件夹 img.transferTo(new File(budioPath, newName));
        try {
            file.transferTo(new File(finPath, newName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
