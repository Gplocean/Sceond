package com.xzsd.app.AppDriver.entity;
import java.util.Date;

/**
 * @Description 热门商品实体类
 * @Author 刘桂鹏
 * @Date 2020-04-14
 */
public class AppDriverInfo {

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
        private String address;
        /**
         * 首页轮播图路径
         */
        private String phone;
        /**
         * 商品id
         */
        private String storeCode;
        /**
         * 商品名
         */
        private String driverCode;
        /**
         * 商品名
         */
        private String storeName;
        /**
         * 商品图片路径
         */
        private String hostName;
        /**
         * 司机头像
         */
        private String hostPhone;
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

        public int getPageSize() {
                return pageSize;
        }

        public int getPageNum() {
                return pageNum;
        }

        public String getAddress() {
                return address;
        }

        public String getPhone() {
                return phone;
        }

        public String getStoreCode() {
                return storeCode;
        }

        public String getStoreName() {
                return storeName;
        }

        public String getHostName() {
                return hostName;
        }

        public String getHostPhone() {
                return hostPhone;
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
                return version;
        }


        public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
        }

        public void setPageNum(int pageNum) {
                this.pageNum = pageNum;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public void setStoreCode(String storeCode) {
                this.storeCode = storeCode;
        }

        public void setStoreName(String storeName) {
                this.storeName = storeName;
        }

        public void setHostName(String hostName) {
                this.hostName = hostName;
        }

        public void setHostPhone(String hostPhone) {
                this.hostPhone = hostPhone;
        }

        public void setIsDeleted(int isDeleted) {
                this.isDeleted = isDeleted;
        }

        public String getDriverCode() {
                return driverCode;
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

        public void setDriverCode(String driverCode) {
                this.driverCode = driverCode;
        }

        public void setVersion(String version) {
                this.version = version;
        }
}
