package com.xzsd.app.AppDriver.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.AppDriver.dao.AppDriverDao;
import com.xzsd.app.AppDriver.entity.AppDriverInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppDriverService {

@Resource
   private AppDriverDao appDriverDao;



        /**
         * 查询司机绑定门店
         * @param appDriverInfo
         * @return
         * @author 刘桂鹏
         */
        public AppResponse getDriver (AppDriverInfo appDriverInfo){
            String userCode = SecurityUtils.getCurrentUserId();
            appDriverInfo.setDriverCode(userCode);
            List<AppDriverInfo> appDriverInfoList = appDriverDao.getDriver(appDriverInfo);
            return AppResponse.success("查询成功！", appDriverInfoList);
        }

    }

