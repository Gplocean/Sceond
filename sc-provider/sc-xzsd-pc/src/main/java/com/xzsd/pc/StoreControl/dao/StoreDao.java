package com.xzsd.pc.StoreControl.dao;


import com.xzsd.pc.StoreControl.entity.StoreInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface StoreDao {

     /**
     *查询门店列表
     * @param storeInfo
     * @return
     */
    List<StoreInfo> listStoreByPage(StoreInfo storeInfo);



    /**
     * 新增门店
     * @param storeInfo
     * @return
     */

    int addStore(StoreInfo storeInfo);

    /**
     * 显示热门商品详情
     * @param storeInfo
     * @return
     */
  List<StoreInfo> getStore(StoreInfo storeInfo);

    /**
     * 修改热门商品
     * @param storeInfo
     * @return
     */
    int updateStore(StoreInfo storeInfo);


    /**
     * 删除门店
     * @param storeCode
     * @param listCode
     * @return
     */
    int deleteStore(@Param("listCode")List<String> listCode,@Param("storeCode") String storeCode);


    /**
     * 统计门店编号个数
     * @param storeInfo
     * @return
     */
    int countStoreCode(StoreInfo storeInfo);

    /**
     * 查询省市区
     * @param storeInfo
     * @return
     */
   List<StoreInfo> getChina (StoreInfo storeInfo);

    /**
     * 查询店长名字
     * @param storeInfo
     * @return
     */
    String getHostName (String storeInfo);
    /**
     * 查询邀请码
     * @param storeInfo
     * @return
     */
    int updateInviteCode (StoreInfo storeInfo);
}
