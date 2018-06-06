package com.easyfly.main.bean;

public class PbsRecordWithBLOBs extends PbsRecord {
    private String kysy;

    private String xcms;

    public String getKysy() {
        return kysy;
    }

    public void setKysy(String kysy) {
        this.kysy = kysy == null ? null : kysy.trim();
    }

    public String getXcms() {
        return xcms;
    }

    public void setXcms(String xcms) {
        this.xcms = xcms == null ? null : xcms.trim();
    }
}