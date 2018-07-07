package com.ruizhiqi.service;

import com.ruizhiqi.entity.Dity;

import java.util.List;

public interface DityService {


    //通过用户输入的内容进行选择
    List<Dity> selectByUser(Dity dity);

    List<Dity> select();
}
