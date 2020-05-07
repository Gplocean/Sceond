package com.xzsd.app.AppShop.entity;

/**
 * @Description 热门商品实体类
 * @Author 刘桂鹏
 * @Date 2020-04-14
 */
public class AppShopInfo {

        /**
         * 页码
         */
        private int pageSize;
        /**
         * 页数
         */
        private int pageNum;
        /**
         * 购物车id
         */
        private String shopCode;
        /**
         * 门店id
         */
        private String storeCode;
        /**
         * 用户id
         */
        private String userCode;
        /**
         * 选择商品数量
         */
        private String goodsCount;
        /**
         * 商品图片
         */
        private String goodsPath;
        /**
         * 商品价格
         */
        private String goodsPrice;
        /**
         * 商品id
         */
        private String goodsCode;
        /**
         * 商品名
         */
        private String goodsName;
        /**
         * 商品介绍
         */
        private String goodsIntroduction;

        /**
         * 邀请码
         */
        private String inviteCode;
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

        public String getShopCode() {
                return shopCode;
        }

        public String getGoodsCount() {
                return goodsCount;
        }

        public String getGoodsPath() {
                return goodsPath;
        }

        public String getStoreCode() {
                return storeCode;
        }

        public String getUserCode() {
                return userCode;
        }

        public String getGoodsIntroduction() {
                return goodsIntroduction;
        }

        public String getInviteCode() {
                return inviteCode;
        }

        public String getGoodsPrice() {
                return goodsPrice;
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

        public void setStoreCode(String storeCode) {
                this.storeCode = storeCode;
        }

        public void setUserCode(String userCode) {
                this.userCode = userCode;
        }

        public void setGoodsIntroduction(String goodsIntroduction) {
                this.goodsIntroduction = goodsIntroduction;
        }

        public void setInviteCode(String inviteCode) {
                this.inviteCode = inviteCode;
        }

        public void setShopCode(String shopCode) {
                this.shopCode = shopCode;
        }

        public void setGoodsCount(String goodsCount) {
                this.goodsCount = goodsCount;
        }

        public void setGoodsPath(String goodsPath) {
                this.goodsPath = goodsPath;
        }

        public void setGoodsPrice(String goodsPrice) {
                this.goodsPrice = goodsPrice;
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

        public void setVersion(String version) {
                Version = version;
        }
}
