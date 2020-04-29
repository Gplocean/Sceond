package com.xzsd.pc.GoodsSortControl.entity;

import java.util.List;

public class OneGoodsSort {
    /**
     * 商品分类id
     */
    private String classCode;
    /**
     * 商品分类名称
     */
    private String className;
    /**
     * 父级编号
     */
    private String classParent;
    /**
     * 删除标记
     */
    private int isDelete;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 版本号
     */
    private String version;
    /**
     * 二级分类
     */
    private List<TwoGoodsSort> twoGoodsSort;


    /**
     * 以下是get set函数
     */

    public String getClassCode() {
        return classCode;
    }

    public String getClassName() {
        return className;
    }

    public String getClassParent() {
        return classParent;
    }

    public List<TwoGoodsSort> getTwoGoodsSort() {
        return twoGoodsSort;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getVersion() {
        return version;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setClassParent(String classParent) {
        this.classParent = classParent;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public void setTwoGoodsSort(List<TwoGoodsSort> twoGoodsSort) {
        this.twoGoodsSort = twoGoodsSort;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
