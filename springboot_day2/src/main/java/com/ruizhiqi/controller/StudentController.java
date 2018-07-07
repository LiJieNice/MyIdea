package com.ruizhiqi.controller;


import com.ruizhiqi.entity.Student;
import com.ruizhiqi.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;


    @ResponseBody
    @RequestMapping("/showAll")
    public String showAll() {

        List<Student> students = studentService.showAll();
        for (Student student : students) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(simpleDateFormat.format(student.getBirdate()));
            System.out.println(student);
        }
        return "OK";
    }

}
