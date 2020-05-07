package com.xzsd.pc.DriverControl.service;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.DriverControl.dao.DriverDao;
import com.xzsd.pc.DriverControl.entity.DriverInfo;
import com.xzsd.pc.DriverControl.entity.DriverInfo;
import com.xzsd.pc.utils.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.security.Security;
import java.util.Arrays;
import java.util.List;

@Service
public class DriverService {
    @Resource

    private DriverDao driverDao;
    @Transactional(rollbackFor = Exception.class)
    /**
     * demo 新增司机
     * @param goodsInfo
     * @return
     * @Author 刘桂鹏
     * @Date 2020-03-21
     */

    public AppResponse addDriver(DriverInfo driverInfo){
        int countDriverName = driverDao.countDriverCode(driverInfo);
        //检测司机名是否存在
        if(countDriverName!=0){
            return  AppResponse.success("司机已存在，请重新命名");}
        driverInfo.setIsDeleted(0);
        String userCode = SecurityUtils.getCurrentUserId();
        driverInfo.setCreateBy(userCode);
        driverInfo.setDriverCode(StringUtil.getCommonCode(2));
        String pwd = PasswordUtils.generatePassword(driverInfo.getDriverPwd());
        driverInfo.setDriverPwd(pwd);
        driverDao.addUser(driverInfo);
        int count = driverDao.addDriver(driverInfo);
        if (count == 0) {
            return AppResponse.success("新增失败");
        }
        else
            return AppResponse.success("新增成功");
    }

    /**
     * 查询司机列表
     * @param driverInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listDriverByPage(DriverInfo driverInfo){

        PageHelper.startPage(driverInfo.getPageNum(), driverInfo.getPageSize());
        List<DriverInfo> driverInfoList = driverDao.listDriver(driverInfo);
        PageInfo<DriverInfo> pageData = new PageInfo<>(driverInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }

    /**
     *删除司机
     * @param driverCode
     * @param listCode
     * @return
     * @author 刘桂鹏
     *
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteDriver(String listCode,String driverCode) {
        List<String> list = Arrays.asList(listCode.split(","));
        // 删除门店
        int count = driverDao.deleteDriver(list,driverCode);
        if (0 == count) {
            return AppResponse.bizError("删除失败，请重试！");
        }
        return AppResponse.success("删除成功！");
    }


    /**
     * 修改司机
     * @param driverInfo
     * @return
     * @author 刘桂鹏
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateDriver(DriverInfo driverInfo) {
        int countDriverCode = driverDao.countDriverCode(driverInfo);
        AppResponse appResponse = AppResponse.success("修改成功");
        if(countDriverCode !=0){
            return  AppResponse.success("司机已存在，请重新输入");}
        int count = driverDao.updateDriver(driverInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }


    /**
     * 查询司机详情
     * @param driverInfo
     * @return
     * @author 刘桂鹏
     */
    public AppResponse getDriver(DriverInfo driverInfo) {
        List<DriverInfo> driverInfoList = driverDao.getDriver(driverInfo);
        return AppResponse.success("查询成功！", driverInfoList);
    }

    /**
     * 查询省市区
     * @param driverInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse getChina(DriverInfo driverInfo){

        PageHelper.startPage(driverInfo.getPageNum(), driverInfo.getPageSize());
        List<DriverInfo> DriverInfoList = driverDao.getChina(driverInfo);
        PageInfo<DriverInfo> pageData = new PageInfo<>(DriverInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }

}
