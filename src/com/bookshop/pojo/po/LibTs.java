package com.bookshop.pojo.po;

public class LibTs {
    private Integer tsId;

    private String tslbName;

    private String tsName;

    private String tsAuthor;

    private String tsPublisher;

    private String tsPupblishtime;

    private String tsTime;

    private String tsDetail;

    private Double tsPrice;

    private Integer tsSum;

    private Integer tsOnnum;

    private Integer skztId;

    public Integer getTsId() {
        return tsId;
    }

    public void setTsId(Integer tsId) {
        this.tsId = tsId;
    }

    public String getTslbName() {
        return tslbName;
    }

    public void setTslbName(String tslbName) {
        this.tslbName = tslbName == null ? null : tslbName.trim();
    }

    public String getTsName() {
        return tsName;
    }

    public void setTsName(String tsName) {
        this.tsName = tsName == null ? null : tsName.trim();
    }

    public String getTsAuthor() {
        return tsAuthor;
    }

    public void setTsAuthor(String tsAuthor) {
        this.tsAuthor = tsAuthor == null ? null : tsAuthor.trim();
    }

    public String getTsPublisher() {
        return tsPublisher;
    }

    public void setTsPublisher(String tsPublisher) {
        this.tsPublisher = tsPublisher == null ? null : tsPublisher.trim();
    }

    public String getTsPupblishtime() {
        return tsPupblishtime;
    }

    public void setTsPupblishtime(String tsPupblishtime) {
        this.tsPupblishtime = tsPupblishtime == null ? null : tsPupblishtime.trim();
    }

    public String getTsTime() {
        return tsTime;
    }

    public void setTsTime(String tsTime) {
        this.tsTime = tsTime == null ? null : tsTime.trim();
    }

    public String getTsDetail() {
        return tsDetail;
    }

    public void setTsDetail(String tsDetail) {
        this.tsDetail = tsDetail == null ? null : tsDetail.trim();
    }

    public Double getTsPrice() {
        return tsPrice;
    }

    public void setTsPrice(Double tsPrice) {
        this.tsPrice = tsPrice;
    }

    public Integer getTsSum() {
        return tsSum;
    }

    public void setTsSum(Integer tsSum) {
        this.tsSum = tsSum;
    }

    public Integer getTsOnnum() {
        return tsOnnum;
    }

    public void setTsOnnum(Integer tsOnnum) {
        this.tsOnnum = tsOnnum;
    }

    public Integer getSkztId() {
        return skztId;
    }

    public void setSkztId(Integer skztId) {
        this.skztId = skztId;
    }
}