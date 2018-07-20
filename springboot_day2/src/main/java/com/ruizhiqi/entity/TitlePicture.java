package com.ruizhiqi.entity;

import java.io.Serializable;

public class TitlePicture implements Serializable {

    private String id;
    private String title;
    private String content;
    private String creativeName;
    private String type;
    private String imgContent;
    private String imgPath;

    @Override
    public String toString() {
        return "TitlePicture{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", creativeName='" + creativeName + '\'' +
                ", type='" + type + '\'' +
                ", imgContent='" + imgContent + '\'' +
                ", imgPath='" + imgPath + '\'' +
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreativeName() {
        return creativeName;
    }

    public void setCreativeName(String creativeName) {
        this.creativeName = creativeName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public TitlePicture() {

    }

    public TitlePicture(String id, String title, String content, String creativeName, String type, String imgContent, String imgPath) {

        this.id = id;
        this.title = title;
        this.content = content;
        this.creativeName = creativeName;
        this.type = type;
        this.imgContent = imgContent;
        this.imgPath = imgPath;
    }
}
