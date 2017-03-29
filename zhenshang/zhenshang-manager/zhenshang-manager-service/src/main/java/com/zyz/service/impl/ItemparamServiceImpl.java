/*
 * 文件名：ItemparamServiceImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月20日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyz.mapper.ZsItemParamMapper;
import com.zyz.pojo.ZhenshangResult;
import com.zyz.pojo.ZsItemParam;
import com.zyz.pojo.ZsItemParamExample;
import com.zyz.pojo.ZsItemParamExample.Criteria;
import com.zyz.service.ItemparamService;
@Service
public class ItemparamServiceImpl implements ItemparamService {
    
    /**
     * ZsItemParamMapper
     */
    @Autowired
    private ZsItemParamMapper itemParamMapper;
    
    /**
     *根据商品类别id查询item规格参数模板 
     */
    public ZhenshangResult findItemParamByItemCatID(long ItemCatID) {
        ZsItemParamExample example = new ZsItemParamExample();
        Criteria criteria = example.createCriteria();
        criteria.andItemCatIdEqualTo(ItemCatID);
        List<ZsItemParam> itemParams = itemParamMapper.selectByExampleWithBLOBs(example);
        if(itemParams!=null && itemParams.size()>0){
            return ZhenshangResult.ok(itemParams.get(0));  
        }else{
            //查询成功，但没有得到数据
            return ZhenshangResult.ok();   //data为null
        }
    }

    /**
     * 保存商品规格参数模板
     */
    public ZhenshangResult saveItemParamTemplate(ZsItemParam zsItemParam) {
        zsItemParam.setCreated(new Date());
        zsItemParam.setUpdated(new Date());
        itemParamMapper.insert(zsItemParam);
        return ZhenshangResult.ok();
    }


}
