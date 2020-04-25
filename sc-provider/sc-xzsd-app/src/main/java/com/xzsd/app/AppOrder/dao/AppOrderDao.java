package com.xzsd.app.AppOrder.dao;


import com.xzsd.app.AppOrder.entity.AppOrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AppOrderDao {

     /**
     *查询购物车
     * @param appOrderInfo
     * @return
     */
    List<AppOrderInfo> listShop(AppOrderInfo appOrderInfo);


    /**
     * 删除购物车
     * @param appOrderInfo
     * @return
     */
   int deleteShop(AppOrderInfo appOrderInfo);

    /**
     * 查询一级分类
     * @param appOrderInfo
     * @return
     */
    AppOrderInfo updateShop(AppOrderInfo appOrderInfo);


    /**
     * 新增购物车
     * @param appOrderInfo
     * @return
     */
    int addShop(AppOrderInfo appOrderInfo);


}
