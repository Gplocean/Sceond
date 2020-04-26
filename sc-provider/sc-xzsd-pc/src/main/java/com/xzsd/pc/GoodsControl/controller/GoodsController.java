package com.xzsd.pc.GoodsControl.controller;



import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.GoodsControl.entity.GoodsInfo;
import com.xzsd.pc.GoodsControl.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

/**
 * 商品管理
 * @author 刘桂鹏
 * @time 2020-3-26
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private GoodsService goodsService;

    /**
     * demo 新增商品
     *
     * @param goodsInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-03-26
     */

    @PostMapping("/addGoods")
    public AppResponse addGoods(GoodsInfo goodsInfo) {
        try {
            return goodsService.addGoods(goodsInfo);

        } catch (Exception e) {
            logger.error("增加商品异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 商品分页查询
     * @param goodsInfo
     * @return
     */
    @PostMapping("/listGoods")
    public AppResponse listGoods(GoodsInfo goodsInfo) {
        try {
            return goodsService.listGoods(goodsInfo);
        } catch (Exception e) {
            logger.error("查询商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }


    }

    /**
     * 删除商品
     * @param goodsCode
     * @return
     */
    @PostMapping("/deleteGoods")
    public AppResponse deleteStore(String goodsCode) {
        try {
            String storeCod = SecurityUtils.getCurrentUserId();
            return goodsService.deleteGoods(goodsCode,storeCod);
        } catch (Exception e) {
            logger.error("删除门店异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    @PostMapping("/updateGoods")
    public AppResponse updateGoods(GoodsInfo goodsInfo) {
        try {
            return goodsService.updateGoods(goodsInfo);
        } catch (Exception e) {
            logger.error("修改商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    @PostMapping("/getGoods")
    public AppResponse getGoodsByCode(GoodsInfo goodsInfo) {
        try {
            return goodsService.getGoodsByCode(goodsInfo);
        } catch (Exception e) {
            logger.error("查询商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    @PostMapping("/getGoodsSort")
    public AppResponse getFirstGoodsSort(GoodsInfo goodsInfo) {
        try {
            return goodsService.getFirstGoodsSort(goodsInfo);
        } catch (Exception e) {
            logger.error("查询商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    @PostMapping("/updateGoodsShelfState")
    public AppResponse updateGoodsShelfState(GoodsInfo goodsInfo) {
        try {
            return goodsService.updateGoodsState(goodsInfo);
        } catch (Exception e) {
            logger.error("查询商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

}
