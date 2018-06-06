package com.easyfly.main.bean;

import java.util.Date;

public class SysUploadFile {
    private Integer fileId;

    private String fileName;

    private String fileHint;

    private String fileUrl;

    private String fileUploader;

    private Date fileUploadTime;

    private Integer recordId;

    private Integer fileType;

    private String recUuid;

    private String thumbnailUrl;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileHint() {
        return fileHint;
    }

    public void setFileHint(String fileHint) {
        this.fileHint = fileHint == null ? null : fileHint.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public String getFileUploader() {
        return fileUploader;
    }

    public void setFileUploader(String fileUploader) {
        this.fileUploader = fileUploader == null ? null : fileUploader.trim();
    }

    public Date getFileUploadTime() {
        return fileUploadTime;
    }

    public void setFileUploadTime(Date fileUploadTime) {
        this.fileUploadTime = fileUploadTime;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public String getRecUuid() {
        return recUuid;
    }

    public void setRecUuid(String recUuid) {
        this.recUuid = recUuid == null ? null : recUuid.trim();
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl == null ? null : thumbnailUrl.trim();
    }
}