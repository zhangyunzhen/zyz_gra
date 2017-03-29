/*
 * 文件名：ItemServiceImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年2月27日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.service.impl;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zyz.common.ItemConstant;
import com.zyz.mapper.ZsItemDescMapper;
import com.zyz.mapper.ZsItemMapper;
import com.zyz.mapper.ZsItemParamItemMapper;
import com.zyz.pojo.PageResult;
import com.zyz.pojo.ZsItem;
import com.zyz.pojo.ZsItemDesc;
import com.zyz.pojo.ZsItemExample;
import com.zyz.pojo.ZsItemExample.Criteria;
import com.zyz.pojo.ZsItemParamItem;
import com.zyz.service.ItemService;
import com.zyz.utils.IDUtils;


@Service
public class ItemServiceImpl implements ItemService {
    
    /**
     * 注入itemMapper
     */
    @Autowired
    private ZsItemMapper itemMapper;
    /**
     * 注入itemDescMapper
     */
    @Autowired
    private ZsItemDescMapper itemDescMapper;
    /**
     * zsItemParamItemMapper
     */
    @Autowired
    private ZsItemParamItemMapper zsItemParamItemMapper;
    
    /**
     * 根据商品id查询商品信息
     */
    @Override
    public ZsItem findById(long id) {
        //主键查询
        //TbItem item = itemMapper.selectByPrimaryKey(itemId);
        ZsItemExample example = new ZsItemExample();
        Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<ZsItem> list = itemMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            ZsItem item = list.get(0);
            return item;
        }
        return null;
    }
    /**
     * 返回easyUI需要的分页参数
     */
    public PageResult getPageResult(int page, int rows) throws Exception {
        //创建查询类
        ZsItemExample example = new ZsItemExample();
        //设置分页
        PageHelper.startPage(page, rows);
        List<ZsItem> list = itemMapper.selectByExample(example);
        //取分页信息
        PageInfo<ZsItem> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        PageResult result = new PageResult(total, list);
        return result;
    }
    
    /**
     * 保存item
     */
    public void saveItem(ZsItem item, String desc, String itemParams) throws Exception{
        try {
            //生成itemID
            long itemId = IDUtils.genItemId();
            Date date = new Date();
            //1.设置并保存item
            item.setId(itemId);
            item.setStatus(ItemConstant.STATUS_YES);
            item.setCreated(date);
            item.setUpdated(date);
            itemMapper.insert(item);
            //2.设置并保存itemDesc
            saveItemDesc(itemId, date, desc);
            //3.设置并保存itemparam
            saveItemParam(itemId, date, itemParams);
        }
        catch (Exception e) {
            throw new Exception();
        }
    }

    /**
     * 
     * Description: <br>
     * 保存商品desc
     * 
     * @param itemId
     * @param date
     * @param desc 
     * @see
     */
    private void saveItemDesc(long itemId, Date date, String desc){
        ZsItemDesc itemDesc = new ZsItemDesc();
        itemDesc.setItemId(itemId);
        itemDesc.setItemDesc(desc);
        itemDesc.setCreated(date);
        itemDesc.setUpdated(date);
        itemDescMapper.insert(itemDesc);
    }
    
    /**
     * 
     * Description: <br>
     * 保存商品规格参数
     * @param itemId
     * @param date
     * @param itemParams 
     * @see
     */
    private void saveItemParam(long itemId, Date date, String itemParams){
        ZsItemParamItem itemParamItem = new ZsItemParamItem();
        itemParamItem.setItemId(itemId);
        itemParamItem.setParamData(itemParams);
        itemParamItem.setCreated(new Date());
        itemParamItem.setUpdated(new Date());
        zsItemParamItemMapper.insert(itemParamItem);
    }

}
