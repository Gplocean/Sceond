package com.xzsd.app.AppOrder.service;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.AppOrder.dao.AppOrderDao;
import com.xzsd.app.AppOrder.entity.AppOrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

@Service
public class AppOrderService {
    @Autowired
    @Resource
    private AppOrderDao appOrderDao;


    /**
     * demo 新增购物车
     * @param appOrderInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addShop(AppOrderInfo appOrderInfo){

         appOrderInfo.setIsDeleted(0);
        int count = appOrderDao.addShop(appOrderInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        }
        else
            return AppResponse.success("新增成功");
    }

    /**
     * 查询商品评价
     * @param appOrderInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listShop(AppOrderInfo appOrderInfo){

        PageHelper.startPage(appOrderInfo.getPageNum(), appOrderInfo.getPageSize());
        List<AppOrderInfo> appOrderInfoList = appOrderDao.listShop(appOrderInfo);
        PageInfo<AppOrderInfo> pageData = new PageInfo<>(appOrderInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }




    /**
     * 查询商品详情
     * @param appOrderInfo
     * @return
     * @author 刘桂鹏
     */
    public AppResponse updateShop(AppOrderInfo appOrderInfo) {
        AppOrderInfo appOrderInfoList = appOrderDao.updateShop(appOrderInfo);
        return AppResponse.success("查询成功！", appOrderInfoList);
    }


    /**
     * demo 删除购物车
     * @param appOrderInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteShop(AppOrderInfo appOrderInfo){

        appOrderInfo.setIsDeleted(0);
        int count = appOrderDao.deleteShop(appOrderInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        }
        else
            return AppResponse.success("新增成功");
    }
}
