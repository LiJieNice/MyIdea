package com.ruizhiqi.entity;

public class Originality {
    private String id;
    private String title;
    private String content;
    private String img;
    private String imgContent;
    private String oldName;
    private String newName;

    @Override
    public String toString() {
        return "Originality{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", img='" + img + '\'' +
                ", imgContent='" + imgContent + '\'' +
                ", oldName='" + oldName + '\'' +
                ", newName='" + newName + '\'' +
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImgContent() {
        return imgContent;
    }

    public void setImgContent(String imgContent) {
        this.imgContent = imgContent;
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

    public Originality() {

    }

    public Originality(String id, String title, String content, String img, String imgContent, String oldName, String newName) {

        this.id = id;
        this.title = title;
        this.content = content;
        this.img = img;
        this.imgContent = imgContent;
        this.oldName = oldName;
        this.newName = newName;
    }
}
