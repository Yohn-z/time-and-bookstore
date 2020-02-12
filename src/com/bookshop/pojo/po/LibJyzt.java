package com.bookshop.pojo.po;

public class LibJyzt {
    private Integer jyztId;

    private String jyztName;

    public Integer getJyztId() {
        return jyztId;
    }

    public void setJyztId(Integer jyztId) {
        this.jyztId = jyztId;
    }

    public String getJyztName() {
        return jyztName;
    }

    public void setJyztName(String jyztName) {
        this.jyztName = jyztName == null ? null : jyztName.trim();
    }
}