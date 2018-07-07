package com.ruizhiqi.entity;

import java.util.Arrays;

public class Jpg {
    private String id;
    //private String title;
    //private String contents;
    private String imgContents;
    private String[] imgPath;

    @Override
    public String toString() {
        return "Jpg{" +
                "id='" + id + '\'' +
                ", imgContents='" + imgContents + '\'' +
                ", imgPath=" + (imgPath == null ? null : Arrays.asList(imgPath)) +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Jpg() {

    }

    public Jpg(String id, String imgContents, String[] imgPath) {

        this.id = id;
        this.imgContents = imgContents;
        this.imgPath = imgPath;
    }
}
