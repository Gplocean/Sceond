package com.xzsd.pc.menu.dao;

import com.xzsd.pc.menu.entity.MenuInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName MenuDao
 * @Description 菜单管理
 * @Author 刘桂鹏
 * @Date 2018/11/28
 */
@Mapper
public interface MenuDao {

    /**
     * 新增菜单
     * @param menuInfo 菜单信息
     * @return
     */
    int addMenu(MenuInfo menuInfo);

    /**
     * 查询全部菜单
     * @return 菜单集合
     */
    List<MenuInfo> listMenu(MenuInfo menuInfo);

    /**
     * 查询全部菜单(按角色)
     * @return 菜单集合
     */
    List<MenuInfo> listMenuHome1(MenuInfo menuInfo);
    List<MenuInfo> listMenuHome2(MenuInfo menuInfo);

    /**
     * 查询菜单信息
     * @param menuCode 菜单编号
     * @return 修改结果
     */
    MenuInfo getMenu(@Param("menuCode") String menuCode);

    /**
     * 修改菜单
     * @param menuInfo 菜单信息
     * @return
     */
    int updateMenu(MenuInfo menuInfo);

    /**
     * 删除菜单
     * @param listCode
     * @param userId
     * @return
     */
    int deleteMenu(@Param("listCode") List<String> listCode,@Param("userId") String userId);

}
