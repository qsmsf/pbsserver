package com.easyfly.main.controller;


import com.easyfly.main.base.controller.BaseController;
import com.easyfly.main.bean.*;
import com.easyfly.main.dao.PrivilegeMapper;
import com.easyfly.main.util.CodeMsg;
import com.easyfly.main.util.ReturnJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
    @Transactional
    public ReturnJSON getInitInfo() {
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

}
