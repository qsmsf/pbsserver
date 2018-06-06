package com.easyfly.main.bean;

import java.util.Date;

public class UploadFileResultBean {
    String id; // 唯一ID
    String file_name; //文件名
    long file_size; // 文件大小
    String bucket_name;//存储桶名字
    String key; //这个字段是存储在S3服务器的新的文件名,即key
    String app_code;  // 应用编码
    String file_url; // 提供下载用的文件URl
    String file_service; //文件服务器地址
    Date cretea_time; // 文件创建时间
    String extName;// 文件后缀

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public long getFile_size() {
        return file_size;
    }

    public void setFile_size(long file_size) {
        this.file_size = file_size;
    }

    public String getBucket_name() {
        return bucket_name;
    }

    public void setBucket_name(String bucket_name) {
        this.bucket_name = bucket_name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getApp_code() {
        return app_code;
    }

    public void setApp_code(String app_code) {
        this.app_code = app_code;
    }

    public String getFile_url() {
        return file_url;
    }

    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }

    public String getFile_service() {
        return file_service;
    }

    public void setFile_service(String file_service) {
        this.file_service = file_service;
    }

    public Date getCretea_time() {
        return cretea_time;
    }

    public void setCretea_time(Date cretea_time) {
        this.cretea_time = cretea_time;
    }

    public String getExtName() {
        return extName;
    }

    public void setExtName(String extName) {
        this.extName = extName;
    }
}
