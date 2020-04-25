package com.xzsd.pc.menu.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.menu.dao.MenuDao;
import com.xzsd.pc.menu.entity.MenuInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName MenuService
 * @Description 菜单管理
 * @Author zhu.qf@neusoft.com
 * @Date 2018/11/28
 */
@Service
public class MenuService {

    @Resource
    private MenuDao menuDao;

    /**
     * menu 新增菜单
     * @param menuInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-04-23
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addMenu(MenuInfo menuInfo) {
        AppResponse appResponse = AppResponse.success("新增成功！");
        // 菜单代码
        menuInfo.setMenuCode(StringUtil.getCommonCode(2));
        menuInfo.setIsDeleted(0);
        // 新增菜单
        int count = menuDao.addMenu(menuInfo);
        if(0 == count) {
            appResponse = AppResponse.bizError("新增失败，请重试！");
        }
        return appResponse;
    }

    /**
     * menu 查询菜单名列表
     * @param menuInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-04-23
     */
    public AppResponse listMenu(MenuInfo menuInfo) {
        List<MenuInfo> menuInfoList = menuDao.listMenu(menuInfo);
        return AppResponse.success("查询成功！",menuInfoList);
    }

    /**
     * menu 按角色查询菜单名列表
     * @param menuInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-04-23
     */
    public AppResponse listMenuHome(MenuInfo menuInfo) {
        if(menuInfo.getRole().equals("2")){
            List<MenuInfo> menuInfoList = menuDao.listMenuHome2(menuInfo);
            return AppResponse.success("查询成功！",menuInfoList);
        }else {
            List<MenuInfo> menuInfoList = menuDao.listMenuHome1(menuInfo);
            return AppResponse.success("查询成功！",menuInfoList);
        }
    }

    /**
     * menu 查询菜单详情
     * @param menuCode
     * @return
     * @Author 刘桂鹏
     * @Date 2020-04-23
     */
    public AppResponse getMenu(String menuCode) {
        MenuInfo menuInfo = menuDao.getMenu(menuCode);
        return AppResponse.success("查询成功！",menuInfo);
    }

    /**
     * menu 修改菜单
     * @param menuInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-04-23
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateMenu(MenuInfo menuInfo) {
        AppResponse appResponse = AppResponse.success("修改成功");
        // 修改菜单信息
        int count = menuDao.updateMenu(menuInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }

    /**
     * menu 删除菜单
     * @param menuCode
     * @param userId
     * @return
     * @Author 刘桂鹏
     * @Date 2020-04-23
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteMenu(String menuCode,String userId) {
        List<String> listCode = Arrays.asList(menuCode.split(","));
        AppResponse appResponse = AppResponse.success("删除成功！");
        // 删除菜单
        int count = menuDao.deleteMenu(listCode,userId);
        if(0 == count) {
            appResponse = AppResponse.bizError("删除失败，请重试！");
        }
        return appResponse;
    }

}
