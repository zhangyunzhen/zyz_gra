
package com.zyz.pojo;

/**
 * 树节点信息
 *      用于传递easyUI的tree使用的节点属性
 * @author zhangyunzhen
 * @version 2017年3月2日
 * @see EasyUITreeNode
 * @since
 */
public class EasyUITreeNode {
    /**
     *节点id 
     */
    private long id;
    /**
     * 节点标题
     */
    private String text;
    /**
     * 节点状态（判断节点是否是叶子节点）
     * 值：closed:不是叶子结点    open:叶子结点
     */
    private String state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public EasyUITreeNode() {
        super();
        // TODO Auto-generated constructor stub
    }

    public EasyUITreeNode(long id, String text, String state) {
        super();
        this.id = id;
        this.text = text;
        this.state = state;
    }

}
