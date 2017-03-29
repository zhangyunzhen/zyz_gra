/*
 * 文件名：Index.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月24日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {
   
    @RequestMapping("/index.html")
    public String indexUI(){
        return "index";
    }
}
