package com.xzsd.app.AppOrder.dao;


import com.xzsd.app.AppOrder.entity.AppOrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface AppOrderDao {

     /**
     *查询订单列表
     * @param appOrderInfo
     * @return
     */
    List<AppOrderInfo> listOrder(AppOrderInfo appOrderInfo);
    /**
     *查询订单列表
     * @param appOrderInfo
     * @return
     */
    List<AppOrderInfo> listEvaluate(AppOrderInfo appOrderInfo);

    /**
     * 新增商品评价
     * @param appOrderInfo
     * @return
     */
   int addEvaluate(AppOrderInfo appOrderInfo);

    /**
     * 查询一级分类
     * @param appOrderInfo
     * @return
     */
    int updateOrder(AppOrderInfo appOrderInfo);


    /**
     * 查询订单详情
     * @param appOrderInfo
     * @return
     */
    List<AppOrderInfo> getOrder(AppOrderInfo appOrderInfo);
    /**
     * 新增订单
     * @param appOrderInfo
     * @return
     */
    int addOrder(AppOrderInfo appOrderInfo);


    /**
     * 删除购物车

     * @param orderCode
     * @return
     */
    int deleteShop( String orderCode);

    /**
     * 查询购物车编号
     * @param shopCode
     * @return
     */
    String getUserAcct(String shopCode);

    String getUserPhone(String shopCode);
}


