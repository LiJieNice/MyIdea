package com.ruizhiqi.entity;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class Logo implements Serializable {

    private String id;
    private String url;  //落地页链接
    private String logoName;  //品牌名称
    private String logoUrl;
    private String oldName;
    private String newName;
    private MultipartFile file;


    @Override
    public String toString() {
        return "Logo{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", logoName='" + logoName + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", oldName='" + oldName + '\'' +
                ", newName='" + newName + '\'' +
                ", file=" + file +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogoName() {
        return logoName;
    }

    public void setLogoName(String logoName) {
        this.logoName = logoName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
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

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public Logo() {

    }

    public Logo(String id, String url, String logoName, String logoUrl, String oldName, String newName, MultipartFile file) {

        this.id = id;
        this.url = url;
        this.logoName = logoName;
        this.logoUrl = logoUrl;
        this.oldName = oldName;
        this.newName = newName;
        this.file = file;
    }
}
