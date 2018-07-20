package com.ruizhiqi.service;

import com.ruizhiqi.code.FinList;
import com.ruizhiqi.entity.Fin;
import org.junit.Test;

import java.util.List;

public class FinTest {


    @Test
    public void test1() {

        FinList finList = new FinList();
        List<Fin> list = finList.getList();
        for (Fin fin : list) {
            System.out.println(fin);
        }


    }
}
