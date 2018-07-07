package com.ruizhiqi.service;

import com.ruizhiqi.application;
import com.ruizhiqi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)  //SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes = application.class) // 指定我们SpringBoot工程的Application启动类
@WebAppConfiguration // 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void test2() {
        List<User> users = userService.showAll();
        for (User user : users) {
            System.out.println(user);
        }

        //System.out.println("user为空");
    }
}