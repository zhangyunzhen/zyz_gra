/*
 * 文件名：ItemController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年2月27日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyz.pojo.ZsItem;
import com.zyz.service.ItemService;

/**
 * 商品控制器 
 *
 * @author zyz
 * @version 2017年2月27日
 * @see TestItemController
 * @since
 */
@Controller
public class TestItemController {

    @Autowired
    private ItemService itemService;
   
    @RequestMapping(value="item/{itemId}", method = RequestMethod.GET)
    @ResponseBody
    public ZsItem selectById(@PathVariable long itemId ) {
        ZsItem item = itemService.findById(itemId);
        return item;
    }
    
}
