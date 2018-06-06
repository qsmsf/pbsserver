package com.easyfly.main.bean;

public class Privilege {
    private Integer privilegeId;

    private String privilegeMaster;

    private Integer privilegeValue;

    private String privilegeAccess;

    private Integer privilegeAccessValue;

    private Boolean privilegeOperation;

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getPrivilegeMaster() {
        return privilegeMaster;
    }

    public void setPrivilegeMaster(String privilegeMaster) {
        this.privilegeMaster = privilegeMaster == null ? null : privilegeMaster.trim();
    }

    public Integer getPrivilegeValue() {
        return privilegeValue;
    }

    public void setPrivilegeValue(Integer privilegeValue) {
        this.privilegeValue = privilegeValue;
    }

    public String getPrivilegeAccess() {
        return privilegeAccess;
    }

    public void setPrivilegeAccess(String privilegeAccess) {
        this.privilegeAccess = privilegeAccess == null ? null : privilegeAccess.trim();
    }

    public Integer getPrivilegeAccessValue() {
        return privilegeAccessValue;
    }

    public void setPrivilegeAccessValue(Integer privilegeAccessValue) {
        this.privilegeAccessValue = privilegeAccessValue;
    }

    public Boolean getPrivilegeOperation() {
        return privilegeOperation;
    }

    public void setPrivilegeOperation(Boolean privilegeOperation) {
        this.privilegeOperation = privilegeOperation;
    }
}