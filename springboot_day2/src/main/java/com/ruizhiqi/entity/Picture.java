package com.ruizhiqi.entity;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Arrays;

public class Picture implements Serializable {

    private String id;
    private String imgContent;
    private String imgPath;
    private String oldName;
    private String newName;
    private MultipartFile[] files;

    @Override
    public String toString() {
        return "Picture{" +
                "id='" + id + '\'' +
                ", imgContent='" + imgContent + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", oldName='" + oldName + '\'' +
                ", newName='" + newName + '\'' +
                ", files=" + (files == null ? null : Arrays.asList(files)) +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgContent() {
        return imgContent;
    }

    public void setImgContent(String imgContent) {
        this.imgContent = imgContent;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }

    public Picture() {
    }

    public Picture(String id, String imgContent, String imgPath, String oldName, String newName, MultipartFile[] files) {

        this.id = id;
        this.imgContent = imgContent;
        this.imgPath = imgPath;
        this.oldName = oldName;
        this.newName = newName;
        this.files = files;
    }
}
