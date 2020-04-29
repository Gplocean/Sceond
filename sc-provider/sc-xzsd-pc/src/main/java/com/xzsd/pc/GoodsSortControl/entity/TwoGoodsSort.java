package com.xzsd.pc.GoodsSortControl.entity;

public class TwoGoodsSort {

    /**
     * 商品分类id
     */
    private String Code;
    /**
     * 商品分类名称
     */
    private String Name;
    /**
     * 父级编号
     */
    private String Parent;
    /**
     * 备注
     */
    private  String remark;
    /**
     * 删除标记
     */
    private int isDelete;
    /**
     * 版本号
     */
    private String version;
    /**
     * 以下是get set函数
     */


    public String getClassCode() {
        return Code;
    }

    public String getClassName() {
        return Name;
    }

    public String getClassParent() {
        return Parent;
    }

    public String getRemarks() {
        return remark;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public String getVersion() {
        return version;
    }

    public void setClassCode(String classCode) {
        this.Code = classCode;
    }

    public void setClassName(String className) {
        this.Name = className;
    }

    public void setClassParent(String classParent) {
        this.Parent = classParent;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public void setRemarks(String remarks) {
        this.remark = remarks;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
