package com.ruizhiqi.entity;

import java.util.Date;

public class Student {
    private String id;
    private String name;
    private Integer age;
    private Date birdate;
    private Clazz clazz;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birdate=" + birdate +
                ", clazz=" + clazz +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirdate() {
        return birdate;
    }

    public void setBirdate(Date birdate) {
        this.birdate = birdate;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Student() {

    }

    public Student(String id, String name, Integer age, Date birdate, Clazz clazz) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.birdate = birdate;
        this.clazz = clazz;
    }
}
