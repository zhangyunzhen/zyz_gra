/*
 * 文件名：ItemCatServiceImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月28日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyz.mapper.ZsItemCatMapper;
import com.zyz.pojo.CatNode;
import com.zyz.pojo.ZsItemCat;
import com.zyz.pojo.ZsItemCatExample;
import com.zyz.pojo.ZsItemCatExample.Criteria;
import com.zyz.service.ItemCatService;
import com.zyz.utils.JsonUtils;


/**
 *商品类别展示service
 * @author zhangyunzhen
 * @version 2017年3月28日
 * @see ItemCatServiceImpl
 * @since
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    /**
     * ZsItemCatMapper
     */
    @Autowired
    private ZsItemCatMapper mapper;

    /**
     * 获取商品分类数据
     */
    public String findItemCats() {
       //获取商品分类list
        List<?> cats = getCatList(0);
        //按规定格式包装
        Map<String, List<?>> map = new HashMap<>();
        map.put("data", cats);
        return JsonUtils.objectToJson(map);

    }

    /**
     * 查询分类列表
     * <p>Title: getCatList</p>
     * <p>Description: </p>
     * @param parentId
     * @return
     */
    private List<?> getCatList(long parentId) {
        //创建查询条件
        ZsItemCatExample example = new ZsItemCatExample();
        Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        //根据parentId查询商品分类
        List<ZsItemCat> list = mapper.selectByExample(example);
        //返回值list
        List resultList = new ArrayList<>();
        //向list中添加节点
        for (ZsItemCat tbItemCat : list) {
            //判断是否为父节点
            if (tbItemCat.getIsParent()) {
                CatNode catNode = new CatNode();
                if (parentId == 0) {
                    catNode.setName("<a href='/products/"+tbItemCat.getId()+".html'>"+tbItemCat.getName()+"</a>");
                } else {
                    catNode.setName(tbItemCat.getName());
                }
                catNode.setUrl("/products/"+tbItemCat.getId()+"");
                catNode.setItem(getCatList(tbItemCat.getId()));
                
                resultList.add(catNode);
                if (resultList.size()>=14) {
                    break;
                }
            } else {//如果是叶子节点
                resultList.add("/products/"+tbItemCat.getId()+"|" + tbItemCat.getName());
            }
        }
        return resultList;
    }

}
