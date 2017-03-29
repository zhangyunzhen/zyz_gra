/*
 * 文件名：CatNode.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月28日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 商品分类节点pojo
 * @author zhangyunzhen
 * @version 2017年3月28日
 * @see CatNode
 * @since
 */
public class CatNode {
    
    /**
     * 节点url
     */
    @JsonProperty("u")
    private String url;
    /**
     * 节点名称
     */
    @JsonProperty("n")
    private String name;
    /**
     * 节点的孩子节点
     */
     @JsonProperty("i")
    private List<?> item;
    
    
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<?> getItem() {
        return item;
    }
    public void setItem(List<?> item) {
        this.item = item;
    }
    
}
