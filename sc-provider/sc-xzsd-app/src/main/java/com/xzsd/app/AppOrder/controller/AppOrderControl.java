package com.xzsd.app.AppOrder.controller;


import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.AppOrder.entity.AppOrderInfo;
import com.xzsd.app.AppOrder.service.AppOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
@RequestMapping("/AppOrder")
public class AppOrderControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private AppOrderService appOrderService;


    /**
     * 查询订单列表
     *
     * @param appOrderInfo
     * @return
     */
    @PostMapping("/listOrder")
    public AppResponse listOrder(AppOrderInfo appOrderInfo) {
        try {
            return appOrderService.listOrder(appOrderInfo);
        } catch (Exception e) {
            logger.error("查询热门商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询订单商品信息
     *
     * @param appOrderInfo
     * @return
     */
    @PostMapping("/listEvaluateGoods")
    public AppResponse listEvaluate(AppOrderInfo appOrderInfo) {
        try {
            return appOrderService.listEvaluate(appOrderInfo);
        } catch (Exception e) {
            logger.error("查询热门商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询订单详情
     *
     * @param appOrderInfo
     * @return
     */

    @PostMapping("/getOrder")
    public AppResponse getHotGoods(AppOrderInfo appOrderInfo) {
        try {
            return appOrderService.getOrder(appOrderInfo);
        } catch (Exception e) {
            logger.error("查询购物车异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改订单状态
     *
     * @param appOrderInfo
     * @return
     */

    @PostMapping("/updateOrder")
    public AppResponse updateOrder(AppOrderInfo appOrderInfo) {
        try {
            return appOrderService.updateOrder(appOrderInfo);
        } catch (Exception e) {
            logger.error("查询购物车异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 新增订单
     *
     * @param appOrderInfo
     * @return
     */
    @PostMapping("/addOrder")
    public AppResponse addOrder(AppOrderInfo appOrderInfo) {
        try {
            return appOrderService.addOrder(appOrderInfo);
        } catch (Exception e) {
            logger.error("查询热门商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 新增商品评价
     *
     * @param appOrderInfo
     * @return
     */
    @PostMapping("/addEvaluate")
    public AppResponse addEvaluate(AppOrderInfo appOrderInfo) {
        try {
            return appOrderService.addEvaluate(appOrderInfo);
        } catch (Exception e) {
            logger.error("查询热门商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}





