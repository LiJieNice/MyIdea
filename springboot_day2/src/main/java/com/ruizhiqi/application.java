package com.ruizhiqi;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//扫描dao接口所在位置  开启包扫描，如果没有这个，将找不到dao接口
@MapperScan("com.ruizhiqi.dao")
public class application {
    public static void main(String[] args) {

        SpringApplication.run(application.class, args);
    }
}
