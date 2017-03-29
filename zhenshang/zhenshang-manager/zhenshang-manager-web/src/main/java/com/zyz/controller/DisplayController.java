/*
 * 文件名：DisplayController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年2月28日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 *  后台总览Controller
 * @author zhangyunzhen
 * @version 2017年2月28日
 * @see DisplayController
 * @since
 */
@Controller
public class DisplayController {

    /**
     * 跳转到首页
     *
     * @return String
     * @see
     */
    @RequestMapping(value = "/")
    public String showHome() {
        return "index";
    }
    
    /**
     * 跳转到其他页面
     * @param page
     * @return string
     * @see
     */
    @RequestMapping("/{page}")
    public String showpage(@PathVariable String page) {
        return page;
    }

}
