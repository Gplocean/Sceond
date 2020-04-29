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
     * 查询商品详情
     * @param appHostInfo
     * @return
     */
    @PostMapping("/getGoods")
    public AppResponse getGoods(AppHostInfo appHostInfo) {
        try {
            return appHostService.getGoods(appHostInfo);
        } catch (Exception e) {
            logger.error("查询商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }






    /**
     * 查询商品评价
     * @param appHostInfo
     * @return
     */

    @PostMapping("/listHostOrder")
    public AppResponse listHostOrder(AppHostInfo appHostInfo) {
        try {
            return appHostService.listHostOrder(appHostInfo);
        } catch (Exception e) {
            logger.error("查询商品评价异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }


    }

