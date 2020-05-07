package com.xzsd.app.AppRole.entity;

/**
 * @Description 热门商品实体类
 * @Author 刘桂鹏
 * @Date 2020-04-14
 */
public class AppRoleInfo {

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
        private String userCode;
        /**
         * 用户原密码
         */
        private String userPwd;
        /**
         * 用户新密码
         */
        private String userNewPwd;
        /**
         * 商品名
         */
        private String userName;
        /**
         * 商品介绍
         */
        private String email;
        /**
         * 商品图片路径
         */
        private String sex;
        /**
         * 商品售价
         */
        private String inviteCode;
        /**
         * 商品评价等级
         */
        private String phone;
        /**
         * 作者
         */
        private String role;
        /**
         *出版社
         */
        private String userPicture;
        /**
         *出版社
         */
        private String idCard;
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
        private String storeCode;
        /**
         * 评价时间
         */
        private String address;
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
        private String version;

        public int getPageSize() {
                return pageSize;
        }

        public int getPageNum() {
                return pageNum;
        }

        public String getUserPwd() {
                return userPwd;
        }

        public String getUserNewPwd() {
                return userNewPwd;
        }

        public String getStoreCode() {
                return storeCode;
        }

        public String getAddress() {
                return address;
        }

        public String getStoreName() {
                return storeName;
        }

        public String getUserCode() {
                return userCode;
        }

        public String getUserName() {
                return userName;
        }

        public String getUserPicture() {
                return userPicture;
        }

        public String getEmail() {
                return email;
        }

        public String getSex() {
                return sex;
        }

        public String getInviteCode() {
                return inviteCode;
        }

        public String getPhone() {
                return phone;
        }

        public String getRole() {
                return role;
        }

        public String getUserAcct() {
                return userAcct;
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
                return version;
        }

        public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
        }

        public void setUserPwd(String userPwd) {
                this.userPwd = userPwd;
        }

        public void setPageNum(int pageNum) {
                this.pageNum = pageNum;
        }


        public void setUserNewPwd(String userNewPwd) {
                this.userNewPwd = userNewPwd;
        }

        public void setStoreName(String storeName) {
                this.storeName = storeName;
        }

        public void setUserCode(String userCode) {
                this.userCode = userCode;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public void setUserPicture(String userPicture) {
                this.userPicture = userPicture;
        }

        public String getIdCard() {
                return idCard;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public void setSex(String sex) {
                this.sex = sex;
        }

        public void setInviteCode(String inviteCode) {
                this.inviteCode = inviteCode;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public void setRole(String role) {
                this.role = role;
        }

        public void setStoreCode(String storeCode) {
                this.storeCode = storeCode;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public void setUserAcct(String userAcct) {
                this.userAcct = userAcct;
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

        public void setVersion(String version) {
                this.version = version;
        }

        public void setIdCard(String idCard) {
                this.idCard = idCard;
        }


}
