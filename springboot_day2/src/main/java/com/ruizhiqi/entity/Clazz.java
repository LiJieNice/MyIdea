package com.ruizhiqi.entity;

public class Clazz {
    private String id;
    private String className;

    @Override
    public String toString() {
        return "Clazz{" +
                "id='" + id + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Clazz() {

    }

    public Clazz(String id, String className) {

        this.id = id;
        this.className = className;
    }
}
