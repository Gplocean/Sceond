package com.xzsd.pc.topOfColumn.service;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.AuthUtils;
import com.xzsd.pc.topOfColumn.dao.TopOfColumnDao;
import com.xzsd.pc.topOfColumn.entity.TopOfColumnInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.security.Security;

/**
 * @DescriptionDemo 实现类
 * @Author liuguipeng
 * @Date 2020-03-21
 */
@Service

public class TopOfColumnService {
    @Autowired
    @Resource
    private TopOfColumnDao topOfColumnDao;
    /**
     * 查询用户详情
     * @Author dingning
     * @Date 2020-03-21
     */
    public AppResponse getUserByUserCode() {
        //获取用户id
        String userId = SecurityUtils.getCurrentUserId();
        TopOfColumnInfo topOfColumnInfo = topOfColumnDao.getUserByUserCode(userId);
        return AppResponse.success("查询成功！", topOfColumnInfo);
    }
}


