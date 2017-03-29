/*
 * 文件名：TestPageHelper.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月1日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zyz.mapper.ZsItemMapper;
import com.zyz.pojo.ZsItem;
import com.zyz.pojo.ZsItemExample;

/**
 * 测试分页插件pageHelper
 * @author zhangyunzhen
 * @version 2017年3月1日
 * @see TestPageHelper
 * @since
 */
public class TestPageHelper {
    /**
     * 
     * Description:测试Pagehelper
     *  
     * @see
     */
    @Test
    public void testPageHelper(){
        //创建一个spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        //从容器获取ZsItemMapper的代理对象
        ZsItemMapper itemMapper = applicationContext.getBean(ZsItemMapper.class);
        //创建条件查询类
        ZsItemExample itemExample = new ZsItemExample();
        //分页处理（通过拦截器拦截）
        PageHelper.startPage(1, 10);
        //执行查询
        List<ZsItem> items = itemMapper.selectByExample(itemExample);
        //输出商品信息
        for (ZsItem zsItem : items) {
            System.out.println(zsItem.getTitle());
        }
        //创建PageInfo对象，获取总记录数
        PageInfo<ZsItem> info = new PageInfo<>(items);
        long total = info.getTotal();
        System.out.println("一共"+total);
    }
}
