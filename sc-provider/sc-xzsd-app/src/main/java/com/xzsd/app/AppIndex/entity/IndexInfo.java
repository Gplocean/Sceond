package com.xzsd.app.AppIndex.entity;
import java.util.Date;

/**
 * @Description 热门商品实体类
 * @Author 刘桂鹏
 * @Date 2020-04-14
 */
public class IndexInfo {

        /**
         * 页码
         */
        private int pageSize;
        /**
         * 页数
         */
        private int pageNum;
        /**
         * 首页轮播图路径
         */
        private int slideShowPath;
        /**
         * 商品id
         */
        private String goodsCode;
        /**
         * 商品名
         */
        private String goodsName;
        /**
         * 商品图片路径
         */
        private String goodsImagePath;
        /**
         * 司机头像
         */
        private String goodsPrice;
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
        private String Version;

        public int getPageSize() {
                return pageSize;
        }

        public int getPageNum() {
                return pageNum;
        }

        public int getSlideShowPath() {
                return slideShowPath;
        }

        public String getGoodsCode() {
                return goodsCode;
        }

        public String getGoodsName() {
                return goodsName;
        }

        public String getGoodsImagePath() {
                return goodsImagePath;
        }

        public String getGoodsPrice() {
                return goodsPrice;
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

        public String getVersion() {
                return Version;
        }

        public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
        }

        public void setPageNum(int pageNum) {
                this.pageNum = pageNum;
        }

        public void setSlideShowPath(int slideShowPath) {
                this.slideShowPath = slideShowPath;
        }

        public void setGoodsCode(String goodsCode) {
                this.goodsCode = goodsCode;
        }

        public void setGoodsName(String goodsName) {
                this.goodsName = goodsName;
        }

        public void setGoodsImagePath(String goodsImagePath) {
                this.goodsImagePath = goodsImagePath;
        }

        public void setGoodsPrice(String goodsPrice) {
                this.goodsPrice = goodsPrice;
        }

        public void setIsDeleted(int isDeleted) {
                this.isDeleted = isDeleted;
        }

        public void setGmtCreate(Date gmtCreate) {
                this.gmtCreate = gmtCreate;
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

        public void setVersion(String version) {
                Version = version;
        }
}
