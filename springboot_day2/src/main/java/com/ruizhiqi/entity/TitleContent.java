package com.ruizhiqi.entity;

import java.io.Serializable;

public class TitleContent implements Serializable {
    private String id;
    private String title;
    private String content;
    private String creativeName;
    private String type;


    @Override
    public String toString() {
        return "TitleContent{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", creativeName='" + creativeName + '\'' +
                ", type='" + type + '\'' +
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

    public TitleContent() {

    }

    public TitleContent(String id, String title, String content, String creativeName, String type) {

        this.id = id;
        this.title = title;
        this.content = content;
        this.creativeName = creativeName;
        this.type = type;
    }
}
