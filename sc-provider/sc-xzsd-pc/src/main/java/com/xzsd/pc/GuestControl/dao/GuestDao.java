package com.xzsd.pc.GuestControl.dao;


import com.xzsd.pc.GuestControl.entity.GuestInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**@ClassName GuestDao
 * @author 刘桂鹏
 * @time  2020-04-13
 */
@Mapper
public interface GuestDao {
    /**

     /**
     *查询用户列表
     * @param guestInfo
     * @return
     */
    List<GuestInfo> listGuestByPage(GuestInfo guestInfo);
    /**
     *查询店长用户列表
     * @param guestInfo
     * @return
     */
    List<GuestInfo> listGuest(GuestInfo guestInfo);

    /**
     * 查询邀请码
     * @param guestInfo
     * @return
     */

    String getInvite(String guestInfo);
    /**
     * 查询当前角色
     * @param guestInfo
     * @return
     */

    String getRole(String guestInfo);
}
