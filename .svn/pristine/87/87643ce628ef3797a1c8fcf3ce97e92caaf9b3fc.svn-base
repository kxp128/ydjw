package com.ehootu.core.feature.orm.mybatis;

import org.apache.ibatis.session.RowBounds;
import java.util.ArrayList;
import java.util.List;

/**
 * Mybatis分页参数及查询结果封装. 注意所有序号从1开始.
 * 
 * @param <T>
 *            Page中记录的类型.
 *
 * @since 2014年5月18日 下午1:34:32
 **/
public class Page<T> extends RowBounds {
    // --分页参数 --//
    /**
     * 页编号 : 第几页
     */
    protected int pageNum = 1;
    /**
     * 页大小 : 每页的数量
     */
    protected int pageSize = 10;
    
    /**
     * 重绘参数
     */
    protected int draw =0;

    /**
     * 偏移量 : 第一条数据在表中的位置
     */
    protected int offset;

    /**
     * 限定数 : 每页的数量
     */
    protected int limit;

    // --结果 --//
    /**
     * 查询结果
     */
    protected List<T> result = new ArrayList<T>();

    /**
     * 总条数
     */
    protected long totalCount;

    /**
     * 总页数
     */
    protected long totalPages;

    // --计算 数据库 查询的参数 : LIMIT 3, 3; LIMIT offset, limit; --//
    /**
     * 计算偏移量
     */
    private void calcOffset() {
        this.offset = ((pageNum - 1) * pageSize);
    }

    /**
     * 计算限定数
     */
    private void calcLimit() {
        this.limit = pageSize;
    }

    // -- 构造函数 --//
    public Page() {
        this.calcOffset();
        this.calcLimit();
    }
    


    public Page(int pageNo, int pageSize) {
        this.pageNum = pageNo;
        this.pageSize = pageSize;
        this.calcOffset();
        this.calcLimit();
    }

    // -- 访问查询参数函数 --//
    /**
     * 获得当前页的页号,序号从1开始,默认为1.
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * 获得每页的记录数量,默认为1.
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 根据pageNo和pageSize计算当前页第一条记录在总结果集中的位置,序号从1开始.
     */
    public int getFirst() {
        return ((pageNum - 1) * pageSize) + 1;
    }

    /**
     * 根据pageNo和pageSize计算当前页第一条记录在总结果集中的位置,序号从0开始.
     */
    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    // -- 访问查询结果函数 --//
    /**
     * 取得页内的记录列表.
     */
    public List<T> getResult() {
        return result;
    }

    /**
     * 设置页内的记录列表.
     */
    public void setResult(final List<T> result) {
        this.result = result;
    }

    /**
     * 取得总记录数, 默认值为-1.
     */
    public long getTotalCount() {
        return totalCount;
    }

    /**
     * 设置总记录数.
     */
    public void setTotalCount(final long totalCount) {
        this.totalCount = totalCount;
        this.totalPages = this.getTotalPages();
    }

    /**
     * 根据pageSize与totalCount计算总页数, 默认值为-1.
     */
    public long getTotalPages() {
        if (totalCount < 0) {
            return -1;
        }
        long pages = totalCount / pageSize;
        return totalCount % pageSize > 0 ? ++pages : pages;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        this.calcOffset();
        this.calcLimit();
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
        this.calcOffset();
        this.calcLimit();
    }

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

}
