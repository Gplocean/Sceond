package com.xzsd.app.AppShop.service;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.AppShop.dao.AppShopDao;
import com.xzsd.app.AppShop.entity.AppShopInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

@Service
public class AppShopService {
    @Autowired
    @Resource
    private AppShopDao appShopDao;


    /**
     * demo 新增购物车
     *
     * @param appShopInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addShop(AppShopInfo appShopInfo) {

        appShopInfo.setIsDeleted(0);
        int count = appShopDao.addAppShop(appShopInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        } else
            return AppResponse.success("新增成功");
    }

    /**
     * 查询商品评价
     *
     * @param appShopInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listShop(AppShopInfo appShopInfo) {

        PageHelper.startPage(appShopInfo.getPageNum(), appShopInfo.getPageSize());
        List<AppShopInfo> appShopInfoList = appShopDao.listShop(appShopInfo);
        PageInfo<AppShopInfo> pageData = new PageInfo<>(appShopInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }


    /**
     * demo 修改数量
     *
     * @param appShopInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateShop(AppShopInfo appShopInfo) {

        appShopInfo.setIsDeleted(0);
        int count = appShopDao.updateShop(appShopInfo);
        if (count == 0) {
            return AppResponse.success("修改失败");
        }
        else if (appShopInfo.getGoodsCount().equals(0)) {
            return AppResponse.success("值不能为0，请重新选择");
        } else
            return AppResponse.success("修改成功");


}


    /**
     * demo 删除购物车
     * @param appShopInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteShop(AppShopInfo appShopInfo){

        appShopInfo.setIsDeleted(0);
        int count =appShopDao.deleteShop(appShopInfo);
        if (count == 0) {
            return AppResponse.success("删除失败");
        }
        else
            return AppResponse.success("删除成功");
    }
}
