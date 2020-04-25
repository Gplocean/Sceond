package com.xzsd.app.AppIndex.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.AppIndex.dao.IndexDao;
import com.xzsd.app.AppIndex.entity.IndexInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexService {
    @Autowired
@Resource
   private IndexDao indexDao;

    /**
     * 查询首页轮播图
     * @param indexInfo
     * @return
     * @author liuguipeng
     */
    public AppResponse listImage(IndexInfo indexInfo) {

        PageHelper.startPage(indexInfo.getPageNum(), indexInfo.getPageSize());
        List<IndexInfo> indexInfoList = indexDao.listImage(indexInfo);
        PageInfo<IndexInfo> pageData = new PageInfo<>(indexInfoList);

        return AppResponse.success("从数据库查询成功!", pageData);

    }
        /**
         * 查询司机详情
         * @param indexInfo
         * @return
         * @author 刘桂鹏
         */
        public AppResponse getGoods (IndexInfo indexInfo){
            List<IndexInfo> indexInfoList = indexDao.getGoods(indexInfo);
            return AppResponse.success("查询成功！", indexInfoList);
        }

    }

