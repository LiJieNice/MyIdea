package com.ruizhiqi.service;


import com.ruizhiqi.application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//  可以把它直接定义为测试类，哪个类需要直接继承这个测试类即可
//@RunWith(SpringJUnit4ClassRunner.class)  //SpringJUnit支持，由此引入Spring-Test框架支持！
//@SpringBootTest(classes = application.class) // 指定我们SpringBoot工程的Application启动类
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = application.class)
public class SpringTest {

}
