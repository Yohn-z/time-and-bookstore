package com.bookshop.pojo.po;

public class LibTsjy {
    private Integer tsjyId;

    private Integer tsId;

    private Integer uId;

    private String tsjyFtime;

    private Integer tsjyNum;

    private Integer jyztId;

    public Integer getTsjyId() {
        return tsjyId;
    }

    public void setTsjyId(Integer tsjyId) {
        this.tsjyId = tsjyId;
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

    public String getTsjyFtime() {
        return tsjyFtime;
    }

    public void setTsjyFtime(String tsjyFtime) {
        this.tsjyFtime = tsjyFtime == null ? null : tsjyFtime.trim();
    }

    public Integer getTsjyNum() {
        return tsjyNum;
    }

    public void setTsjyNum(Integer tsjyNum) {
        this.tsjyNum = tsjyNum;
    }

    public Integer getJyztId() {
        return jyztId;
    }

    public void setJyztId(Integer jyztId) {
        this.jyztId = jyztId;
    }
}