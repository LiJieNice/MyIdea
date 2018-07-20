package com.ruizhiqi.entity;

import org.springframework.web.multipart.MultipartFile;

public class Fin {

    private String id;
    private String creativeType;  //创意状态

    private String title;//标题
    private String contents;//标题内容

    private String imgContents;//图片信息
    private String imgUrls;//图片存放的路径

    private String landingUrl;//落地页链接
    private String brandName;//品牌名称
    private String logoUrl;//logo图片存放的路径

    private String oldName;//老名字
    private String newName;//新名字
    private String oldLogoName; //logo老名称
    private String newLogoName; //logo新名称

    private MultipartFile[] files;//上传图片的格式

    private MultipartFile file;  //logo图片  单独划分出来，这样不乱




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreativeType() {
        return creativeType;
    }

    public void setCreativeType(String creativeType) {
        this.creativeType = creativeType;
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

    public String getImgUrls() {
        return imgUrls;
    }

    public void setImgUrls(String imgUrls) {
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

    public String getOldLogoName() {
        return oldLogoName;
    }

    public void setOldLogoName(String oldLogoName) {
        this.oldLogoName = oldLogoName;
    }

    public String getNewLogoName() {
        return newLogoName;
    }

    public void setNewLogoName(String newLogoName) {
        this.newLogoName = newLogoName;
    }

    public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public Fin() {

    }

    public Fin(String id, String creativeType, String title, String contents, String imgContents, String imgUrls, String landingUrl, String brandName, String logoUrl, String oldName, String newName, String oldLogoName, String newLogoName, MultipartFile[] files, MultipartFile file) {

        this.id = id;
        this.creativeType = creativeType;
        this.title = title;
        this.contents = contents;
        this.imgContents = imgContents;
        this.imgUrls = imgUrls;
        this.landingUrl = landingUrl;
        this.brandName = brandName;
        this.logoUrl = logoUrl;
        this.oldName = oldName;
        this.newName = newName;
        this.oldLogoName = oldLogoName;
        this.newLogoName = newLogoName;
        this.files = files;
        this.file = file;
    }
}
