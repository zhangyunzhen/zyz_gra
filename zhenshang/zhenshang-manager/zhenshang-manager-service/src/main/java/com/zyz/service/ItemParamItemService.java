/*
 * 文件名：ItemParamItemService.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月21日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.service;

import java.util.List;

import com.zyz.pojo.ZsItemParamItem;

/**
 * 商品规格参数service
 * @author zhangyunzhen
 * @version 2017年3月21日
 * @see ItemParamItemService
 * @since
 */
public interface ItemParamItemService {
    
    /**
     * 
     * Description: <br>
     * 根据商品Id获取商品参数
     * 
     * @param itemId
     * @return 
     * @see
     */
    ZsItemParamItem findItemParamByItemId(long itemId);
}
