package com.ruizhiqi.controller;


import com.ruizhiqi.entity.Dity;
import com.ruizhiqi.service.DityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/dity")

public class DityController {

    @Resource
    private DityService dityService;



    @RequestMapping("/showDity")
    public void showDity(Dity list) {
        List<Dity> dities = dityService.selectByUser(list);
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

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Dity dity) {
        System.out.println(dity.toString());
        Double price = dity.getPrice();

        //Double.parseDouble();
        dityService.add(dity);
        return "ok";
    }

}
