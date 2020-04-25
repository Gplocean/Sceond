package com.xzsd.pc.GoodsControl.entity;



import java.util.Date;

/**
 * @Description 用户实体类
 * @Author dingning
 * @Date 2020-03-21
 */
public class GoodsInfo {
    /**
     * 页码
     */
    private int pageSize;
    /**
     * 页数
     */
    private int pageNum;
    /**
     * 商品代码
     */
    private String goodsCode;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品定价
     */
    private String goodsPricing;
    /**
     * 商品售价
     */
    private String goodsSellPrice;
    /**
     * 销售量
     */
    private String goodsSales;
    /**
     * 一级分类
     */
    private int primaryClass;
    /**
     * 二级分类
     */
    private String secondClass;
    /**
     * 广告词
     */
    private String goodsAd;
    /**
     * 商品介绍
     */
    private String goodsIntroduction;
    /**
     * 商品状态
     */
    private String goodsStatus;
    /**
     * 出版社
     */
    private String press;
    /**
     * 作者
     */
    private String author;
    /**
     * 上架时间
     */
    private String shelfTime;
    /**
     * 商家编码
     */
    private String storeCode;
    /**
     * 商家名称
     */
    private String storeName;
    /***
     * 库存
     */
    private int inventory;
    /**
     * 一级分类
     */
    private  String firstSort;
    /**
     * 分类id
     */
    private  String sortCode;

    /**
     * 父类id
     */
    private  String parentCode;


    /**
     * 二级分类
     */
    private  String secondSort;

    /**
     * 一级分类
     */
    private  String firstSortName;
    /**
     * 二级分类
     */
    private  String secondSortName;
    /**
     * 书号
     */
    private int isBnBookNum;
    /**
     * 商品图片
     */
    private String goodsPicture;

    /**
     * 作废标记 0为正常，1为作废
     */
    private int isDeleted;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 更新时间
     */
    private Date gmtModified;
    /**
     * 更新者
     */
    private String lastModifiedBy;

    /**
     * 版本号
     * @return
     */
    private String version;

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public String getFirstSortName() {
        return firstSortName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public String getSecondSortName() {
        return secondSortName;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public String getPress() {
        return press;
    }

    public String getAuthor() {
        return author;
    }

    public String getShelfTime() {
        return shelfTime;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getGoodsPicture() {
        return goodsPicture;
    }

    public String getFirstSort() {
        return firstSort;
    }

    public String getSecondSort() {
        return secondSort;
    }

    public String getGoodsPricing() {
        return goodsPricing;
    }

    public String getSortCode() {
        return sortCode;
    }

    public String getGoodsSellPrice() {
        return goodsSellPrice;
    }

    public String getGoodsSales() {
        return goodsSales;
    }

    public int getPrimaryClass() {
        return primaryClass;
    }

    public String getSecondClass() {
        return secondClass;
    }

    public String getGoodsAd() {
        return goodsAd;
    }

    public String getGoodsIntroduction() {
        return goodsIntroduction;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public int getInventory() {
        return inventory;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setGoodsPricing(String goodsPricing) {
        this.goodsPricing = goodsPricing;
    }

    public void setGoodsSellPrice(String goodsSellPrice) {
        this.goodsSellPrice = goodsSellPrice;
    }

    public void setGoodsSales(String goodsSales) {
        this.goodsSales = goodsSales;
    }

    public void setPrimaryClass(int primaryClass) {
        this.primaryClass = primaryClass;
    }

    public void setSecondClass(String secondClass) {
        this.secondClass = secondClass;
    }

    public void setGoodsAd(String goodsAd) {
        this.goodsAd = goodsAd;
    }

    public void setGoodsIntroduction(String goodsIntroduction) {
        this.goodsIntroduction = goodsIntroduction;
    }


    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setShelfTime(String shelfTime) {
        this.shelfTime = shelfTime;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setGoodsPicture(String goodsPicture) {
        this.goodsPicture = goodsPicture;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public void setIsBnBookNum(int isBnBookNum) {
        this.isBnBookNum = isBnBookNum;
    }

    public int getIsBnBookNum() {
        return isBnBookNum;
    }

    public void setFirstSortName(String firstSortName) {
        this.firstSortName = firstSortName;
    }

    public void setSecondSortName(String secondSortName) {
        this.secondSortName = secondSortName;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setFirstSort(String firstSort) {
        this.firstSort = firstSort;
    }

    public void setSecondSort(String secondSort) {
        this.secondSort = secondSort;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
}