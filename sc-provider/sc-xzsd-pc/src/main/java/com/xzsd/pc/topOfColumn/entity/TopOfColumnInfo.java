package com.xzsd.pc.topOfColumn.entity;


/**
 * @author liuguipeng
 */
public class TopOfColumnInfo {
    /**
     * 用户代码
     */
    private String userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户头像地址
     */
    private String userImage;
    /**
     * 角色1表示管理员，2表示店长
     */
    private String role;

    /**
     * 以下是get set函数
     */

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}