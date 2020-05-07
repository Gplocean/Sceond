package com.xzsd.app.AppRole.controller;


import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.AppRole.entity.AppRoleInfo;
import com.xzsd.app.AppRole.service.AppRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
@RequestMapping("/appInformation")
public class AppRoleControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private AppRoleService appRoleService;



    /**
     * 查询商品详情
     * @param appRoleInfo
     * @return
     */
    @PostMapping("/getUser")
    public AppResponse getUser(AppRoleInfo appRoleInfo) {
        try {
            return appRoleService.getUser(appRoleInfo);
        } catch (Exception e) {
            logger.error("查询用户列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询商品详情
     * @param appRoleInfo
     * @return
     */
    @PostMapping("/updatePwd")
    public AppResponse updatePwd(AppRoleInfo appRoleInfo) {
        try {
            return appRoleService.updatePwd(appRoleInfo);
        } catch (Exception e) {
            logger.error("查询商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询商品详情
     * @param appRoleInfo
     * @return
     */
    @PostMapping("/addUser")
    public AppResponse addUser(AppRoleInfo appRoleInfo) {
        try {
            return appRoleService.addUser(appRoleInfo);
        } catch (Exception e) {
            logger.error("查询商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改邀请码
     * @param appRoleInfo
     * @return
     */
    @PostMapping("/updateInviteCode")
    public AppResponse updateInviteCode(AppRoleInfo appRoleInfo) {
        try {
            return appRoleService.updateInvite(appRoleInfo);
        } catch (Exception e) {
            logger.error("查询商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    }

