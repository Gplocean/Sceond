package com.xzsd.pc.GoodsSortControl.dao;


import com.xzsd.pc.GoodsSortControl.entity.GoodsSortInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface GoodsSortDao {
    /**


    /**
     *查询商品二级分类
     * @param goodsSortInfo
     * @return
     */
    List<GoodsSortInfo> listGoodsSort(GoodsSortInfo goodsSortInfo);


    /**
     * 统计商品名数量
     * @param goodsSortInfo
     * @return
     */
    int countGoodsSort(GoodsSortInfo goodsSortInfo);

    /**
     * 新增商品分类
     * @param goodsSortInfo
     * @return
     */

    int addGoodsSort(GoodsSortInfo goodsSortInfo);

    /**
     * 删除商品分类
     * @param goodsSortInfo
     * @return
     */
   List<GoodsSortInfo> getGoodsSort(GoodsSortInfo goodsSortInfo);

    /**
     * 修改商品分类
     * @param goodsSortInfo
     * @return
     */
    int updateGoodsSort(GoodsSortInfo goodsSortInfo);

    /**
     * 删除商品分类
     * @param goodsSortCode
     * @param listCode
     * @return
     */
    int deleteGoodsSort( String goodsSortCode);

    /**
     * 统计商品分类数量
     * @param goodsSortInfo
     * @return
     */
    int countSortName(GoodsSortInfo goodsSortInfo);
}
