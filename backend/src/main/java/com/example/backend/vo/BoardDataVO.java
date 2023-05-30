package com.example.backend.vo;

import java.sql.Date;

public class BoardDataVO {

    private String id;
    private String typeId;
    private String title;
    private String content;
    private String categoryId;
    private String registerId;
    private String registerName;
    private Date registerDate;
    private String updaterId;
    private String updateName;
    private Date updateDate;
    private int hitcount;
    private Date postDate;
    private String postYn;
    private int commentCount;
    private int likeCount;
    private String pinToTop;
    private int version;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTypeId() {
        return typeId;
    }
    public void setTypeId(String typeId) {
        this.typeId = typeId;
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
    public String getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    public String getRegisterId() {
        return registerId;
    }
    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }
    public String getRegisterName() {
        return registerName;
    }
    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }
    public Date getRegisterDate() {
        return registerDate;
    }
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
    public String getUpdaterId() {
        return updaterId;
    }
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }
    public String getUpdateName() {
        return updateName;
    }
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }
    public Date getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    public int getHitcount() {
        return hitcount;
    }
    public void setHitcount(int hitcount) {
        this.hitcount = hitcount;
    }
    public Date getPostDate() {
        return postDate;
    }
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
    public String getPostYn() {
        return postYn;
    }
    public void setPostYn(String postYn) {
        this.postYn = postYn;
    }
    public int getCommentCount() {
        return commentCount;
    }
    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
    public int getLikeCount() {
        return likeCount;
    }
    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
    public String getPinToTop() {
        return pinToTop;
    }
    public void setPinToTop(String pinToTop) {
        this.pinToTop = pinToTop;
    }
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }

    
    
}
