package com.xzsd.app.AppHost.entity;

public class orderGoodsInfo {
    /**
     * 商品名
     */
    private  String goodsName;
    /**
     * 商品介绍
     */
    private  String goodsIntroduction;
    /**
     * 商品价格
     */
    private  float goodsPrice;
    /**
     * 商品图片
     */
    private  String goodsPicture;
    /**
     * 商品id
     */
    private  String goodsCode;
    /**
     * 商品id
     */
    private  String storeName;
    /**
     * 商品id
     */
    private  String address;
    /**
     * 商品数量
     */
    private  int    goodsCount;

    public String getGoodsName() {
        return goodsName;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getAddress() {
        return address;
    }

    public float getGoodsPrice() {
        return goodsPrice;
    }

    public String getGoodsPicture() {
        return goodsPicture;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public String getGoodsIntroduction() {
        return goodsIntroduction;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setGoodsPrice(float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public void setGoodsPicture(String goodsPicture) {
        this.goodsPicture = goodsPicture;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGoodsIntroduction(String goodsIntroduction) {
        this.goodsIntroduction = goodsIntroduction;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }
}
