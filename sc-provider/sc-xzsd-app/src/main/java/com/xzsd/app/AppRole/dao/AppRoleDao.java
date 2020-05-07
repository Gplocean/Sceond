package com.xzsd.app.AppRole.dao;


import com.xzsd.app.AppRole.entity.AppRoleInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface AppRoleDao {

     /**
     *修改邀请码
     * @param appRoleInfo
     * @return
     */
    int updateInviteCode(AppRoleInfo appRoleInfo);

    /**
     * 查询用户信息
     * @param appRoleInfo
     * @return
     */
    AppRoleInfo getUser(String appRoleInfo);

    /**
     * 查询司机信息
     * @param appRoleInfo
     * @return
     */
    AppRoleInfo getDriver(String appRoleInfo);


    /**
     * 查询店长信息
     * @param appRoleInfo
     * @return
     */
    AppRoleInfo getHost(String appRoleInfo);

    /**
     * 用户注册
     * @param appRoleInfo
     * @return
     */
    int addUser(AppRoleInfo appRoleInfo);
    /**
     *修改密码
     * @param appRoleInfo
     * @return
     */
    int updatePwd(AppRoleInfo appRoleInfo);

    /**
     * 获取当前登录角色
     * @param appRoleInfo
     * @return
     */
    AppRoleInfo getRole(String appRoleInfo);
    /**
     * 获取当前登录人密码
     * @param appRoleInfo
     * @return
     */
    String getPwd(String appRoleInfo);
}
