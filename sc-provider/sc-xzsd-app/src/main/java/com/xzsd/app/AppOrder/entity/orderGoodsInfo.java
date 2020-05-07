package com.xzsd.app.AppOrder.entity;

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
    private String storeCode;
    /**
     * 商品数量
     */
    private  int    goodsCount;

    public String getGoodsName() {
        return goodsName;
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

    public String getStoreCode() {
        return storeCode;
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

    public void setGoodsIntroduction(String goodsIntroduction) {
        this.goodsIntroduction = goodsIntroduction;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }
}
