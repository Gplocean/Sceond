package com.xzsd.pc.StoreControl.controller;


import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.StoreControl.entity.StoreInfo;
import com.xzsd.pc.StoreControl.service.StoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
@RequestMapping("/store")
public class StoreControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private StoreService storeService;

    /**
     * demo 新增门店
     *
     * @param storeInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */

    @PostMapping("/addStore")
    public AppResponse addStore(StoreInfo storeInfo) {
        try {
            return storeService.addStore(storeInfo);

        } catch (Exception e) {
            logger.error("增加门店异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 分页查询门店
     * @param storeInfo
     * @return
     */
    @PostMapping("/listStore")
    public AppResponse listStoreByPage(StoreInfo storeInfo) {
        try {
            return storeService.listStoreByPage(storeInfo);
        } catch (Exception e) {
            logger.error("查询门店列表异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 删除门店
     * @param storeInfo
     * @return
     */
    @PostMapping("/deleteStore")
    public AppResponse deleteStore(StoreInfo storeInfo) {
        try {
            return storeService.deleteStore(storeInfo);
        } catch (Exception e) {
            logger.error("删除门店异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改门店
     * @param storeInfo
     * @return
     */
    @PostMapping("/updateStore")
    public AppResponse updateStore(StoreInfo storeInfo) {
        try {
            return storeService.updateStore(storeInfo);
        } catch (Exception e) {
            logger.error("修改门店异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询门店详情
     * @param storeInfo
     * @return
     */

    @PostMapping("/getStore")
    public AppResponse getStore(StoreInfo storeInfo) {
        try {
            return storeService.getStore(storeInfo);
        } catch (Exception e) {
            logger.error("查询门店异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询省市区
     * @param storeInfo
     * @return
     */

    @PostMapping("/getChina")
    public AppResponse china(StoreInfo storeInfo) {
        try {
            return storeService.china(storeInfo);
        } catch (Exception e) {
            logger.error("修改门店异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    }

