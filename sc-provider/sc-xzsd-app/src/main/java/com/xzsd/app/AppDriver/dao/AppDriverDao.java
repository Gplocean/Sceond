package com.xzsd.app.AppDriver.dao;


import com.xzsd.app.AppDriver.entity.AppDriverInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface AppDriverDao {



    /**
     * 查询司机绑定门店
     * @param appDriverInfo
     * @return
     */
   List<AppDriverInfo> getDriver(AppDriverInfo appDriverInfo);





}
