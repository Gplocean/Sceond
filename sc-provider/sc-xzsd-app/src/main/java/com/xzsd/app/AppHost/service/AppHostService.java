package com.xzsd.app.AppHost.service;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.AppHost.dao.AppHostDao;
import com.xzsd.app.AppHost.entity.AppHostInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class AppHostService {
    @Autowired
    private AppHostDao appHostDao;

    @Transactional(rollbackFor = Exception.class)
    /**
     * 查询店长订单
     * @param appGoodsInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listHostOrder(AppHostInfo appHostInfo){

        PageHelper.startPage(appHostInfo.getPageNum(), appHostInfo.getPageSize());
        List<AppHostInfo> appHostInfoList = appHostDao.listHostOrder(appHostInfo);
        PageInfo<AppHostInfo> pageData = new PageInfo<>(appHostInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }




    /**
     * 查询商品详情
     * @param appHostInfo
     * @return
     * @author 刘桂鹏
     */
    public AppResponse getGoods(AppHostInfo appHostInfo) {
        List<AppHostInfo> appHostInfoList = appHostDao.getGoods(appHostInfo);
        return AppResponse.success("查询成功！", appHostInfoList);
    }

}
