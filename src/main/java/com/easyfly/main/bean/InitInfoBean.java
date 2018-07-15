package com.easyfly.main.bean;


import java.util.ArrayList;
import java.util.List;

public class InitInfoBean {
    public static class LoginUserInfo{
        private String userCode;
        private String userName;
        private String position;
        private String departmentId;
        private String job;
        private String deptCode;
        private String parentId;
        private String deptName;
        private String accessToken;

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public String getUserCode() {
            return userCode;
        }

        public void setUserCode(String userCode) {
            this.userCode = userCode;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getDeptCode() {
            return deptCode;
        }

        public void setDeptCode(String deptCode) {
            this.deptCode = deptCode;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public String getDeptName() {
            return deptName;
        }

        public void setDeptName(String deptName) {
            this.deptName = deptName;
        }
    }

    private LoginUserInfo userInfo;
    private List<OptionBean> userOptions;
    private List<OptionBean> unitOptions;
    private List<RolePrivilegeBean> privList;

    public InitInfoBean(){
        this.userInfo = new LoginUserInfo();
        this.userOptions = new ArrayList<>();
        this.unitOptions = new ArrayList<>();
    }

    public List<RolePrivilegeBean> getPrivList() {
        return privList;
    }

    public void setPrivList(List<RolePrivilegeBean> privList) {
        this.privList = privList;
    }

    public LoginUserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(LoginUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<OptionBean> getUserOptions() {
        return userOptions;
    }

    public void setUserOptions(List<OptionBean> userOptions) {
        this.userOptions = userOptions;
    }

    public List<OptionBean> getUnitOptions() {
        return unitOptions;
    }

    public void setUnitOptions(List<OptionBean> unitOptions) {
        this.unitOptions = unitOptions;
    }
}
