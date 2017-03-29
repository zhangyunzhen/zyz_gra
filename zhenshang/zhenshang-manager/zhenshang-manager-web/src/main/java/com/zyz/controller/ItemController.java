/*
 * 文件名：ItemController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月1日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zyz.pojo.PageResult;
import com.zyz.pojo.ZhenshangResult;
import com.zyz.pojo.ZsItem;
import com.zyz.service.ItemService;

/**
 * 
 * Item控制器
 * 
 * @author zhangyunzhen
 * @version 2017年3月1日
 * @see ItemController
 * @since
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;
    
    /**
     * Description: <br>
     * 跳转到item的listUI页面
     * @param page 页好
     * @param rows 页大小
     * @return
     * @throws Exception 
     * @see
     */
    @RequestMapping(value="/listUI",method=RequestMethod.GET)
    @ResponseBody
    public PageResult listUI(Integer page,Integer rows) throws Exception{
        PageResult pageResult  = itemService.getPageResult(page, rows);
        return pageResult;
    }
    
    /**
     * 
     * Description: <br>
     *  保存item
     * @param item  item
     * @param desc 商品描述
     * @param itemParams 商品规格参数
     * @return 
     * @see
     */
    @ResponseBody
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public ZhenshangResult saveItem(ZsItem item, String desc, String itemParams) throws Exception{
        
        itemService.saveItem(item,desc,itemParams);
        return ZhenshangResult.ok();
    } 
}
