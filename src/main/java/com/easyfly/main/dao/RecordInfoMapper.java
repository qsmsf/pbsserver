package com.easyfly.main.dao;

import com.easyfly.main.bean.RecordInfo;

public interface RecordInfoMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(RecordInfo record);

    int insertSelective(RecordInfo record);

    RecordInfo selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(RecordInfo record);

    int updateByPrimaryKey(RecordInfo record);
}