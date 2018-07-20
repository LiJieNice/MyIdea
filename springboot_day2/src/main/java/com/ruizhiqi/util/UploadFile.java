package com.ruizhiqi.util;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UploadFile {


    public static Map<String, String> getFile(MultipartFile file, HttpServletRequest request) {

        HashMap<String, String> map = new HashMap<>();

        String realPath = request.getSession().getServletContext().getRealPath("/");  //webapp目录下

        String finPath = realPath + "zhixin";  //在webapp 下创建一个新的路径
        File finFile = new File(finPath);  //创建这个文件

        //判断这个文件夹是否存在
        if (!finFile.exists()) {   //!要有这个！号
            finFile.mkdir();  //如果不存在就创建这个文件夹
        }


        //之后获取文件的名，（包括文件的后缀）
        String oldName = file.getOriginalFilename();

        //得到文件的后缀
        String extension = FilenameUtils.getExtension(oldName);

        //给文件起新的名称
        String s1 = UUID.randomUUID().toString().replaceAll("-", "");
        String newName = s1 + "." + extension;

        //将图片上传到对应文件夹 img.transferTo(new File(budioPath, newName));

        //图片的路径impPath
        String imgPath = finFile + "/" + newName;

        try {
            file.transferTo(new File(finPath, newName));

        } catch (IOException e) {
            e.printStackTrace();
        }


        map.put("oldName", oldName);//老名称
        map.put("newName", newName);//新名称
        map.put("imgPath", imgPath);//图片的路径

        return map;
    }
}
