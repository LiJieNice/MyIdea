package com.ruizhiqi.service;

import com.ruizhiqi.entity.User;
import com.ruizhiqi.util.ID;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//@RunWith(SpringJUnit4ClassRunner.class)  //SpringJUnit支持，由此引入Spring-Test框架支持！
//@SpringBootTest(classes = application.class) // 指定我们SpringBoot工程的Application启动类

@WebAppConfiguration  // 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class UserServiceImplTest extends SpringTest {

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

    @Test
    public void t3() {
        long id = ID.getId();
        System.out.println(id);
    }


    @Test
    public void t4() {

        HashMap<String, String> map = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key=" + entry.getKey() + " and value=" + entry.getValue());
        }

    }


}