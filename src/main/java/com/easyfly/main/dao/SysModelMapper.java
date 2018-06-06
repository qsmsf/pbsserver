package com.easyfly.main.dao;

import com.easyfly.main.bean.SysModel;

public interface SysModelMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(SysModel record);

    int insertSelective(SysModel record);

    SysModel selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(SysModel record);

    int updateByPrimaryKey(SysModel record);
}