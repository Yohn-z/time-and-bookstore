package com.bookshop.pojo.po;

public class LibSkzt {
    private Integer skztId;

    private String skztName;

    public Integer getSkztId() {
        return skztId;
    }

    public void setSkztId(Integer skztId) {
        this.skztId = skztId;
    }

    public String getSkztName() {
        return skztName;
    }

    public void setSkztName(String skztName) {
        this.skztName = skztName == null ? null : skztName.trim();
    }
}