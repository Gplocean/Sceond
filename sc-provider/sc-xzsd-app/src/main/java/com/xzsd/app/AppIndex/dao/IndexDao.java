package com.xzsd.app.AppIndex.dao;


import com.xzsd.app.AppIndex.entity.IndexInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface IndexDao {


    /**
     *查询轮播图
     * @param indexInfo
     * @return
     */
    List<IndexInfo> listImage(IndexInfo indexInfo);


    /**
     * 查询商品详情
     * @param indexInfo
     * @return
     */
   List<IndexInfo> getGoods(IndexInfo indexInfo);





}
