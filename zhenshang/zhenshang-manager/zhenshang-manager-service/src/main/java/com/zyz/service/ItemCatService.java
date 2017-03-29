
package com.zyz.service;

import java.util.List;

import com.zyz.pojo.EasyUITreeNode;

/**
 * 商品类别servic接口
 * 
 * @author zhangyunzhen
 * @version 2017年3月2日
 * @see ItemCatService
 * @since
 */
public interface ItemCatService {
    /**
     * 
     * Description: <br>
     * 根据父节点ID获得easyUI需要的子节点信息
     * 
     * @param parentID
     * @return 
     * @see
     */
    List<EasyUITreeNode> getEasyUITreeNodes(long parentID);
}
