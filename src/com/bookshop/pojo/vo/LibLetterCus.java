package com.bookshop.pojo.vo;

public class LibLetterCus {
    

    private String lMsg;

    private Integer lZt;

    private String lFuser;

    private Integer lWho;

    

    public String getlMsg() {
        return lMsg;
    }

    public void setlMsg(String lMsg) {
        this.lMsg = lMsg == null ? null : lMsg.trim();
    }

    public Integer getlZt() {
        return lZt;
    }

    public void setlZt(Integer lZt) {
        this.lZt = lZt;
    }

    public String getlFuser() {
        return lFuser;
    }

    public void setlFuser(String lFuser) {
        this.lFuser = lFuser == null ? null : lFuser.trim();
    }

    public Integer getlWho() {
        return lWho;
    }

    public void setlWho(Integer lWho) {
        this.lWho = lWho;
    }
}