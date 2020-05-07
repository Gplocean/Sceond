package com.xzsd.app.AppHost.controller;


import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.AppHost.entity.AppHostInfo;
import com.xzsd.app.AppHost.service.AppHostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
@RequestMapping("/appHost")
public class AppHostControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    @Resource
    private AppHostService appHostService;

    /**
     * 查询店长订单详情
     * @param appHostInfo
     * @return
     */
    @PostMapping("/getOrder")
    public AppResponse getGoods(AppHostInfo appHostInfo) {
        try {
            return appHostService.getOrder(appHostInfo);
        } catch (Exception e) {
            logger.error("查询订单详情异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }


    /**
     * 查询店长订单列表
     * @param appHostInfo
     * @return
     */

    @PostMapping("/listHostOrder")
    public AppResponse listHostOrder(AppHostInfo appHostInfo) {
        try {
            return appHostService.listHostOrder(appHostInfo);
        } catch (Exception e) {
            logger.error("查询订单列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改店长订单状态
     * @param appHostInfo
     * @return
     */

    @PostMapping("/updateOrder")
    public AppResponse updateOder(AppHostInfo appHostInfo) {
        try {
            return appHostService.updateOrder(appHostInfo);
        } catch (Exception e) {
            logger.error("订单修改异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询门店下司机
     * @param appHostInfo
     * @return
     */

    @PostMapping("/listDriver")
    public AppResponse listDriver(AppHostInfo appHostInfo) {
        try {
            return appHostService.listDriver(appHostInfo);
        } catch (Exception e) {
            logger.error("司机查询异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    }

