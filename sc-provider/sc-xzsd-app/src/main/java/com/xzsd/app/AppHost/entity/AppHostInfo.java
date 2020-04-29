package com.xzsd.app.AppHost.entity;

import java.util.List;

/**
 * @Description 热门商品实体类
 * @Author 刘桂鹏
 * @Date 2020-04-14
 */
public class AppHostInfo {

        /**
         * 页码
         */
        private int pageSize;
        /**
         * 页数
         */
        private int pageNum;
        /**
         * 订单id
         */
        private String orderCode;
        /**
         * 门店名
         */
        private String storeName;
        /**
         *门店地址
         */
        private String address;
        /**
         * 订单状态
         */
        private String orderState;
        /**
         * 用户id
         */
        private String userCode;
        /**
         * 用户名
         */
        private String userName;
        /**
         * 用户手机
         */
        private String phone;
        /**
         * 订单总价
         */
        private String orderPrice;
        /**
         * 订单商品数量
         */
        private String goodsCount;
        /**
         * 商品id
         */
        private String goodsCode;

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

        List<hostGoodsInfo> hostGoodsInfo;

        public int getPageSize() {
                return pageSize;
        }

        public int getPageNum() {
                return pageNum;
        }

        public String getGoodsCode() {
                return goodsCode;
        }

        public String getOrderCode() {
                return orderCode;
        }

        public String getStoreName() {
                return storeName;
        }

        public String getAddress() {
                return address;
        }

        public List<AppHost.entity.hostGoodsInfo> getHostGoodsInfo() {
                return hostGoodsInfo;
        }

        public String getOrderState() {
                return orderState;
        }

        public String getUserCode() {
                return userCode;
        }

        public String getUserName() {
                return userName;
        }

        public String getPhone() {
                return phone;
        }

        public String getOrderPrice() {
                return orderPrice;
        }

        public String getGoodsCount() {
                return goodsCount;
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
                return version;
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

        public void setOrderCode(String orderCode) {
                this.orderCode = orderCode;
        }

        public void setOrderState(String orderState) {
                this.orderState = orderState;
        }

        public void setUserCode(String userCode) {
                this.userCode = userCode;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public void setHostGoodsInfo(List<AppHost.entity.hostGoodsInfo> hostGoodsInfo) {
                this.hostGoodsInfo = hostGoodsInfo;
        }

        public void setStoreName(String storeName) {
                this.storeName = storeName;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public void setOrderPrice(String orderPrice) {
                this.orderPrice = orderPrice;
        }

        public void setGoodsCount(String goodsCount) {
                this.goodsCount = goodsCount;
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
                this.version = version;
        }
}
