/*
 * 文件名：ItemCatController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月28日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonGenerator;
import com.zyz.service.ItemCatService;

/**
 * 商品类别展示
 * @author zhangyunzhen
 * @version 2017年3月28日
 * @see ItemCatController
 * @since
 */
@Controller
@RequestMapping("/itemcat")
public class ItemCatController {

    /**
     * ItemCatService
     */
    @Autowired
    private ItemCatService catService;
    
    @RequestMapping(value="/list",
        produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")//解决返回json的编码问题
    @ResponseBody
    public String findItemCats(String callback){
        String result= catService.findItemCats();
        //js不能跨域请求，只能请求js方法
         result =callback+"("+result+")";
        return result;
    }
    
    
    
}
