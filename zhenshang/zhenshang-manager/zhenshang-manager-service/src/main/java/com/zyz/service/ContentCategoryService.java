/*
 * 文件名：ContentCategoryService.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月29日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zyz.pojo.EasyUITreeNode;

/**
 * 
 * 内容分类service
 * @author zhangyunzhen
 * @version 2017年3月29日
 * @see ContentCategoryService
 * @since
 */
public interface ContentCategoryService {
    
    /**
     * 
     * Description: <br>
     * 获取内容分类列表（使用easytree异步加载）
     * 
     * @param parentId
     * @return 
     * @see
     */
    List<EasyUITreeNode> findContentCatList(long parentId);
}