package com.xzsd.app.AppGoods.dao;


import com.xzsd.app.AppGoods.entity.AppGoodsInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface AppGoodsDao {

     /**
     *查询门店列表
     * @param appGoodsInfo
     * @return
     */
    List<AppGoodsInfo> listEvaluate(AppGoodsInfo appGoodsInfo);





    /**
     * 显示热门商品详情
     * @param appGoodsInfo
     * @return
     */
    List<AppGoodsInfo> getGoods(AppGoodsInfo appGoodsInfo);

    /**
     * 查询一级分类
     * @param appGoodsInfo
     * @return
     */
    List<AppGoodsInfo> getOneClassifyList(AppGoodsInfo appGoodsInfo);


    /**
     * 查询二级分类和商品信息
     * @param appGoodsInfo
     * @return
     */
    List<AppGoodsInfo> getTwoClassifyList(AppGoodsInfo appGoodsInfo);




}
