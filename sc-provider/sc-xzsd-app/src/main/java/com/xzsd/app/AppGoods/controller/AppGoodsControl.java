package com.xzsd.app.AppGoods.controller;


import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.AppGoods.entity.AppGoodsInfo;
import com.xzsd.app.AppGoods.service.AppGoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
@RequestMapping("/appGoods")
public class AppGoodsControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private AppGoodsService appGoodsService;



    /**
     * 查询商品详情
     * @param appGoodsInfo
     * @return
     */
    @PostMapping("/getGoods")
    public AppResponse getGoods(AppGoodsInfo appGoodsInfo) {
        try {
            return appGoodsService.getGoods(appGoodsInfo);
        } catch (Exception e) {
            logger.error("查询商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }
    /**
     * 查询一级分类
     * @param appGoodsInfo
     * @return
     */
    @PostMapping("/getOneGoodsClassify")
    public AppResponse getOneClassifyList(AppGoodsInfo appGoodsInfo) {
        try {
            return appGoodsService.getOneClassifyList(appGoodsInfo);
        } catch (Exception e) {
            logger.error("查询一级分类异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 查询二级分类
     * @param appGoodsInfo
     * @return
     */
    @PostMapping("/getTwoGoodsClassify")
    public AppResponse getTwoClassifyList(AppGoodsInfo appGoodsInfo) {
        try {
            return appGoodsService.getTwoClassifyList(appGoodsInfo);
        } catch (Exception e) {
            logger.error("查询二级分类异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }



    /**
     * 查询商品评价
     * @param appGoodsInfo
     * @return
     */

    @PostMapping("/listEvaluate")
    public AppResponse listEvaluate(AppGoodsInfo appGoodsInfo) {
        try {
            return appGoodsService.listEvaluate(appGoodsInfo);
        } catch (Exception e) {
            logger.error("查询商品评价异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }


    }

