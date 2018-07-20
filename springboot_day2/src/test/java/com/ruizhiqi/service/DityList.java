package com.ruizhiqi.service;

import com.ruizhiqi.entity.Dity;

import java.util.List;

public class DityList {

    public void testDity(List<Dity> list) {


        for (Dity dity : list) {
            // System.out.println("+++++++++++++++++++++s");
            dity.setId("342");
        }


        for (Dity dity : list) {
            // System.out.println("=================================");
            String id = dity.getId();
            System.out.println(id + "============");
        }
    }


}
