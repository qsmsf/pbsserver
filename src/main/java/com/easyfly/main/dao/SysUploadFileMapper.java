package com.easyfly.main.dao;

import com.easyfly.main.bean.SysUploadFile;

import java.util.List;

public interface SysUploadFileMapper {
    int deleteByPrimaryKey(Integer fileId);

    int insert(SysUploadFile record);

    int insertSelective(SysUploadFile record);

    SysUploadFile selectByPrimaryKey(Integer fileId);
    List<SysUploadFile> selectByUuid(String uuid);

    int updateByPrimaryKeySelective(SysUploadFile record);

    int updateByPrimaryKey(SysUploadFile record);
}