package com.xzsd.app.AppOrder.service;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.AppOrder.dao.AppOrderDao;
import com.xzsd.app.AppOrder.entity.AppOrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AppOrderService {
    @Autowired

    private AppOrderDao appOrderDao;




    /**
     * 查询订单详情
     * @param appOrderInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse getOrder(AppOrderInfo appOrderInfo){

        PageHelper.startPage(appOrderInfo.getPageNum(), appOrderInfo.getPageSize());
        List<AppOrderInfo> appOrderInfoList = appOrderDao.getOrder(appOrderInfo);
        PageInfo<AppOrderInfo> pageData = new PageInfo<>(appOrderInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }



    /**
     * 查询订单评价
     * @param appOrderInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listEvaluate(AppOrderInfo appOrderInfo){

        PageHelper.startPage(appOrderInfo.getPageNum(), appOrderInfo.getPageSize());
        List<AppOrderInfo> appOrderInfoList = appOrderDao.listEvaluate(appOrderInfo);
        PageInfo<AppOrderInfo> pageData = new PageInfo<>(appOrderInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }

    /**
     * 查询商品详情
     * @param appOrderInfo
     * @return
     * @author 刘桂鹏
     */
    public AppResponse listOrder(AppOrderInfo appOrderInfo){

        PageHelper.startPage(appOrderInfo.getPageNum(), appOrderInfo.getPageSize());
        List<AppOrderInfo> appOrderInfoList = appOrderDao.listOrder(appOrderInfo);
        PageInfo<AppOrderInfo> pageData = new PageInfo<>(appOrderInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }

    /**
     * demo 添加订单
     * @param appOrderInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addOrder(AppOrderInfo appOrderInfo){

        appOrderInfo.setIsDeleted(0);
        String shopCode = appOrderInfo.getShopCode();
        int count = appOrderDao.addOrder(appOrderInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        }
        else

            //删除购物车
            appOrderDao.deleteShop(shopCode);
            return AppResponse.success("新增成功");
    }

    /**
     * demo 修改订单状态
     * @param appOrderInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateOrder(AppOrderInfo appOrderInfo){

        appOrderInfo.setIsDeleted(0);
        int count = appOrderDao.updateOrder(appOrderInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        }
        else
            return AppResponse.success("新增成功");
    }

    /**
     * demo 添加商品评价
     * @param appOrderInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addEvaluate(AppOrderInfo appOrderInfo){

        appOrderInfo.setIsDeleted(0);
        int count = appOrderDao.addEvaluate(appOrderInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        }
        else
            return AppResponse.success("新增成功");
    }


}
