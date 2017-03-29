/*
 * 文件名：ItemServiceImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年2月27日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.service;

import com.zyz.pojo.PageResult;
import com.zyz.pojo.ZsItem;

/**
 * 
 *  商品service接口
 *      test
 * @author zyz
 * @version 2017年2月27日
 * @see ItemService
 * @since
 */
public interface ItemService {

    /**
     * Description: <br>
     * 根据商品id查询商品信息
     * 
     * @param id 商品id
     * @return 
     * @see
     */
   ZsItem findById(long id);
   
   /**
    * 
    * Description: <br>
    * 返回easyUI需要的分页参数
    * 
    * @param page  pageNumber页号
    * @param rows  pageSize页大小
    * @return 
    * @see
    */
   PageResult getPageResult(int page, int rows) throws Exception;
   
   /**
    * 
    * Description: <br>
    * 保存item
    * 
    * @param item 商品
    * @param desc 商品描述
    * @throws Exception 
    * @see
    */
   void saveItem(ZsItem item, String desc, String itemParams) throws Exception;
   
   
}
