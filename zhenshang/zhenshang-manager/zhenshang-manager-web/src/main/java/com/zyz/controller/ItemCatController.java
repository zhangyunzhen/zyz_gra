/*
 * 文件名：ItemCatController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月2日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyz.pojo.EasyUITreeNode;
import com.zyz.service.ItemCatService;
import com.zyz.service.impl.ItemCatServiceImpl;


/**
 * 
 * 商品类别Controller
 * @author zhangyunzhen
 * @version 2017年3月2日
 * @see ItemCatController
 * @since
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {
    /**
     * 注入ItemCatService
     */
    @Autowired
    private ItemCatService itemCatService;

   /**
    * 
    * Description: <br>
    * 得到商品类别节点信息
    * 
    * @param parentID  父节点Id
    * @return 同级的节点
    * @see
    */
    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUITreeNode> getItemCatList(@RequestParam(value="id",defaultValue="0") long parentID){
        List<EasyUITreeNode> nodes = itemCatService.getEasyUITreeNodes(parentID);
        return nodes;
    }
}
