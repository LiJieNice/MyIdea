package com.ruizhiqi.controller;


import com.ruizhiqi.service.TitleContentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/title")
public class TitleContentController {


    @Resource
    private TitleContentService titleContentService;


    @RequestMapping("/insert")
    public void titleContent() {

    }

}
