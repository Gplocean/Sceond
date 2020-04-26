package com.xzsd.pc.HotGoodsControl.controller;


import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.GoodsControl.entity.GoodsInfo;
import com.xzsd.pc.HotGoodsControl.entity.HotGoodsInfo;
import com.xzsd.pc.HotGoodsControl.service.HotGoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
@RequestMapping("/hotGoods")
public class HotGoodsControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private HotGoodsService hotGoodsService;

    /**
     * demo 新增热门商品
     *
     * @param hotGoodsInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */

    @PostMapping("/addHotGoods")
    public AppResponse addHotGoods(HotGoodsInfo hotGoodsInfo) {
        try {
            return hotGoodsService.addHotGoods(hotGoodsInfo);

        } catch (Exception e) {
            logger.error("增加热门商品异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 分页查询热门商品
     * @param hotGoodsInfo
     * @return
     */
    @PostMapping("/listHotGoods")
    public AppResponse listHotGoodsByPage(HotGoodsInfo hotGoodsInfo) {
        try {
            return hotGoodsService.listHotGoodsByPage(hotGoodsInfo);
        } catch (Exception e) {
            logger.error("查询热门商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 删除热门商品
     * @param hotGoodsCode
     * @return
     */
    @PostMapping("/deleteHotGoods")
    public AppResponse deleteStore(String hotGoodsCode) {
        try {
            String storeCod = SecurityUtils.getCurrentUserId();
            return hotGoodsService.deleteHotGoods(hotGoodsCode,storeCod);
        } catch (Exception e) {
            logger.error("删除门店异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改热门商品
     * @param hotGoodsInfo
     * @return
     */
    @PostMapping("/updateHotGoods")
    public AppResponse updateHotGoods(HotGoodsInfo hotGoodsInfo) {
        try {
            return hotGoodsService.updateHotGoods(hotGoodsInfo);
        } catch (Exception e) {
            logger.error("修改热门商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询热门商品详情
     * @param hotGoodsInfo
     * @return
     */

    @PostMapping("/getHotGoods")
    public AppResponse getHotGoods(HotGoodsInfo hotGoodsInfo) {
        try {
            return hotGoodsService.getHotGoods(hotGoodsInfo);
        } catch (Exception e) {
            logger.error("修改热门商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }


    /**
     * 商品查询
     * @param goodsInfo
     * @return
     */
    @PostMapping("/listGoods")
    public AppResponse listGoods(GoodsInfo goodsInfo) {
        try {
            return hotGoodsService.listGoods(goodsInfo);
        } catch (Exception e) {
            logger.error("查询热门商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }


    }

    /**
     * 查询热门商品展示数量
     * @param goodsInfo
     * @return
     */
    @PostMapping("/getHotGoodsShowNum")
    public AppResponse getHotGoodsShowNum(HotGoodsInfo goodsInfo) {
        try {
            return hotGoodsService.getHotGoodsShowNum(goodsInfo);
        } catch (Exception e) {
            logger.error("查询热门商品数量异常", e);
            System.out.println(e.toString());
            throw e;
        }


    }

    /**
     * 修改热门商品展示数量
     * @param goodsInfo
     * @return
     */
    @PostMapping("/updateHotGoodsShowNum")
    public AppResponse updateHotGoodsShowNum(HotGoodsInfo goodsInfo) {
        try {
            return hotGoodsService.updateHotGoodsShowNum(goodsInfo);
        } catch (Exception e) {
            logger.error("查询热门商品数量异常", e);
            System.out.println(e.toString());
            throw e;
        }


    }

}
