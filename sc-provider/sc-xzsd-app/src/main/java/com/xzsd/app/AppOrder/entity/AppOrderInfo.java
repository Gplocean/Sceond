package com.xzsd.app.AppOrder.entity;

/**
 * @Description 热门商品实体类
 * @Author 刘桂鹏
 * @Date 2020-04-14
 */
public class AppOrderInfo {

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
         * 选择商品数量
         */
        private String goodsCount;
        /**
         * 商品id
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
         * 书号
         */

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