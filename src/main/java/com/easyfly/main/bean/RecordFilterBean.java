package com.easyfly.main.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class RecordFilterBean {
    private String kyUnitName;
    private String kyrName;

    @JSONField(format="yyyy-MM-dd")
    private Date kyDateBegin;

    @JSONField(format="yyyy-MM-dd")
    private Date kyDateEnd;
    private String recordNo;
    private String recordTitle;
    private int recState;
    private int offset;
    private int limit;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getKyUnitName() {
        return kyUnitName;
    }

    public void setKyUnitName(String kyUnitName) {
        this.kyUnitName = kyUnitName;
    }

    public String getKyrName() {
        return kyrName;
    }

    public void setKyrName(String kyrName) {
        this.kyrName = kyrName;
    }

    public Date getKyDateBegin() {
        return kyDateBegin;
    }

    public void setKyDateBegin(Date kyDateBegin) {
        this.kyDateBegin = kyDateBegin;
    }

    public Date getKyDateEnd() {
        return kyDateEnd;
    }

    public void setKyDateEnd(Date kyDateEnd) {
        this.kyDateEnd = kyDateEnd;
    }

    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo;
    }

    public String getRecordTitle() {
        return recordTitle;
    }

    public void setRecordTitle(String recordTitle) {
        this.recordTitle = recordTitle;
    }

    public int getRecState() {
        return recState;
    }

    public void setRecState(int recState) {
        this.recState = recState;
    }
}
