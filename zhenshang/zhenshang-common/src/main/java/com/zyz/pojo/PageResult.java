/*
 * 文件名：EUDataGridResult.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zyz
 * 修改时间：2017年3月1日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.zyz.pojo;

import java.util.List;

/**
 * 返回easyUI需要的分页参数
 * 
 * @author zhangyunzhen
 * @version 2017年3月1日
 * @see PageResult
 * @since
 */
public class PageResult {
    /**
     * 总记录数
     */
    private long total;
    /**
     * 查询记录列表
     */
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public PageResult() {
        super();
    }

    public PageResult(long total, List<?> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

}
