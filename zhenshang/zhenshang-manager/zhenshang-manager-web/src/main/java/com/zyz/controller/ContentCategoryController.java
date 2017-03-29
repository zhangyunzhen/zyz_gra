/*
 * 文件名：ContentCategoryController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月29日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * 
 * 内容类别controller
 * @author zhangyunzhen
 * @version 2017年3月29日
 * @see ContentCategoryController
 * @since
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyz.pojo.EasyUITreeNode;
import com.zyz.service.ContentCategoryService;

@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {

    /**
     * ContentCategoryService
     */
    @Autowired
    private ContentCategoryService catService;
    
    /**
     * 
     * Description: <br>
     * 内容分类树展示（异步加载）
     * 
     * @param parentId
     * @return 
     * @see
     */
    @RequestMapping(value="/list", method=RequestMethod.GET)
    @ResponseBody
    public List<EasyUITreeNode> findContentCatList(@RequestParam(value="id",defaultValue="0") long parentId){
        return catService.findContentCatList(parentId);
    }
    
}
