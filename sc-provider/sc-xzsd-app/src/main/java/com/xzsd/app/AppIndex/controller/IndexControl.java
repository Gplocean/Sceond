package com.xzsd.app.AppIndex.controller;


import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.AppIndex.entity.IndexInfo;
import com.xzsd.app.AppIndex.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
@RequestMapping("/appIndex")
public class IndexControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private IndexService indexService;



    /**
     * 分页查询
     * @param indexInfo
     * @return
     */
    @PostMapping("/listPicture")
    public AppResponse listImage(IndexInfo indexInfo) {
        try {
            return indexService.listImage(indexInfo);
        } catch (Exception e) {
            logger.error("查询司机列表异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }




    /**
     * 查询热门商品详情
     * @param indexInfo
     * @return
     */

    @PostMapping("/listHotGoods")
    public AppResponse getGoods(IndexInfo indexInfo) {
        try {
            return indexService.getGoods(indexInfo);
        } catch (Exception e) {
            logger.error("查询商品异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }


    }

