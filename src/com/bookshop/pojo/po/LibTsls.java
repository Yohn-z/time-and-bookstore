package com.bookshop.pojo.po;

public class LibTsls {
    private Integer tslsId;

    private Integer tsId;

    private Integer uId;

    private String tslsTime;

    private Double tslsPrice;

    private Integer tslsNum;

    public Integer getTslsId() {
        return tslsId;
    }

    public void setTslsId(Integer tslsId) {
        this.tslsId = tslsId;
    }

    public Integer getTsId() {
        return tsId;
    }

    public void setTsId(Integer tsId) {
        this.tsId = tsId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getTslsTime() {
        return tslsTime;
    }

    public void setTslsTime(String tslsTime) {
        this.tslsTime = tslsTime == null ? null : tslsTime.trim();
    }

    public Double getTslsPrice() {
        return tslsPrice;
    }

    public void setTslsPrice(Double tslsPrice) {
        this.tslsPrice = tslsPrice;
    }

    public Integer getTslsNum() {
        return tslsNum;
    }

    public void setTslsNum(Integer tslsNum) {
        this.tslsNum = tslsNum;
    }
}