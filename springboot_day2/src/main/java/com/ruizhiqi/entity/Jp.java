package com.ruizhiqi.entity;

import java.util.Arrays;

public class Jp {
    private String id;
    private String title;  //标题
    private String contents;  //标题内容
    private String imgContents;  //图片信息
    private String[] imgPath;       //图片路径
    private String url;  //落地页链接
    private String logo;  //品牌名称
    private String imgLogo;  //品牌 logo


    @Override
    public String toString() {
        return "Jp{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", imgContents='" + imgContents + '\'' +
                ", imgPath=" + (imgPath == null ? null : Arrays.asList(imgPath)) +
                ", url='" + url + '\'' +
                ", logo='" + logo + '\'' +
                ", imgLogo='" + imgLogo + '\'' +
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

    public String[] getImgPath() {
        return imgPath;
    }

    public void setImgPath(String[] imgPath) {
        this.imgPath = imgPath;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getImgLogo() {
        return imgLogo;
    }

    public void setImgLogo(String imgLogo) {
        this.imgLogo = imgLogo;
    }

    public Jp() {

    }

    public Jp(String id, String title, String contents, String imgContents, String[] imgPath, String url, String logo, String imgLogo) {

        this.id = id;
        this.title = title;
        this.contents = contents;
        this.imgContents = imgContents;
        this.imgPath = imgPath;
        this.url = url;
        this.logo = logo;
        this.imgLogo = imgLogo;
    }
}
