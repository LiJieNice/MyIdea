package com.ruizhiqi.service;

import com.ruizhiqi.dao.UserDAO;
import com.ruizhiqi.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;


@Service
@Transactional
//@SpringBootTest
public class UserServiceImpl implements UserService {


    @Resource
    private UserDAO userDAO;


    @Override
    public List<User> showAll() {
        List<User> users = userDAO.showAll();
        return users;
    }


    /*   @Override
       public void insert(User user) {
           String s = UUID.randomUUID().toString().replaceAll("-", "");
           user.setId(s);
           userDAO.insert(user);
       }

       @Override
       public void update(User user) {
           userDAO.update(user);
       }


       @Override
       public void inserts(User[] users) {
           for (User user : users) {
               String id = UUID.randomUUID().toString().replaceAll("-", "");
               user.setId(id);
               userDAO.inserts(users);
           }
       }

       @Override
       public void insert1(String names) {
           //String id = UUID.randomUUID().toString().replaceAll("-", "");

           userDAO.insert1(names);
       }
   */
    @Override
    public List<User> slectByIds(String[] ids) {
        return userDAO.slectByIds(ids);
    }

    @Override
    public void updateHashMap(HashMap<String, Object> map) {
        userDAO.updateHashMap(map);
    }

    @Override
    public void addList(ArrayList<User> users) {
        for (User user : users) {
            String id = UUID.randomUUID().toString().replaceAll("-", "");
            user.setId(id);
        }

        userDAO.addList(users);
    }


}
