package com.xzsd.app.AppShop.dao;


import com.xzsd.app.AppShop.entity.AppShopInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AppShopDao {

     /**
     *查询购物车
     * @param appShopInfo
     * @return
     */
    List<AppShopInfo> listShop(AppShopInfo appShopInfo);


    /**
     * 删除购物车
     * @param appShopInfo
     * @return
     */
   int deleteShop(AppShopInfo appShopInfo);

    /**
     * 查询一级分类
     * @param appShopInfo
     * @return
     */
    int updateShop(AppShopInfo appShopInfo);


    /**
     * 新增购物车
     * @param appShopInfo
     * @return
     */
    int addAppShop(AppShopInfo appShopInfo);


}
