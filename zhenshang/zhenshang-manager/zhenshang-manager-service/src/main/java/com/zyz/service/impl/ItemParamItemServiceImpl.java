/*
 * 文件名：ItemParamItemServiceImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月21日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyz.mapper.ZsItemParamItemMapper;
import com.zyz.pojo.ZsItemParamItem;
import com.zyz.pojo.ZsItemParamItemExample;
import com.zyz.pojo.ZsItemParamItemExample.Criteria;
import com.zyz.service.ItemParamItemService;

/**
 * 商品规格参数serviceImpl
 * @author zhangyunzhen
 * @version 2017年3月21日
 * @see ItemParamItemServiceImpl
 * @since
 */
@Service
public class ItemParamItemServiceImpl implements ItemParamItemService {
    /**
     * ZsItemParamItemMapper
     */
    @Autowired
    private ZsItemParamItemMapper paramItemMapper;
    
    
    /**
     *根据商品id获取商品规格参数 
     */
    public ZsItemParamItem findItemParamByItemId(long itemId) {
        try {
            ZsItemParamItemExample example = new ZsItemParamItemExample();
            Criteria criteria = example.createCriteria();
            criteria.andItemIdEqualTo(itemId);
            List<ZsItemParamItem> itemParamItems = paramItemMapper.selectByExampleWithBLOBs(example);
            if(itemParamItems != null && itemParamItems.size()>0){
                return itemParamItems.get(0);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    
}
