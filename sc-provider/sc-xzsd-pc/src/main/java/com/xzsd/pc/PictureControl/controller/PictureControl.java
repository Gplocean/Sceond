package com.xzsd.pc.PictureControl.controller;


import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.GoodsControl.entity.GoodsInfo;
import com.xzsd.pc.PictureControl.entity.PictureInfo;
import com.xzsd.pc.PictureControl.service.PictureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
@RequestMapping("/picture")
public class PictureControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private PictureService pictureService;

    /**
     * demo 新增轮播图
     *
     * @param pictureInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */

    @PostMapping("/addPicture")
    public AppResponse addPicture(PictureInfo pictureInfo) {
        try {
            return pictureService.addPicture(pictureInfo);

        } catch (Exception e) {
            logger.error("增加轮播图异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 分页查询轮播图
     * @param pictureInfo
     * @return
     */
    @PostMapping("/listPicture")
    public AppResponse listPictureByPage(PictureInfo pictureInfo) {
        try {
            return pictureService.listPictureByPage(pictureInfo);
        } catch (Exception e) {
            logger.error("查询轮播图列表异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 删除轮播图
     * @param pictureCode
     * @return
     */
    @PostMapping("/deletePicture")
    public AppResponse deleteStore(String pictureCode) {
        try {
            String storeCod = SecurityUtils.getCurrentUserId();
            return pictureService.deletePicture(pictureCode,storeCod);
        } catch (Exception e) {
            logger.error("删除轮播图异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改轮播图
     * @param pictureInfo
     * @return
     */
    @PostMapping("/updatePicture")
    public AppResponse updatePicture(PictureInfo pictureInfo) {
        try {
            return pictureService.updatePicture(pictureInfo);
        } catch (Exception e) {
            logger.error("修改轮播图异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询轮播图详情
     * @param pictureInfo
     * @return
     */

    @PostMapping("/getPicture")
    public AppResponse getPictureBySort(PictureInfo pictureInfo) {
        try {
            return pictureService.getPictureBySort(pictureInfo);
        } catch (Exception e) {
            logger.error("修改轮播图异常", e);
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
            return pictureService.listGoods(goodsInfo);
        } catch (Exception e) {
            logger.error("查询轮播图列表异常", e);
            System.out.println(e.toString());
            throw e;
        }


    }

}
