package com.xzsd.pc.topOfColumn.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.topOfColumn.service.TopOfColumnService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Description增删改查DEMO
 * @Author dingning
 * @Date 2020-03-21
 */
@RestController
@RequestMapping("/topOfColumn")
public class TopOfColumnController {

    private static final Logger logger = LoggerFactory.getLogger(TopOfColumnController.class);

    @Resource
    private TopOfColumnService topOfColumnService;
    /**
     * demo 查询用户详情
     * @return AppResponse
     * @author liuguipeng
     * @Date 2020-03-21
     */
    @RequestMapping(value = "getTopOfColumn")
    public AppResponse getUserByUserCode() {
        try {
            return topOfColumnService.getUserByUserCode();
        } catch (Exception e) {
            logger.error("用户查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
