/*
 * 文件名：ItemparamService.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月20日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.service;

import org.springframework.stereotype.Service;

import com.zyz.pojo.ZhenshangResult;
import com.zyz.pojo.ZsItemParam;

/**
 * 商品参数模板interface
 * 
 * @author zhangyunzhen
 * @version 2017年3月20日
 * @see ItemparamService
 * @since
 */
public interface ItemparamService {
    
    /**
     * 
     * Description: <br>
     * 根据商品类别id查询item规格参数模板
     * 
     * @param ItemCatID 商品类别Id
     * @see
     */
     ZhenshangResult findItemParamByItemCatID(long ItemCatID);
     
     /**
      * 
      * Description: <br>
      * 保存商品规格参数模板
      * 
      * @param ZsItemParam 规格参数模板
      * @return ZhenshangResult
      * @see
      */
     ZhenshangResult saveItemParamTemplate(ZsItemParam itemParam);
}
