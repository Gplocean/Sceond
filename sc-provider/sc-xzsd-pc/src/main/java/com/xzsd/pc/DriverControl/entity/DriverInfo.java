package com.xzsd.pc.DriverControl.entity;
import java.util.Date;

/**
 * @Description 热门商品实体类
 * @Author 刘桂鹏
 * @Date 2020-04-14
 */
public class DriverInfo {

        /**
         * 页码
         */
        private int pageSize;
        /**
         * 页数
         */
        private int pageNum;
        /**
         * 司机id
         */
        private String driverCode;
        /**
         * 司机名
         */
        private String driverName;
        /**
         * 司机账号
         */
        private String driverAccount;
        /**
         * 手机号
         */
        private String phone;
        /**
         * 司机头像
         */
        private String driverImage;
        /**
         * 密码
         */
        private String driverPwd;
        /**
         * 门店邀请码
         */
        private String idCard;
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
         * 省名
         */
        private String provinceName;
        /**
         * 城市名
         */
        private String cityName;
        /**
         * 区域m名
         */
        private String areaName;
        /**
         * 角色
         */
        private String role;

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

        public String getDriverCode() {
                return driverCode;
        }

        public String getDriverName() {
                return driverName;
        }

        public String getPhone() {
                return phone;
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

        public String getDriverImage() {
                return driverImage;
        }

        public String getDriverPwd() {
                return driverPwd;
        }

        public String getIdCard() {
                return idCard;
        }

        public String getVersion() {
                return version;
        }

        public String getRole() {
                return role;
        }

        public String getProvinceCode() {
                return provinceCode;
        }

        public String getCityCode() {
                return cityCode;
        }

        public String getAreaCode() {
                return areaCode;
        }

        public String getDriverAccount() {
                return driverAccount;
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


        public void setProvinceName(String provinceName) {
                this.provinceName = provinceName;
        }

        public void setCityName(String cityName) {
                this.cityName = cityName;
        }

        public void setAreaName(String areaName) {
                this.areaName = areaName;
        }

        public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
        }

        public void setPageNum(int pageNum) {
                this.pageNum = pageNum;
        }

        public void setPhone(String phone) {
                this.phone = phone;
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

        public void setRole(String role) {
                this.role = role;
        }

        public void setDriverCode(String driverCode) {
                this.driverCode = driverCode;
        }

        public void setDriverName(String driverName) {
                this.driverName = driverName;
        }

        public void setDriverAccount(String driverAccount) {
                this.driverAccount = driverAccount;
        }

        public void setDriverImage(String driverImage) {
                this.driverImage = driverImage;
        }

        public void setDriverPwd(String driverPwd) {
                this.driverPwd = driverPwd;
        }

        public void setIdCard(String idCard) {
                this.idCard = idCard;
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
                this.version = version;
        }
}
