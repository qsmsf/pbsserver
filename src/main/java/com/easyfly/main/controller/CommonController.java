package com.easyfly.main.controller;

import cn.gov.szga.userCenter.UserRequest;
import com.alibaba.fastjson.JSON;
import com.easyfly.main.base.controller.BaseController;
import com.easyfly.main.bean.*;
import com.easyfly.main.dao.PrivilegeMapper;
import com.easyfly.main.util.CodeMsg;
import com.easyfly.main.util.JSONUtil;
import com.easyfly.main.util.ReturnJSON;
import com.xinghuo.sso.LoginUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/common")
public class CommonController extends BaseController {

    @Autowired
    private PrivilegeMapper privilegeMapper;
    @Autowired
    private MyProps myProps;

    @ResponseBody
    @RequestMapping("/getInitInfo")
    @CrossOrigin
    public ReturnJSON getInitInfo() {
        if(myProps.getDebugMode()){
            InitInfoBean rsl = new InitInfoBean();
            InitInfoBean.LoginUserInfo userBean = new InitInfoBean.LoginUserInfo();
            userBean.setDepartmentId("111");
            userBean.setDeptCode("4403050005");
            userBean.setDeptName("深圳市公安局南山分局");
            userBean.setJob("刑警");
            userBean.setParentId("222");
            userBean.setPosition("刑警中队副队长");
            userBean.setUserCode("K0676");
            userBean.setUserName("王锐");
            userBean.setAccessToken("ttttttt");
            rsl.setUserInfo(userBean);

            OptionBean option = new OptionBean();
            option.setLabel("崔志岗");
            option.setValue("崔志岗");
            rsl.getUserOptions().add(option);

            OptionBean option2 = new OptionBean();
            option2.setLabel("王锐");
            option2.setValue("王锐");
            rsl.getUserOptions().add(option2);

            OptionBean option3 = new OptionBean();
            option3.setLabel("马光磊");
            option3.setValue("马光磊");
            rsl.getUserOptions().add(option3);

            OptionBean option4 = new OptionBean();
            option4.setLabel("南山分局");
            option4.setValue("南山分局");
            rsl.getUnitOptions().add(option4);
            OptionBean option5 = new OptionBean();
            option5.setLabel("南山派出所");
            option5.setValue("南山派出所");
            rsl.getUnitOptions().add(option5);

            List<RolePrivilegeBean> privList = privilegeMapper.selectButtonPrivilege("administrator");
            List<RolePrivilegeBean> privDataList = privilegeMapper.selectDataPrivilege("administrator");
            List<RolePrivilegeBean> privMenuList = privilegeMapper.selectMenuPrivilege("administrator");
            privList.addAll(privDataList);
            privList.addAll(privMenuList);
            rsl.setPrivList(privList);

            return setReturnJson(rsl, CodeMsg.C604);
        }else{
            LoginUserInfo user = getCurrentUser();
            UserRequest ur = new UserRequest(user.getToken());
            //获取当前登录用户信息
            String result = ur.userInfo(user.getId());
            UserInfoBean loginUser = JSONUtil.parseObject(result,UserInfoBean.class);
            //获取当前用户所属单位的所有成员
            result = ur.userList(loginUser.getDeptCode(),0,1,100,"");
            List<UserInfoBean> userList = JSON.parseArray(result, UserInfoBean.class);
            //获取当前用户所属单位信息
            result = ur.deptInfo(loginUser.getDeptCode());
            DeptInfoBean deptInfo = JSONUtil.parseObject(result, DeptInfoBean.class);
            //获取当前用户所属单位所有下级单位信息
            result = ur.deptList(loginUser.getDeptCode(),1,"");
            List<DeptInfoBean> deptList = JSON.parseArray(result, DeptInfoBean.class);

            InitInfoBean rsl = new InitInfoBean();
            InitInfoBean.LoginUserInfo userBean = new InitInfoBean.LoginUserInfo();
            userBean.setDepartmentId(loginUser.getDepartmentId());
            userBean.setDeptCode(loginUser.getDeptCode());
            userBean.setDeptName(deptInfo.getName());
            userBean.setJob(loginUser.getJob());
            userBean.setParentId(deptInfo.getParentId());
            userBean.setPosition(loginUser.getPosition());
            userBean.setUserCode(loginUser.getUserCode());
            userBean.setUserName(loginUser.getUserName());
            userBean.setAccessToken(user.getToken());
            rsl.setUserInfo(userBean);

            for(UserInfoBean bean:userList){
                OptionBean option = new OptionBean();
                option.setLabel(bean.getUserName());
                option.setValue(bean.getUserName());
                rsl.getUserOptions().add(option);
            }
            for(DeptInfoBean bean:deptList){
                OptionBean option = new OptionBean();
                option.setLabel(bean.getName());
                option.setValue(bean.getName());
                rsl.getUnitOptions().add(option);
            }

            List<RolePrivilegeBean> privList = privilegeMapper.selectButtonPrivilege("administrator");
            List<RolePrivilegeBean> privDataList = privilegeMapper.selectButtonPrivilege("administrator");
            List<RolePrivilegeBean> privMenuList = privilegeMapper.selectButtonPrivilege("administrator");
            privList.addAll(privDataList);
            privList.addAll(privMenuList);
            rsl.setPrivList(privList);

            return setReturnJson(rsl, CodeMsg.C604);
        }


    }

