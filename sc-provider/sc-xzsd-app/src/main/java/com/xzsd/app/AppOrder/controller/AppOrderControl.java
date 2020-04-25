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
@RequestMapping("/pc/hotGoods")
public class AppOrderControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private AppOrderService appOrderService;


    /**
     * 新增购物车
     *
     * @param appOrderInfo
     * @return
     */
    @PostMapping("/addShop")
    public AppResponse addShop(AppOrderInfo appOrderInfo) {
        try {
            return appOrderService.addShop(appOrderInfo);
        } catch (Exception e) {
            logger.error("新增购物车异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 修改购物车
     *
     * @param appOrderInfo
     * @return
     */
    @PostMapping("/updateShop")
    public AppResponse updateShop(AppOrderInfo appOrderInfo) {
        try {
            return appOrderService.updateShop(appOrderInfo);
        } catch (Exception e) {
            logger.error("查询热门商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询购物车
     *
     * @param appOrderInfo
     * @return
     */

    @PostMapping("/listShop")
    public AppResponse getHotGoods(AppOrderInfo appOrderInfo) {
        try {
            return appOrderService.listShop(appOrderInfo);
        } catch (Exception e) {
            logger.error("查询购物车异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 删除购物车
     *
     * @param appOrderInfo
     * @return
     */

    @PostMapping("/deleteShop")
    public AppResponse deleteShop(AppOrderInfo appOrderInfo) {
        try {
            return appOrderService.deleteShop(appOrderInfo);
        } catch (Exception e) {
            logger.error("查询购物车异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}





