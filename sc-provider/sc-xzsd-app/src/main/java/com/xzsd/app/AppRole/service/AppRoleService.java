package com.xzsd.app.AppRole.service;




import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;

import com.neusoft.util.StringUtil;
import com.xzsd.app.AppHost.entity.AppHostInfo;
import com.xzsd.app.AppRole.dao.AppRoleDao;
import com.xzsd.app.AppRole.entity.AppRoleInfo;
import com.xzsd.app.utils.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.security.Security;
import java.util.List;

@Service
public class AppRoleService {
    @Resource
    private AppRoleDao appRoleDao;


    /**
     * 查询用户信息
     *
     * @param appRoleInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse getUser(AppRoleInfo appRoleInfo) {
        String userCode = SecurityUtils.getCurrentUserId();
        AppRoleInfo role = appRoleDao.getRole(userCode);
        //查询店长信息
        if ("2".equals(role.getRole())) {
            AppRoleInfo appRoleInfoList1 = appRoleDao.getHost(userCode);
            return AppResponse.success("店长!", appRoleInfoList1);
        }
        //查询司机信息
        else if ("3".equals(role.getRole())) {
            AppRoleInfo appRoleInfoList1 = appRoleDao.getDriver(userCode);
            return AppResponse.success("司机!", appRoleInfoList1);
        }
        //查询司机信息
        else if ("4".equals(role.getRole())) {
            AppRoleInfo appRoleInfoList1 = appRoleDao.getUser(userCode);
            return AppResponse.success("用户!", appRoleInfoList1);
        }
        else return AppResponse.success("用户不存在!");


    }

    /**
     * 修改用户密码
     *
     * @param appRoleInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updatePwd(AppRoleInfo appRoleInfo) {
        AppResponse appResponse = AppResponse.success("修改密码成功！");
        String userCode = SecurityUtils.getCurrentUserId();
        //需要校验原密码是否正确
        String oldPassword = appRoleInfo.getUserPwd();
        if (null != oldPassword && !"".equals(oldPassword)) {
            //获取用户原信息
            String userDetail = appRoleDao.getPwd(userCode);
            if (!PasswordUtils.Password(oldPassword, userDetail)) {
                return AppResponse.versionError("原密码不匹配，请重新输入！");
            }
        }
        //获取新的密码
        String pwd = PasswordUtils.generatePassword(appRoleInfo.getUserNewPwd());
        appRoleInfo.setIsDeleted(0);
        appRoleInfo.setUserCode(userCode);
        appRoleInfo.setUserNewPwd(pwd);
        int count = appRoleDao.updatePwd(appRoleInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("修改密码失败，请重试！");
        }
        return appResponse;
    }

    /**
     * demo 注册
     * @param appRoleInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addUser(AppRoleInfo appRoleInfo){


        appRoleInfo.setUserCode(StringUtil.getCommonCode(2));
        String pwd = PasswordUtils.generatePassword(appRoleInfo.getUserPwd());
        appRoleInfo.setIsDeleted(0);
        appRoleInfo.setUserPwd(pwd);
        int count = appRoleDao.addUser(appRoleInfo);
        if (count == 0) {
            return AppResponse.success("注册失败");
        }
        else
            return AppResponse.success("注册成功");
    }

    /**
     * 修改邀请码
     * @param appRoleInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateInvite(AppRoleInfo appRoleInfo){
        String userCode = SecurityUtils.getCurrentUserId();
        appRoleInfo.setUserCode(userCode);
        int count = appRoleDao.updateInviteCode(appRoleInfo);
        if (count == 0) {
            return AppResponse.success("修改失败");
        }
        else
            return AppResponse.success("修改成功");
    }
}
