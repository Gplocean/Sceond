package com.xzsd.pc.StoreControl.entity;

/**
 * @Description 热门商品实体类
 * @Author 刘桂鹏
 * @Date 2020-04-14
 */
public class StoreInfo {

        /**
         * 页码
         */
        private int pageSize;
        /**
         * 页数
         */
        private int pageNum;
        /**
         * 商店id
         */
        private String storeCode;
        /**
         * 商店名
         */
        private String storeName;
        /**
         * 商店名
         */
        private String storeAccount;
        /**
         * 手机号
         */
        private String phone;
        /**
         * 店主id
         */
        private String hostCode;
        /**
         * 店主名
         */
        private String hostName;
        /**
         * 营业执照
         */
        private String license;
        /**
         * 门店账号
         */
        private String storeAcct;
        /**
         * 门店邀请码
         */

        /**
         * 省id
         */
        private String provinceCode;
        /**
         * 城市id
         */
        private String cityCode;
        /**
         * 区域id
         */
        private String areaCode;
        /**
         * 详细地址
         */
        private String address;
        /**
         * 详细地址
         */
        private String driverCode;
        /**
         * 省名
         */
        private String provinceName;
        /**
         * 市名
         */
        private String cityName;
        /**
         * 区域名
         */
        private String areaName;
        /**
         * 父级id
         */
        private String parentCode;
        /**
         * 省市区分类id
         */
        private String sortCode;
        /**
         * 邀请码
         */
        private String inviteCode;
        /**
         * 角色
         */
        private  String role;
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

        public String getStoreCode() {
                return storeCode;
        }

        public String getStoreName() {
                return storeName;
        }

        public String getPhone() {
                return phone;
        }

        public String getHostCode() {
                return hostCode;
        }

        public String getRole() {
                return role;
        }

        public String getLicense() {
                return license;
        }

        public String getProvinceCode() {
                return provinceCode;
        }

        public String getDriverCode() {
                return driverCode;
        }

        public String getInviteCode() {
                return inviteCode;
        }

        public String getCityCode() {
                return cityCode;
        }

        public String getAreaCode() {
                return areaCode;
        }

        public String getAddress() {
                return address;
        }

        public int getIsDeleted() {
                return isDeleted;
        }

        public String getHostName() {
                return hostName;
        }

        public String getStoreAccount() {
                return storeAccount;
        }



        public String getProvinceName() {
                return provinceName;
        }

        public String getCityName() {
                return cityName;
        }

        public String getAreaName() {
                return areaName;
        }

        public String getParentCode() {
                return parentCode;
        }

        public String getSortCode() {
                return sortCode;
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

        public void setStoreCode(String storeCode) {
                this.storeCode = storeCode;
        }

        public void setStoreName(String storeName) {
                this.storeName = storeName;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public void setHostCode(String hostCode) {
                this.hostCode = hostCode;
        }

        public void setLicense(String license) {
                this.license = license;
        }

        public void setProvinceCode(String provinceCode) {
                this.provinceCode = provinceCode;
        }

        public void setCityCode(String cityCode) {
                this.cityCode = cityCode;
        }

        public void setAreaCode(String areaCode) {
                this.areaCode = areaCode;
        }

        public String getStoreAcct() {
                return storeAcct;
        }

        public void setAddress(String address) {
                this.address = address;
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

        public void setStoreAccount(String storeAccount) {
                this.storeAccount = storeAccount;
        }

        public void setHostName(String hostName) {
                this.hostName = hostName;
        }

        public void setRole(String role) {
                this.role = role;
        }

        public void setInviteCode(String inviteCode) {
                this.inviteCode = inviteCode;
        }

        public void setProvinceName(String provinceName) {
                this.provinceName = provinceName;
        }

        public void setCityName(String cityName) {
                this.cityName = cityName;
        }

        public void setAreaName(String areaName) {
                this.areaName = areaName;
        }

        public void setParentCode(String parentCode) {
                this.parentCode = parentCode;
        }

        public void setDriverCode(String driverCode) {
                this.driverCode = driverCode;
        }

        public void setStoreAcct(String storeAcct) {
                this.storeAcct = storeAcct;
        }

        public void setSortCode(String sortCode) {
                this.sortCode = sortCode;
        }

        public void setVersion(String version) {
                this.version = version;
        }
}
