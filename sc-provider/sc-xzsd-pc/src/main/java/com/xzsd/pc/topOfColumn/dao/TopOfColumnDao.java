package com.xzsd.pc.topOfColumn.dao;

import com.xzsd.pc.topOfColumn.entity.TopOfColumnInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName DemoDao
 * @Description Demo
 * @Author dingning
 * @Date 2020-03-21
 */
@Mapper
public interface TopOfColumnDao {

    /**
     * 查询用户信息
     * @param userId 用户编号
     * @return 修改结果
     */
    TopOfColumnInfo getUserByUserCode(@Param("userId") String userId);
}
