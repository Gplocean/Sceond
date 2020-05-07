package com.xzsd.app.AppHost.service;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.AppHost.dao.AppHostDao;
import com.xzsd.app.AppHost.entity.AppHostInfo;
import com.xzsd.app.AppOrder.entity.AppOrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

@Service
public class AppHostService {
    @Resource
    private AppHostDao appHostDao;

    @Transactional(rollbackFor = Exception.class)
    /**
     * 查询店长订单
     * @param appGoodsInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listHostOrder(AppHostInfo appHostInfo){
           String hostCode = SecurityUtils.getCurrentUserId();
           appHostInfo.setUserCode(hostCode);
           //获取门店编号
           String storeCode = appHostDao.getStoreCode(appHostInfo);
           appHostInfo.setStoreCode(storeCode);
        PageHelper.startPage(appHostInfo.getPageNum(), appHostInfo.getPageSize());
        List<AppHostInfo> appHostInfoList = appHostDao.listHostOrder(appHostInfo);
        PageInfo<AppHostInfo> pageData = new PageInfo<>(appHostInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }

    /**
     * demo 修改店长订单状态
     * @param appHostInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateOrder(AppHostInfo appHostInfo){

        appHostInfo.setIsDeleted(0);
        int count = appHostDao.updateOrder(appHostInfo);
        if (count == 0) {
            return AppResponse.success("修改失败");
        }
        else
            return AppResponse.success("修改成功");
    }


    /**
     * 查询商品详情
     * @param appHostInfo
     * @return
     * @author 刘桂鹏
     */
    public AppResponse getOrder(AppHostInfo appHostInfo) {
        List<AppHostInfo> appHostInfoList = appHostDao.getOrder(appHostInfo);
        return AppResponse.success("查询成功！", appHostInfoList);
    }

    /**
     * 查询门店下司机
     * @param appHostInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listDriver(AppHostInfo appHostInfo){

        PageHelper.startPage(appHostInfo.getPageNum(), appHostInfo.getPageSize());
        List<AppHostInfo> appHostInfoList = appHostDao.listDriver(appHostInfo);
        PageInfo<AppHostInfo> pageData = new PageInfo<>(appHostInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }
}
