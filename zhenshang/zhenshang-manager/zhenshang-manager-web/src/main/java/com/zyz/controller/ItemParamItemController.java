/*
 * 文件名：ItemParamItemController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月21日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.zyz.pojo.ZsItemParamItem;
import com.zyz.service.ItemParamItemService;
import com.zyz.utils.JsonUtils;


/**
 * 商品规格参数controller
 * @author zhangyunzhen
 * @version 2017年3月21日
 * @see ItemParamItemController
 * @since
 */
@Controller
public class ItemParamItemController {

    /**
     * ItemParamItemService
     */
    @Autowired
    private ItemParamItemService itemParamItemService;

    /**
     * 
     * Description: <br>
     * 根绝itemId获取规格参数
     * 
     * @param itemId
     * @return 
     * @see
     */
    @RequestMapping(value = "/param/{itemId}", method = RequestMethod.GET)
    public String findItemParamByItemId(@PathVariable long itemId, Model model) {
        ZsItemParamItem param = itemParamItemService.findItemParamByItemId(itemId);
        //规格参数信息
        String paramData = param.getParamData();

        //生成html
        // 把规格参数json数据转换成java对象
        List<Map> jsonList = JsonUtils.jsonToList(paramData, Map.class);
        StringBuffer sb = new StringBuffer();
        sb.append(
            "<table cellpadding=\"0\" cellspacing=\"1\" width=\"100%\" border=\"1\" class=\"Ptable\">\n");
        sb.append("    <tbody>\n");
        for (Map m1 : jsonList) {
            sb.append("        <tr>\n");
            sb.append(
                "            <th class=\"tdTitle\" colspan=\"2\">" + m1.get("group") + "</th>\n");
            sb.append("        </tr>\n");
            List<Map> list2 = (List<Map>)m1.get("params");
            for (Map m2 : list2) {
                sb.append("        <tr>\n");
                sb.append("            <td class=\"tdTitle\">" + m2.get("k") + "</td>\n");
                sb.append("            <td>" + m2.get("v") + "</td>\n");
                sb.append("        </tr>\n");
            }
        }
        sb.append("    </tbody>\n");
        sb.append("</table>");

        model.addAttribute("params", sb);
        return "param";
    }

}
