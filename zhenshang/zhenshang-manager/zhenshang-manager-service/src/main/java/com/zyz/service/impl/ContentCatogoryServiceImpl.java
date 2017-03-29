/*
 * 文件名：ContentCatogoryServiceImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月29日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.service.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyz.mapper.ZsContentCategoryMapper;
import com.zyz.pojo.EasyUITreeNode;
import com.zyz.pojo.ZsContentCategory;
import com.zyz.pojo.ZsContentCategoryExample;
import com.zyz.pojo.ZsContentCategoryExample.Criteria;
import com.zyz.service.ContentCategoryService;


/**
 * 
 * 内容分类serviceImpl
 * @author zhangyunzhen
 * @version 2017年3月29日
 * @see ContentCatogoryServiceImpl
 * @since
 */
@Service
public class ContentCatogoryServiceImpl implements ContentCategoryService {

    /**
     * ZsContentCategoryMapper
     */
    @Autowired
    private ZsContentCategoryMapper categoryMapper;

    /**
     *获取内容分类列表 
     */
    public List<EasyUITreeNode> findContentCatList(long parentId) {
        ZsContentCategoryExample example = new ZsContentCategoryExample();
        Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        //获取内容分类list
        List<ZsContentCategory> cats = categoryMapper.selectByExample(example);
        List<EasyUITreeNode> nodes = new ArrayList<>();
        for (ZsContentCategory cat : cats) {
            //判断内容类别状态是否正常（是否被逻辑删除）
            if (cat.getStatus() == 1) {
                EasyUITreeNode node = new EasyUITreeNode();
                node.setId(cat.getId());
                node.setText(cat.getName());
                node.setState(cat.getIsParent() ? "closed" : "open");
                nodes.add(node);
            }
        }
        return nodes;
    }

}
