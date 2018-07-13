package com.ruizhiqi.entity;

import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

public class ImgFile {

    private String id;
    private MultipartFile[] files;
    private String imgContext;


    @Override
    public String toString() {
        return "ImgFile{" +
                "id='" + id + '\'' +
                ", files=" + (files == null ? null : Arrays.asList(files)) +
                ", imgContext='" + imgContext + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }

    public String getImgContext() {
        return imgContext;
    }

    public void setImgContext(String imgContext) {
        this.imgContext = imgContext;
    }

    public ImgFile() {

    }

    public ImgFile(String id, MultipartFile[] files, String imgContext) {

        this.id = id;
        this.files = files;
        this.imgContext = imgContext;
    }
}
