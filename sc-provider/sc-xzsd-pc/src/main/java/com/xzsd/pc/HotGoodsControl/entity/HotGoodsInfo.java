package com.xzsd.pc.HotGoodsControl.entity;

/**
 * @Description 热门商品实体类
 * @Author 刘桂鹏
 * @Date 2020-04-14
 */

public class HotGoodsInfo {

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
         * 热门商品id
         */
        private String hotGoodsCode;
        /**
         * 商品名
         */
        private String goodsName;
        /**
         * 热门商品序号
         */
        private int hotGoodsNum;
        /**
         * 热门商品展示数量
         */
        private int hotGoodsShowNum;
        /**
         * 商品价格
         */
        private String goodsPrice;
        /**
         * 商品介绍
         */
        private String GoodsIntroduction;
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
        private String version;

        public int getPageSize() {
                return pageSize;
        }

        public int getPageNum() {
                return pageNum;
        }

        public String getGoodsCode() {
                return goodsCode;
        }

        public String getHotGoodsCode() {
                return hotGoodsCode;
        }

        public String getGoodsName() {
                return goodsName;
        }

        public int getHotGoodsNum() {
                return hotGoodsNum;
        }

        public String getGoodsPrice() {
                return goodsPrice;
        }

        public String getGoodsIntroduction() {
                return GoodsIntroduction;
        }

        public int getHotGoodsShowNum() {
                return hotGoodsShowNum;
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

        public String getVersion() {
                return version;
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

        public void setHotGoodsCode(String hotGoodsCode) {
                this.hotGoodsCode = hotGoodsCode;
        }

        public void setGoodsName(String goodsName) {
                this.goodsName = goodsName;
        }

        public void setHotGoodsNum(int hotGoodsNum) {
                this.hotGoodsNum = hotGoodsNum;
        }

        public void setGoodsPrice(String goodsPrice) {
                this.goodsPrice = goodsPrice;
        }

        public void setGoodsIntroduction(String goodsIntroduction) {
                GoodsIntroduction = goodsIntroduction;
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

        public void setHotGoodsShowNum(int hotGoodsShowNum) {
                this.hotGoodsShowNum = hotGoodsShowNum;
        }

        public void setVersion(String version) {
                this.version = version;
        }
}
