package com.xzsd.app.AppOrder.entity;

import java.util.List;

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
         * 店名
         */
        private String storeName;
        /**
         * 用户账号
         */
        private String userAcct;
        /**
         * 用户图片
         */
        private String userPicture;
        /**
         * 商品图片
         */
        private String goodsPrice;
        /**
         * 商品id
         */
        private String goodsCode;
        /**
         * 商品数量
         */
        private String goodsCount;
        /**
         * 门店编号
         */
        private String storeCode;
        /**
         * 评价
         */
        private String evaluate;
        /**
         * 评价等级
         */
        private String evaluateScore;
        /**
         * 商品图片
         */
        private String goodsPicture;
        /**
         * 图片序号
         */
        private String pictureNum;
        /**
         * 购物车id
         */
        private String shopCode;
        /**
         * 邀请码
         */
        private String inviteCode;
        /**
         * 下单人id
         */
        private String userCode;
        /**
         * 下单人手机
         */
        private String phone;
        /**
         * 详细地址
         */
        private String address;
        /**
         * 订单商品数量
         */
        private int orderGoodsCount;
        /**
         * 订单价格
         */
        private String orderPrice;
        /**
         * 订单状态
         */
        private String orderState;
        /**
         * 订单id
         */
        private String orderCode;
        /**
         * 订单创建时间
         */
        private String createTime;

        private List<orderGoodsInfo> orderGoodsInfo;
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

        public List<orderGoodsInfo> getOrderGoodsInfo() {
                return orderGoodsInfo;
        }

    public String getShopCode() {
        return shopCode;
    }

    public int getPageSize() {
                return pageSize;
        }

    public String getUserAcct() {
        return userAcct;
    }

    public String getUserCode() {
        return userCode;
    }

    public int getPageNum() {
                return pageNum;
        }

        public String getStoreName() {
                return storeName;
        }

        public String getEvaluate() {
                return evaluate;
        }

        public String getEvaluateScore() {
                return evaluateScore;
        }

        public String getGoodsPicture() {
                return goodsPicture;
        }

        public String getPictureNum() {
                return pictureNum;
        }

        public String getAddress() {
                return address;
        }

    public String getUserPicture() {
        return userPicture;
    }

    public String getPhone() {
        return phone;
    }

    public String getGoodsPrice() {
                return goodsPrice;
        }

        public String getGoodsCode() {
                return goodsCode;
        }

        public String getGoodsCount() {
                return goodsCount;
        }

        public String getStoreCode() {
                return storeCode;
        }

        public int getOrderGoodsCount() {
                return orderGoodsCount;
        }

        public String getOrderPrice() {
                return orderPrice;
        }

        public String getOrderState() {
                return orderState;
        }

        public String getOrderCode() {
                return orderCode;
        }

        public String getCreateTime() {
                return createTime;
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

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getVersion() {
                return version;
        }

        public void setOrderGoodsInfo(List<orderGoodsInfo> orderGoodsInfo) {
                this.orderGoodsInfo = orderGoodsInfo;
        }

        public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
        }

        public void setPageNum(int pageNum) {
                this.pageNum = pageNum;
        }

        public void setStoreName(String storeName) {
                this.storeName = storeName;
        }

        public void setEvaluate(String evaluate) {
                this.evaluate = evaluate;
        }

        public void setEvaluateScore(String evaluateScore) {
                this.evaluateScore = evaluateScore;
        }

        public void setGoodsPicture(String goodsPicture) {
                this.goodsPicture = goodsPicture;
        }

        public void setPictureNum(String pictureNum) {
                this.pictureNum = pictureNum;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public void setGoodsCode(String goodsCode) {
                this.goodsCode = goodsCode;
        }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setGoodsCount(String goodsCount) {
                this.goodsCount = goodsCount;
        }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStoreCode(String storeCode) {
                this.storeCode = storeCode;
        }

        public void setOrderGoodsCount(int orderGoodsCount) {
                this.orderGoodsCount = orderGoodsCount;
        }

        public void setOrderPrice(String orderPrice) {
                this.orderPrice = orderPrice;
        }

        public void setGoodsPrice(String goodsPrice) {
                this.goodsPrice = goodsPrice;
        }

        public void setOrderState(String orderState) {
                this.orderState = orderState;
        }

        public void setOrderCode(String orderCode) {
                this.orderCode = orderCode;
        }

        public void setCreateTime(String createTime) {
                this.createTime = createTime;
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

    public void setUserAcct(String userAcct) {
        this.userAcct = userAcct;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public void setVersion(String version) {
                this.version = version;
        }
}


