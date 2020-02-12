package com.bookshop.pojo.po;

public class LibUsers {
    private Integer uId;

    private String uName;

    private String uPass;

    private String uTime;

    private String uSex;

    private String uTel;

    private Double uDebt;

    private String uPicurl;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass == null ? null : uPass.trim();
    }

    public String getuTime() {
        return uTime;
    }

    public void setuTime(String uTime) {
        this.uTime = uTime == null ? null : uTime.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuTel() {
        return uTel;
    }

    public void setuTel(String uTel) {
        this.uTel = uTel == null ? null : uTel.trim();
    }

    public Double getuDebt() {
        return uDebt;
    }

    public void setuDebt(Double uDebt) {
        this.uDebt = uDebt;
    }

    public String getuPicurl() {
        return uPicurl;
    }

    public void setuPicurl(String uPicurl) {
        this.uPicurl = uPicurl == null ? null : uPicurl.trim();
    }
}