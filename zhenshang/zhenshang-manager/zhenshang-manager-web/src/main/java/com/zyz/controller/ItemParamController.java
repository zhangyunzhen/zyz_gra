/*
 * 文件名：ItemParamController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月20日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zyz.pojo.ZhenshangResult;
import com.zyz.pojo.ZsItemParam;
import com.zyz.service.ItemparamService;


/**
 * 商品规格参数模板类
 * 
 * @author zhangyunzhen
 * @version 2017年3月20日
 * @see ItemParamController
 * @since
 */
@RequestMapping(value = "/itemParam")
@Controller
public class ItemParamController {

    /**
     * itemparamService
     */
    @Autowired
    private ItemparamService itemparamService;

    /**
     * 
     * Description: <br>
     * 查询商品规格参数模板是否存在
     * 
     * @param ItemCatID
     * @return 
     * @see
     */
    @RequestMapping(value = "/query/itemCatId/{ItemCatID}", method = RequestMethod.GET)
    @ResponseBody
    public String findItemParamByItemCatID(@PathVariable long ItemCatID) {
        ZhenshangResult result = itemparamService.findItemParamByItemCatID(ItemCatID);
        return JSON.toJSONString(result);
    }

    /**
     * 
     * Description: <br>
     * 保存模板规格参数
     * 
     * @param cId 商品类别Id
     * @param paramData 规格参数模板data
     * @return 
     * @see
     */
    @ResponseBody
    @RequestMapping(value = "/save/{cId}", method = RequestMethod.POST)
    public ZhenshangResult saveItemparamTemplate(@PathVariable long cId, String paramData) {
        ZsItemParam itemParam = new ZsItemParam();
        itemParam.setItemCatId(cId);
        itemParam.setParamData(paramData);
        return itemparamService.saveItemParamTemplate(itemParam);
    }
}
