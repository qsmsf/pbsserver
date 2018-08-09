package com.easyfly.main.bean;

import java.util.Date;

public class UploadFileResultBean{
    public class UploadFileResult {
        String id; // 唯一ID
        String fileName; //文件名
        long fileSize; // 文件大小
        String oldFileName;
        String uploadId;
        String partNumber;
        String bucketName;//存储桶名字
        String key; //这个字段是存储在S3服务器的新的文件名,即key
        String serviceID;
        String fileUrl; // 提供下载用的文件URl
        String fileService; //文件服务器地址
        String etagId;
        Date creteaTime; // 文件创建时间
        String extName;// 文件后缀

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public long getFileSize() {
            return fileSize;
        }

        public void setFileSize(long fileSize) {
            this.fileSize = fileSize;
        }

        public String getBucketName() {
            return bucketName;
        }

        public void setBucketName(String bucketName) {
            this.bucketName = bucketName;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getFileUrl() {
            return fileUrl;
        }

        public void setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
        }

        public String getFileService() {
            return fileService;
        }

        public void setFileService(String fileService) {
            this.fileService = fileService;
        }

        public Date getCreteaTime() {
            return creteaTime;
        }

        public void setCreteaTime(Date creteaTime) {
            this.creteaTime = creteaTime;
        }

        public String getExtName() {
            return extName;
        }

        public void setExtName(String extName) {
            this.extName = extName;
        }

        public String getOldFileName() {
            return oldFileName;
        }

        public void setOldFileName(String oldFileName) {
            this.oldFileName = oldFileName;
        }

        public String getUploadId() {
            return uploadId;
        }

        public void setUploadId(String uploadId) {
            this.uploadId = uploadId;
        }

        public String getPartNumber() {
            return partNumber;
        }

        public void setPartNumber(String partNumber) {
            this.partNumber = partNumber;
        }

        public String getServiceID() {
            return serviceID;
        }

        public void setServiceID(String serviceID) {
            this.serviceID = serviceID;
        }

        public String getEtagId() {
            return etagId;
        }

        public void setEtagId(String etagId) {
            this.etagId = etagId;
        }
    }

    int code;
    UploadFileResult data;
    String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public UploadFileResult getData() {
        return data;
    }

    public void setData(UploadFileResult data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}