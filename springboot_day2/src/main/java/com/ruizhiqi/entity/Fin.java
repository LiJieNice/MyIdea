package com.ruizhiqi.entity;

import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

public class Fin {

    private String id;
    private String title;
    private String contents;
    private String imgContents;
    private String[] imgUrls;
    private String landingUrl;
    private String brandName;
    private String logoUrl;
    private String oldName;
    private String newName;
    private MultipartFile[] files;

    @Override
    public String toString() {
        return "Fin{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", imgContents='" + imgContents + '\'' +
                ", imgUrls=" + (imgUrls == null ? null : Arrays.asList(imgUrls)) +
                ", landingUrl='" + landingUrl + '\'' +
                ", brandName='" + brandName + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getImgContents() {
        return imgContents;
    }

    public void setImgContents(String imgContents) {
        this.imgContents = imgContents;
    }

    public String[] getImgUrls() {
        return imgUrls;
    }

    public void setImgUrls(String[] imgUrls) {
        this.imgUrls = imgUrls;
    }

    public String getLandingUrl() {
        return landingUrl;
    }

    public void setLandingUrl(String landingUrl) {
        this.landingUrl = landingUrl;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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

    public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }

    public Fin() {

    }

    public Fin(String id, String title, String contents, String imgContents, String[] imgUrls, String landingUrl, String brandName, String logoUrl, String oldName, String newName, MultipartFile[] files) {

        this.id = id;
        this.title = title;
        this.contents = contents;
        this.imgContents = imgContents;
        this.imgUrls = imgUrls;
        this.landingUrl = landingUrl;
        this.brandName = brandName;
        this.logoUrl = logoUrl;
        this.oldName = oldName;
        this.newName = newName;
        this.files = files;
    }
}
