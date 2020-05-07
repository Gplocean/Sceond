package com.xzsd.app.AppGoods.entity;

/**
 * @Description 热门商品实体类
 * @Author 刘桂鹏
 * @Date 2020-04-14
 */
public class AppGoodsInfo {

        /**
         * 页码
         */
        private int pageSize;
        /**
         * 页数
         */
        private int pageNum;
        /**
         * 商品id
         */
        private String goodsCode;
        /**
         * 商品名
         */
        private String goodsName;
        /**
         * 书号
         */
        private int isBnBookNum;
        /**
         * 商品介绍
         */
        private String goodsIntroduction;
        /**
         * 门店编号
         */
        private String storeCode;
        /**
         * 商品图片路径
         */
        private String goodsPicture;
        /**
         * 商品售价
         */
        private String goodsPrice;
        /**
         * 商品评价等级
         */
        private String goodsEvaluateScore;
        /**
         * 作者
         */
        private String author;
        /**
         *出版社
         */
        private String press;
        /**
         * 店名
         */
        private String storeName;
        /**
         * 用户账号
         */
        private String userAcct;
        /**
         * 评价内容
         */
        private String evaluateContent;
        /**
         * 评价时间
         */
        private String evaluateCreateTime;
        /**
         * 一级分类id
         */
        private String firstSortCode;
        /**
         * 以及分类名
         */
        private String firstSortName;
        /**
         * 二级分类id
         */
        private String secondSortCode;
        /**
         * 二级分类名
         */
        private String secondSortName;
        /**
         * 作废标记 0为正常，1为作废
         */
        private int isDeleted;
        /**
         * 创建时间
         */
        private String gmtCreate;
        /**
         * 创建者
         */
        private String createBy;
        /**
         * 更新时间
         */
        private String gmtModified;
        /**
         * 更新者
         */
        private String lastModifiedBy;

        /**
         * 版本号
         * @return
         */
        private String Version;

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

        public int getIsBnBookNum() {
                return isBnBookNum;
        }

        public String getGoodsIntroduction() {
                return goodsIntroduction;
        }

        public String getGoodsPicture() {
                return goodsPicture;
        }

        public String getGoodsSellPrice() {
                return goodsPrice;
        }

        public String getGoodsEvaluateScore() {
                return goodsEvaluateScore;
        }

        public String getAuthor() {
                return author;
        }

        public String getPress() {
                return press;
        }

        public String getStoreName() {
                return storeName;
        }

        public String getUserAcct() {
                return userAcct;
        }

        public String getEvaluateContent() {
                return evaluateContent;
        }

        public String getEvaluateCreateTime() {
                return evaluateCreateTime;
        }

        public String getFirstSortCode() {
                return firstSortCode;
        }

        public String getFirstSortName() {
                return firstSortName;
        }

        public String getSecondSortCode() {
                return secondSortCode;
        }

        public String getSecondSortName() {
                return secondSortName;
        }

        public int getIsDeleted() {
                return isDeleted;
        }

        public String getGmtCreate() {
                return gmtCreate;
        }

        public String getCreateBy() {
                return createBy;
        }

        public String getGmtModified() {
                return gmtModified;
        }

        public String getLastModifiedBy() {
                return lastModifiedBy;
        }

        public String getVersion() {
                return Version;
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

        public void setIsBnBookNum(int isBnBookNum) {
                this.isBnBookNum = isBnBookNum;
        }

        public void setGoodsIntroduction(String goodsIntroduction) {
                this.goodsIntroduction = goodsIntroduction;
        }

        public void setGoodsPicture(String goodsPicture) {
                this.goodsPicture = goodsPicture;
        }

        public void setGoodsSellPrice(String goodsSellPrice) {
                this.goodsPrice = goodsSellPrice;
        }

        public void setGoodsEvaluateScore(String goodsEvaluateScore) {
                this.goodsEvaluateScore = goodsEvaluateScore;
        }

        public String getStoreCode() {
                return storeCode;
        }

        public String getGoodsPrice() {
                return goodsPrice;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        public void setPress(String press) {
                this.press = press;
        }

        public void setStoreName(String storeName) {
                this.storeName = storeName;
        }

        public void setUserAcct(String userAcct) {
                this.userAcct = userAcct;
        }

        public void setEvaluateContent(String evaluateContent) {
                this.evaluateContent = evaluateContent;
        }

        public void setEvaluateCreateTime(String evaluateCreateTime) {
                this.evaluateCreateTime = evaluateCreateTime;
        }

        public void setFirstSortCode(String firstSortCode) {
                this.firstSortCode = firstSortCode;
        }

        public void setFirstSortName(String firstSortName) {
                this.firstSortName = firstSortName;
        }

        public void setSecondSortCode(String secondSortCode) {
                this.secondSortCode = secondSortCode;
        }

        public void setSecondSortName(String secondSortName) {
                this.secondSortName = secondSortName;
        }

        public void setIsDeleted(int isDeleted) {
                this.isDeleted = isDeleted;
        }

        public void setGmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
        }

        public void setCreateBy(String createBy) {
                this.createBy = createBy;
        }

        public void setGmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
        }

        public void setLastModifiedBy(String lastModifiedBy) {
                this.lastModifiedBy = lastModifiedBy;
        }

        public void setStoreCode(String storeCode) {
                this.storeCode = storeCode;
        }

        public void setGoodsPrice(String goodsPrice) {
                this.goodsPrice = goodsPrice;
        }

        public void setVersion(String version) {
                Version = version;
        }
}
