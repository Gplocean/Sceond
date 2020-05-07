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
     *修改门店订单状态
     * @param appHostInfo
     * @return
     */
   int updateOrder(AppHostInfo appHostInfo);




    /**
     * 查询一级分类
     * @param appHostInfo
     * @return
     */
    List<AppHostInfo> getOrder(AppHostInfo appHostInfo);


    /**
     * 查询二级分类和商品信息
     * @param appHostInfo
     * @return
     */
    List<AppHostInfo> listHostOrder(AppHostInfo appHostInfo);


    /**
     * 查询司机
     * @param appHostInfo
     * @return
     */
    List<AppHostInfo> listDriver(AppHostInfo appHostInfo);
    /**
     * 查询一级分类
     * @param appHostInfo
     * @return
     */
    String getStoreCode(AppHostInfo appHostInfo);

}
