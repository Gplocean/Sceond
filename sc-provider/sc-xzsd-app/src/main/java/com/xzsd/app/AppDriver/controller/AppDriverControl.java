package com.xzsd.app.AppDriver.controller;


import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.AppDriver.entity.AppDriverInfo;
import com.xzsd.app.AppDriver.service.AppDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/appDriver")
public class AppDriverControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private AppDriverService appDriverService;


    /**
     * 查询司机下门店
     * @param appDriverInfo
     * @return
     */

    @PostMapping("/getDriver")
    public AppResponse getGoods(AppDriverInfo appDriverInfo) {
        try {
            return appDriverService.getDriver(appDriverInfo);
        } catch (Exception e) {
            logger.error("查询商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }


    }

