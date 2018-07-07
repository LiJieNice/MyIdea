package com.ruizhiqi.service;

import com.ruizhiqi.dao.StudentDAO;
import com.ruizhiqi.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDAO studentDAO;

    @Override
    public List<Student> showAll() {
        List<Student> students = studentDAO.showAll();
        return students;
    }
}
