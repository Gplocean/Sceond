package com.xzsd.app.AppGoods.service;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.AppGoods.dao.AppGoodsDao;
import com.xzsd.app.AppGoods.entity.AppGoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

@Service
public class AppGoodsService {
    @Autowired
    @Resource
    private AppGoodsDao appGoodsDao;

    @Transactional(rollbackFor = Exception.class)
    /**
     * 查询商品评价
     * @param appGoodsInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listEvaluate(AppGoodsInfo appGoodsInfo){

        PageHelper.startPage(appGoodsInfo.getPageNum(), appGoodsInfo.getPageSize());
        List<AppGoodsInfo> appGoodsInfoList = appGoodsDao.listEvaluate(appGoodsInfo);
        PageInfo<AppGoodsInfo> pageData = new PageInfo<>(appGoodsInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }
    /**
     * 查询二级分类及商品
     * @param appGoodsInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse getTwoClassifyList(AppGoodsInfo appGoodsInfo){

        PageHelper.startPage(appGoodsInfo.getPageNum(), appGoodsInfo.getPageSize());
        List<AppGoodsInfo> appGoodsInfoList = appGoodsDao.getTwoClassifyList(appGoodsInfo);
        PageInfo<AppGoodsInfo> pageData = new PageInfo<>(appGoodsInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }



    /**
     * 查询商品详情
     * @param appGoodsInfo
     * @return
     * @author 刘桂鹏
     */
    public AppResponse getGoods(AppGoodsInfo appGoodsInfo) {
        List<AppGoodsInfo>appGoodsInfoList = appGoodsDao.getGoods(appGoodsInfo);
        return AppResponse.success("查询成功！", appGoodsInfoList);
    }
    /**
     * 查询一级分类
     * @param appGoodsInfo
     * @return
     * @author 刘桂鹏
     */
    public AppResponse getOneClassifyList(AppGoodsInfo appGoodsInfo) {
        List<AppGoodsInfo> appGoodsInfoList = appGoodsDao.getOneClassifyList(appGoodsInfo);
        return AppResponse.success("查询成功！", appGoodsInfoList);
    }

}
