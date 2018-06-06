package com.easyfly.main.dao;

import com.easyfly.main.bean.WxUser;

public interface WxUserMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(WxUser record);

    int insertSelective(WxUser record);

    WxUser selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(WxUser record);

    int updateByPrimaryKey(WxUser record);
}