package com.xzsd.app.AppGoods.entity;

import java.util.List;

public class TwoSortInfo {
    /**
     * 分类id
     */
    private String classCode;
    /**
     * 分类名
     */
    private  String className;
    /**
     * 分类id
     */
    private String secondSortCode;
    /**
     * 分类名
     */
    private  String secondSortName;


    private List<AppGoodsInfo> appGoodsInfo;

    public String getClassCode() {
        return classCode;
    }

    public String getClassName() {
        return className;
    }

    public List<AppGoodsInfo> getAppGoodsInfo() {
        return appGoodsInfo;
    }

    public String getSecondSortCode() {
        return secondSortCode;
    }

    public String getSecondSortName() {
        return secondSortName;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAppGoodsInfo(List<AppGoodsInfo> appGoodsInfo) {
        this.appGoodsInfo = appGoodsInfo;
    }

    public void setSecondSortCode(String secondSortCode) {
        this.secondSortCode = secondSortCode;
    }

    public void setSecondSortName(String secondSortName) {
        this.secondSortName = secondSortName;
    }
}
