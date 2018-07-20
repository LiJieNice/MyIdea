package com.ruizhiqi.controller;


import com.ruizhiqi.entity.TitlePicture;
import com.ruizhiqi.service.TitlePictureService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/titlePicture")
public class TitlePictureController {


    @Resource
    private TitlePictureService titlePictureService;


    @RequestMapping("/showAll")
    public void showAll() {
        List<TitlePicture> titlePictures = titlePictureService.showAll();
        for (TitlePicture titlePicture : titlePictures) {
         /*   String imgPath = titlePicture.getImgPath();
            String[] split = imgPath.split(",");*/

            System.out.println(titlePicture);
        }
    }
}
