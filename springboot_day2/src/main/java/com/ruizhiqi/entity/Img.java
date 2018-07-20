package com.ruizhiqi.entity;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class Img implements Serializable {

    private String id;
    private String name;
    private String content;
    public MultipartFile file;


    @Override
    public String toString() {
        return "Img{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", file=" + file +
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public Img() {

    }

    public Img(String id, String name, String content, MultipartFile file) {

        this.id = id;
        this.name = name;
        this.content = content;
        this.file = file;
    }
}
