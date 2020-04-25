package com.xzsd.pc.DriverControl.controller;


import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.DriverControl.entity.DriverInfo;
import com.xzsd.pc.DriverControl.service.DriverService;
import com.xzsd.pc.StoreControl.entity.StoreInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@RestController
@RequestMapping("/driver")
public class DriverControl {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Resource
    private DriverService driverService;

    /**
     * demo 新增司机
     *
     * @param driverInfo
     * @return AppResponse
     * @author Liu
     * @Date 2020-04-10
     */

    @PostMapping("/addDriver")
    public AppResponse addDriver(DriverInfo driverInfo) {
        try {
            return driverService.addDriver(driverInfo);

        } catch (Exception e) {
            logger.error("增加司机异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 分页查询司机
     * @param driverInfo
     * @return
     */
    @PostMapping("/listDriver")
    public AppResponse listDriverByPage(DriverInfo driverInfo) {
        try {
            return driverService.listDriverByPage(driverInfo);
        } catch (Exception e) {
            logger.error("查询司机列表异常", e);
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * 删除司机
     * @param driverInfo
     * @return
     */
    @PostMapping("/deleteDriver")
    public AppResponse deleteDriver(DriverInfo driverInfo) {
        try {
            return driverService.deleteDriver(driverInfo);
        } catch (Exception e) {
            logger.error("删除司机异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 修改司机
     * @param driverInfo
     * @return
     */
    @PostMapping("/updateDriver")
    public AppResponse updateDriver(DriverInfo driverInfo) {
        try {
            return driverService.updateDriver(driverInfo);
        } catch (Exception e) {
            logger.error("修改司机异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 查询司机详情
     * @param driverInfo
     * @return
     */

    @PostMapping("/getDriver")
    public AppResponse getHotGoods(DriverInfo driverInfo) {
        try {
            return driverService.getDriver(driverInfo);
        } catch (Exception e) {
            logger.error("修改司机异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询省市区
     * @param driverInfo
     * @return
     */

    @PostMapping("/getChina")
    public AppResponse china(DriverInfo driverInfo) {
        try {
            return driverService.getChina(driverInfo);
        } catch (Exception e) {
            logger.error("修改门店异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    }

