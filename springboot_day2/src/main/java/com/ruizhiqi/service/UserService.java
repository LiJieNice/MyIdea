package com.ruizhiqi.service;

import com.ruizhiqi.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public interface UserService {
    List<User> showAll();


    //批量查询
    List<User> slectByIds(String[] ids);

    //批量修改
    void updateHashMap(HashMap<String, Object> map);

    //批量添加
    void addList(ArrayList<User> users);

}
