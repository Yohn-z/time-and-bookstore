package com.bookshop.pojo.po;

public class LibTslb {
    private String tslbName;

    private Integer tslbId;

    private Integer tslbNum;

    private Integer tslbOnnum;

    public String getTslbName() {
        return tslbName;
    }

    public void setTslbName(String tslbName) {
        this.tslbName = tslbName == null ? null : tslbName.trim();
    }

    public Integer getTslbId() {
        return tslbId;
    }

    public void setTslbId(Integer tslbId) {
        this.tslbId = tslbId;
    }

    public Integer getTslbNum() {
        return tslbNum;
    }

    public void setTslbNum(Integer tslbNum) {
        this.tslbNum = tslbNum;
    }

    public Integer getTslbOnnum() {
        return tslbOnnum;
    }

    public void setTslbOnnum(Integer tslbOnnum) {
        this.tslbOnnum = tslbOnnum;
    }
}