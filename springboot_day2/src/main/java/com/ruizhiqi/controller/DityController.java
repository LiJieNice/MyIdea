package com.ruizhiqi.controller;


import com.ruizhiqi.entity.Dity;
import com.ruizhiqi.service.DityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/dity")

public class DityController {

    @Resource
    private DityService dityService;


    @RequestMapping("/showDity")
    public void showDity(Dity dity) {
        List<Dity> dities = dityService.selectByUser(dity);
        for (Dity dity1 : dities) {
            System.out.println(dity1);
        }
    }


    @RequestMapping("/showAll")
    public void t1() {
        List<Dity> ditys = dityService.select();
        for (Dity dity : ditys) {
            System.out.println(dity);
        }
    }

}
