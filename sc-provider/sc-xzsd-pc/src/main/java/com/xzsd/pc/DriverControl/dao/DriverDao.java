package com.xzsd.pc.DriverControl.dao;


import com.xzsd.pc.DriverControl.entity.DriverInfo;
import com.xzsd.pc.StoreControl.entity.StoreInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**@ClassName GoodsDao
 * @author 刘桂鹏
 * @time  2020-3-26
 */
@Mapper
public interface DriverDao {


    /**
     *查询司机列表
     * @param driverInfo
     * @return
     */
    List<DriverInfo> listDriver(DriverInfo driverInfo);


    /**
     * 新增司机
     * @param driverInfo
     * @return
     */

    int addDriver(DriverInfo driverInfo);
    /**
     * 新增司机
     * @param driverInfo
     * @return
     */

    int addUser(DriverInfo driverInfo);

    /**
     * 显示司机详情
     * @param driverInfo
     * @return
     */
   List<DriverInfo> getDriver(DriverInfo driverInfo);

    /**
     * 修改热门商品
     * @param driverInfo
     * @return
     */
    int updateDriver(DriverInfo driverInfo);
    

    /**
     * 删除司机
     * @param driverCode
     * @return
     */
    int deleteDriver(@Param("listCode")List<String> listCode, @Param("driverCode") String driverCode);



    /**
     * 统计司机编号个数
     * @param driverInfo
     * @return
     */
    int countDriverCode(DriverInfo driverInfo);

    /**
     * 查询省市区
     * @param driverInfo
     * @return
     */
    List<DriverInfo> getChina (DriverInfo driverInfo);



}
