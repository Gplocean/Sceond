package com.xzsd.app.AppShop.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.AppShop.entity.AppShopInfo;
import com.xzsd.app.AppShop.service.AppShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
@RequestMapping("/appShop")
public class AppShopControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private AppShopService appShopService;


    /**
     * 新增购物车
     *
     * @param appShopInfo
     * @return
     */
    @PostMapping("/addShop")
    public AppResponse addShop(AppShopInfo appShopInfo) {
        try {
            return appShopService.addShop(appShopInfo);
        } catch (Exception e) {
            logger.error("新增购物车异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 修改购物车
     *
     * @param appShopInfo
     * @return
     */
    @PostMapping("/updateShop")
    public AppResponse updateShop(AppShopInfo appShopInfo) {
        try {
            return appShopService.updateShop(appShopInfo);
        } catch (Exception e) {
            logger.error("查询热门商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询购物车
     *
     * @param appShopInfo
     * @return
     */

    @PostMapping("/listShop")
    public AppResponse getHotGoods(AppShopInfo appShopInfo) {
        try {
            return appShopService.listShop(appShopInfo);
        } catch (Exception e) {
            logger.error("查询购物车异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 删除购物车
     *
     * @param appShopInfo
     * @return
     */

    @PostMapping("/deleteShop")
    public AppResponse deleteShop(AppShopInfo appShopInfo) {
        try {
            return appShopService.deleteShop(appShopInfo);
        } catch (Exception e) {
            logger.error("查询购物车异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}





