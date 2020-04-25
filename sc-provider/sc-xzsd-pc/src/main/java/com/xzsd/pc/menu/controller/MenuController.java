package com.xzsd.pc.menu.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.AuthUtils;
import com.xzsd.pc.menu.entity.MenuInfo;
import com.xzsd.pc.menu.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName MenuController
 * @Description 菜单管理
 * @Author 刘桂鹏
 * @Date 2020-04-23
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    private static final Logger logger = LoggerFactory.getLogger(MenuController.class);

    @Resource
    private MenuService menuService;

    /**
     * menuInfo 新增菜单
     * @param
     * @return AppResponse
     * @author 刘桂鹏
     * @Date 2020-04-23
     */
    @PostMapping("addMenu")
    public AppResponse addMenu(MenuInfo menuInfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            menuInfo.setCreateBy(userId);
            AppResponse appResponse = menuService.addMenu(menuInfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("菜单新增失败，请重试！", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * menu 菜单名列表
     * @param menuInfo
     * @return AppResponse
     * @author 刘桂鹏
     * @Date 2020-04-23
     */
    @RequestMapping(value = "listMenu")
    public AppResponse listMenu(MenuInfo menuInfo) {
        try {
            return menuService.listMenu(menuInfo);
        } catch (Exception e) {
            logger.error("查询菜单名列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * menu 菜单名列表
     * @param menuInfo
     * @return AppResponse
     * @author 刘桂鹏
     * @Date 2020-04-23
     */
    @RequestMapping(value = "listMenuHome")
    public AppResponse listMenuHome(MenuInfo menuInfo) {
        try {
            return menuService.listMenuHome(menuInfo);
        } catch (Exception e) {
            logger.error("查询菜单名列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * menu 查询菜单详情
     * @param menuCode
     * @return AppResponse
     * @author 刘桂鹏
     * @Date 2020-04-23
     */
    @RequestMapping(value = "getMenu")
    public AppResponse getMenu(String menuCode) {
        try {
            return menuService.getMenu(menuCode);
        } catch (Exception e) {
            logger.error("菜单查询错误！", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * menu 修改菜单
     * @param menuInfo
     * @return AppResponse
     * @author 刘桂鹏
     * @Date 2020-04-23
     */
    @PostMapping("updateMenu")
    public AppResponse updateMenu(MenuInfo menuInfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            menuInfo.setCreateBy(userId);
            menuInfo.setLastModifiedBy(userId);
            return menuService.updateMenu(menuInfo);
        } catch (Exception e) {
            logger.error("修改菜单信息错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * menu 删除菜单
     * @param menuCode
     * @return AppResponse
     * @author 刘桂鹏
     * @Date 2020-04-23
     */
    @PostMapping("deleteMenu")
    public AppResponse deleteMenu(String menuCode) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            return menuService.deleteMenu(menuCode,userId);
        } catch (Exception e) {
            logger.error("菜单删除错误！", e);
            System.out.println(e.toString());
            throw e;
        }
    }

}
