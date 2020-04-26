package com.xzsd.pc.GoodsSortControl.controller;


import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.GoodsSortControl.entity.GoodsSortInfo;
import com.xzsd.pc.GoodsSortControl.service.GoodsSortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
@RequestMapping("/goodsClassify")
public class GoodsSortControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private GoodsSortService goodsSortService;

    /**
     * demo 新增商品分类
     *
     * @param goodsSortInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */

    @PostMapping("/addGoodsClassify")
    public AppResponse addGoodsSort(GoodsSortInfo goodsSortInfo) {
        try {
            return goodsSortService.addGoodsSort(goodsSortInfo);

        } catch (Exception e) {
            logger.error("增加轮播图异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }
    /**
     * demo 查询商品一级分类
     *
     * @param goodsSortInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */
    @PostMapping("/listAllGoodsClassify")
    public AppResponse listFirstGoodsSort(GoodsSortInfo goodsSortInfo) {
        try {
            return goodsSortService.listFirstGoodsSort(goodsSortInfo);
        } catch (Exception e) {
            logger.error("查询商品分类异常", e);
            System.out.println(e.toString());
            throw e;
        }


    }





    /**
     * demo 删除商品分类
     *
     * @param goodsSortCode
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */
    @PostMapping("/deletePicture")
    public AppResponse deleteStore(String goodsSortCode) {
        try {
            String storeCod = SecurityUtils.getCurrentUserId();
            return goodsSortService.deleteGoodsSort(goodsSortCode,storeCod);
        } catch (Exception e) {
            logger.error("删除门店异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * demo 修改商品分类
     *
     * @param goodsSortInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */
    @PostMapping("/updateGoodsClassify")
    public AppResponse updateGoodsSort(GoodsSortInfo goodsSortInfo) {
        try {
            return goodsSortService.updateGoodsSort(goodsSortInfo);
        } catch (Exception e) {
            logger.error("修改商品分类异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询商品分类详情
     * @param goodsSortInfo
     * @return
     */

    @PostMapping("/getGoodsClassify")
    public AppResponse getGoodsSortByCode(GoodsSortInfo goodsSortInfo) {
        try {
            return goodsSortService.getGoodsSort(goodsSortInfo);
        } catch (Exception e) {
            logger.error("查询商品分类详情异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }


}
