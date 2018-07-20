package com.ruizhiqi.dao;

import com.ruizhiqi.entity.Dity;

import java.util.List;

public interface DityDAO {

    //通过用户输入的内容进行选择
    List<Dity> selectByUser(Dity dity);

    List<Dity> select();

    //添加
    void add(Dity dity);
}
