package com.easyfly.main.dao;

import com.easyfly.main.bean.Privilege;
import com.easyfly.main.bean.RolePrivilegeBean;

import java.util.List;

public interface PrivilegeMapper {
    int deleteByPrimaryKey(Integer privilegeId);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    Privilege selectByPrimaryKey(Integer privilegeId);

    List<RolePrivilegeBean> selectButtonPrivilege(String param);
    List<RolePrivilegeBean> selectDataPrivilege(String param);
    List<RolePrivilegeBean> selectMenuPrivilege(String param);

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKey(Privilege record);
}