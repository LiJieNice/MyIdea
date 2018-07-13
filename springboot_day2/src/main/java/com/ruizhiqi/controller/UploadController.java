package com.ruizhiqi.controller;


import com.ruizhiqi.util.UploadFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/upload")
public class UploadController {


    @RequestMapping("/file")
    public String upload(MultipartFile file, HttpServletRequest request) {
        UploadFile.getFile(file, request);
        return "OK";

    }
}
