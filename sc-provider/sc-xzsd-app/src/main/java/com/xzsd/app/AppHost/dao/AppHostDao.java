package com.xzsd.app.AppHost.dao;


import com.xzsd.app.AppHost.entity.AppHostInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface AppHostDao {

     /**
     *查询门店列表
     * @param appHostInfo
     * @return
     */
    List<AppHostInfo> listEvaluate(AppHostInfo appHostInfo);





    /**
     * 显示热门商品详情
     * @param appHostInfo
     * @return
     */
    List<AppHostInfo> getGoods(AppHostInfo appHostInfo);

    /**
     * 查询一级分类
     * @param appHostInfo
     * @return
     */
    List<AppHostInfo> getOneClassifyList(AppHostInfo appHostInfo);


    /**
     * 查询二级分类和商品信息
     * @param appHostInfo
     * @return
     */
    List<AppHostInfo> listHostOrder(AppHostInfo appHostInfo);




}
