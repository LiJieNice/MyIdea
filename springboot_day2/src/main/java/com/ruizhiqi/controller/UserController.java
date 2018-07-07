package com.ruizhiqi.controller;


import com.ruizhiqi.entity.User;
import com.ruizhiqi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


//@RestController  返回给前端json格式数据   注解底层使用的是jsckson转换json
//@Controller      返回的是指定的html页面

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/showAll")
    public String showAll(Model model) {
        List<User> users = userService.showAll();
        //String s = UUID.randomUUID().toString().replaceAll("-", "");
        //User user = new User(s,"xiaozi",22);
        //model.addAttribute("user",user);
        for (User user : users) {
            model.addAttribute("user", user);
            System.out.println(user);
        }
        return "index";

    }

/*    @RequestMapping("/insert")
    public void insert(){
        User user = new User(null,"hehe",19);
        userService.insert(user);
    }

    @RequestMapping("/update")
    public void update(){
        User user = new User("2","xi",22);
        userService.update(user);
    }*/


    @RequestMapping("/hello")
    public void hello(String username, String password) {

        System.out.println(username);
        System.out.println(password);
        System.out.println("hello");
        System.out.println("================");


        //记得跳转的时候要加/  表示这是根目录  springboot_day2/session.jsp   才能正确的跳转到界面
        //return "redirect:/index.jsp";
    }


    //批量查询
    @ResponseBody
    @RequestMapping("/for")
    public String forEach() {
        String[] str = {"1", "3"};
        List<User> users = userService.slectByIds(str);
        for (User user : users) {
            System.out.println(user);
        }
        return "OK";

    }

    //批量修改


    @ResponseBody
    @RequestMapping("/update")
    public String updateHashMap() {
        User user1 = new User("1", "hehe", 18);
        User user2 = new User("2", "hehe", 18);
        User user3 = new User("3", "hehe", 18);
        User user4 = new User("4", "hehe", 18);
        User user5 = new User("5", "hehe", 18);

        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        HashMap<String, Object> map = new HashMap<>();

        map.put("list", list);

        userService.updateHashMap(map);

        System.out.println("yes");

        return "OK";
    }

    @ResponseBody
    @RequestMapping("/add")
    public String addList() {
        User user1 = new User(null, "xixi", 11);
        User user2 = new User(null, "xixi", 11);
        User user3 = new User(null, "xixi", 11);
        User user4 = new User(null, "xixi", 11);
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        userService.addList(list);

        return "OK";


    }


}
