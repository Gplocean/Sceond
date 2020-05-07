package com.xzsd.pc.GuestControl.service;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.GuestControl.dao.GuestDao;
import com.xzsd.pc.GuestControl.entity.GuestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

@Service
public class GuestService {
    @Resource

    private GuestDao guestDao;
    @Transactional(rollbackFor = Exception.class)
    
    /**
     * 查询客户列表
     * @param guestInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listGuestByPage(GuestInfo guestInfo) {
        String userCode = SecurityUtils.getCurrentUserId();
        guestInfo.setGuestCode(userCode);
        //设置邀请码
        String inviteCode = guestDao.getInvite(userCode);
        guestInfo.setInviteCode(inviteCode);
        String role = guestDao.getRole(userCode);
        //根据角色显示客户
        guestInfo.setRole(role);
        if ("2".equals(role)) {
            PageHelper.startPage(guestInfo.getPageNum(), guestInfo.getPageSize());
            List<GuestInfo> guestInfoList = guestDao.listGuest(guestInfo);
            PageInfo<GuestInfo> pageData = new PageInfo<>(guestInfoList);
            return AppResponse.success("从数据库查询成功!", pageData);
        } else {
            PageHelper.startPage(guestInfo.getPageNum(), guestInfo.getPageSize());
            List<GuestInfo> guestInfoList = guestDao.listGuestByPage(guestInfo);
            PageInfo<GuestInfo> pageData = new PageInfo<>(guestInfoList);

            return AppResponse.success("从数据库查询成功!", pageData);
        }

    }


}
