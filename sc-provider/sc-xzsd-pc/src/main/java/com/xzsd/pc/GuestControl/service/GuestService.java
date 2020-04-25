package com.xzsd.pc.GuestControl.service;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.GuestControl.dao.GuestDao;
import com.xzsd.pc.GuestControl.entity.GuestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class GuestService {
    @Autowired

    private GuestDao guestDao;
    @Transactional(rollbackFor = Exception.class)
    
    /**
     * 查询客户列表
     * @param guestInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listGuestByPage(GuestInfo guestInfo){

        PageHelper.startPage(guestInfo.getPageNum(), guestInfo.getPageSize());
        List<GuestInfo> guestInfoList = guestDao.listGuestByPage(guestInfo);
        PageInfo<GuestInfo> pageData = new PageInfo<>(guestInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }


}
