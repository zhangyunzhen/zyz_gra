/*
 * 文件名：ItemCatService.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月2日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyz.common.ItemCatConstant;
import com.zyz.mapper.ZsItemCatMapper;
import com.zyz.pojo.EasyUITreeNode;
import com.zyz.pojo.ZsItemCat;
import com.zyz.pojo.ZsItemCatExample;
import com.zyz.pojo.ZsItemCatExample.Criteria;
import com.zyz.service.ItemCatService;


/**
 * 商品类别service
 * @author zhangyunzhen
 * @version 2017年3月2日
 * @see ItemCatServiceImpl
 * @since
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {
    /**
     * 注入ZsItemCatMapper
     */
    @Autowired
    private ZsItemCatMapper itemCatMapper;

    /**
     * 得到easyUI需要的nodeInfo
     */
    @Override
    public List<EasyUITreeNode> getEasyUITreeNodes(long parentID) {
        //根据父节点id获得商品类别信息列表
        ZsItemCatExample example = new ZsItemCatExample();
        Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentID);
        criteria.andStatusEqualTo(ItemCatConstant.STATUS_EFFECTIVE);
        List<ZsItemCat> cats = itemCatMapper.selectByExample(example);

        //转化为符合easyUI要的json
        List<EasyUITreeNode> easyUITreeNodes = new ArrayList<EasyUITreeNode>();
        for (ZsItemCat zsItemCat : cats) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(zsItemCat.getId());
            node.setText(zsItemCat.getName());
            node.setState(zsItemCat.getIsParent() ? "closed" : "open");
            easyUITreeNodes.add(node);
        }
        return easyUITreeNodes;
    }

}
