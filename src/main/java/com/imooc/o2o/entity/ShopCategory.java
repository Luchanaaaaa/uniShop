package com.imooc.o2o.entity;

public class ShopCategory {
    // ID
    private Long shopCategoryId;
    // Name
    private String shopCategoryName;
    // Description
    private String shopCategoryDesc;
    // Image
    private String shopCategoryImg;
    // Priority
    private Integer priority;
    // Create time
    private java.util.Date createTime;
    // Update time
    private java.util.Date lastEditTime;
    // Parent category
    private ShopCategory parent;

    public Long getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(Long shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    public String getShopCategoryName() {
        return shopCategoryName;
    }

    public void setShopCategoryName(String shopCategoryName) {
        this.shopCategoryName = shopCategoryName;
    }

    public String getShopCategoryDesc() {
        return shopCategoryDesc;
    }

    public void setShopCategoryDesc(String shopCategoryDesc) {
        this.shopCategoryDesc = shopCategoryDesc;
    }

    public String getShopCategoryImg() {
        return shopCategoryImg;
    }

    public void setShopCategoryImg(String shopCategoryImg) {
        this.shopCategoryImg = shopCategoryImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public java.util.Date getCreateTime() {
        return createTime;
    }


    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }



    public java.util.Date getLastEditTime() {
        return lastEditTime;
    }


    public void setLastEditTime(java.util.Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }


    public ShopCategory getParent() {
        return parent;
    }


    public void setParent(ShopCategory parent) {
        this.parent = parent;
    }

}
