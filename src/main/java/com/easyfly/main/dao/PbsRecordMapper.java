package com.easyfly.main.dao;

import com.easyfly.main.bean.PbsRecord;
import com.easyfly.main.bean.PbsRecordExample;
import com.easyfly.main.bean.PbsRecordWithBLOBs;
import com.easyfly.main.bean.RecordFilterBean;

import java.util.List;

public interface PbsRecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(PbsRecordWithBLOBs record);

    int insertSelective(PbsRecordWithBLOBs record);

    List<PbsRecordWithBLOBs> selectByExampleWithBLOBs(PbsRecordExample example);

    List<PbsRecord> selectByExample(PbsRecordExample example);

    List<PbsRecord> selectByPrimaryCondition(RecordFilterBean filterBean);

    PbsRecordWithBLOBs selectByPrimaryKey(Integer recordId);

    int updateRecordNo(PbsRecord record);

    int updateCheckInfo(PbsRecord record);

    int updateWordUrlInfo(PbsRecord record);

    int updateByPrimaryKeySelective(PbsRecordWithBLOBs record);

    int selectRowNumByCondition(RecordFilterBean filterBean);

    int updateByPrimaryKeyWithBLOBs(PbsRecordWithBLOBs record);

    int updateByPrimaryKey(PbsRecord record);
}