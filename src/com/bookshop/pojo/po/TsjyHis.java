package com.bookshop.pojo.po;

public class TsjyHis {
    private Integer tsjyId;

    private Integer tsId;

    private Integer uId;

    private String tsjyStime;

    private String tsjyFtime;

    private Integer tsjyNum;

    private Integer jyztId;

    private Double tsjyCost;

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

    public String getTsjyStime() {
        return tsjyStime;
    }

    public void setTsjyStime(String tsjyStime) {
        this.tsjyStime = tsjyStime == null ? null : tsjyStime.trim();
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

    public Double getTsjyCost() {
        return tsjyCost;
    }

    public void setTsjyCost(Double tsjyCost) {
        this.tsjyCost = tsjyCost;
    }
}