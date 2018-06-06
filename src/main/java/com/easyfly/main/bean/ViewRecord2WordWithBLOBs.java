package com.easyfly.main.bean;

public class ViewRecord2WordWithBLOBs extends ViewRecord2Word {
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