    @ResponseBody
    @RequestMapping("/getInitInfoTest")
    @CrossOrigin
    public ReturnJSON getInitInfoTest() {
//测试用
        InitInfoBean rsl = new InitInfoBean();
        InitInfoBean.LoginUserInfo userBean = new InitInfoBean.LoginUserInfo();
        userBean.setDepartmentId("111");
        userBean.setDeptCode("4403050005");
        userBean.setDeptName("深圳市公安局南山分局");
        userBean.setJob("刑警");
        userBean.setParentId("222");
        userBean.setPosition("刑警中队副队长");
        userBean.setUserCode("K0676");
        userBean.setUserName("王锐");
        userBean.setAccessToken("ttttttt");
        rsl.setUserInfo(userBean);

        OptionBean option = new OptionBean();
        option.setLabel("崔志岗");
        option.setValue("崔志岗");
        rsl.getUserOptions().add(option);

        OptionBean option2 = new OptionBean();
        option2.setLabel("王锐");
        option2.setValue("王锐");
        rsl.getUserOptions().add(option2);

        OptionBean option3 = new OptionBean();
        option3.setLabel("马光磊");
        option3.setValue("马光磊");
        rsl.getUserOptions().add(option3);

        OptionBean option4 = new OptionBean();
        option4.setLabel("南山分局");
        option4.setValue("南山分局");
        rsl.getUnitOptions().add(option4);
        OptionBean option5 = new OptionBean();
        option5.setLabel("南山派出所");
        option5.setValue("南山派出所");
        rsl.getUnitOptions().add(option5);

        List<RolePrivilegeBean> privList = privilegeMapper.selectButtonPrivilege("administrator");
        List<RolePrivilegeBean> privDataList = privilegeMapper.selectDataPrivilege("administrator");
        List<RolePrivilegeBean> privMenuList = privilegeMapper.selectMenuPrivilege("administrator");
        privList.addAll(privDataList);
        privList.addAll(privMenuList);
        rsl.setPrivList(privList);

        return setReturnJson(rsl, CodeMsg.C604);
    }

    @ResponseBody
    @RequestMapping("/getUserList")
    @CrossOrigin
    public ReturnJSON getUserList() {
        LoginUserInfo user = getCurrentUser();

        return setReturnJson("", CodeMsg.C604);
    }

    @ResponseBody
    @RequestMapping("/getUnitList")
    @CrossOrigin
    public ReturnJSON getUnitList() {

        return setReturnJson("", CodeMsg.C604);
    }

    @ResponseBody
    @RequestMapping("/syncUnitUser")
    @CrossOrigin
    public ReturnJSON syncUnitUser() {



        return setReturnJson("成功", CodeMsg.C604);
    }
}
