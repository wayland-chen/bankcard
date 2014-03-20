/*
 * Paginable.java  v1.00  2012-4-16
 * Peoject	com.wisdragon.splus-core
 * Copyright (c) 2012 Wisdragon
 *
 * Filename	:	Paginable.java  v1.00 2012-4-16
 * Project	: 	com.wisdragon.splus-core
 * Copyight	:	Copyright (c) 2012 Wisdragon
 */
package com.offke.core.bu.struct.pojo;

/**
 * 分页接口.
 *
 * @author <a href="mailto:genliang.jiang@wisdragon.com">蒋根亮</a>
 * @version v1.00
 * @since 1.00 2012-4-16
 */
public interface Paginable {

    /**
     * 总记录数
     *
     * @return
     */
    public long getTotalItems();

    /**
     * 总页数
     *
     * @return
     */
    public int getTotalPage();

    /**
     * 每页记录数
     *
     * @return
     */
    public int getPageSize();

    /**
     * 当前页号
     *
     * @return
     */
    public int getPageNo();

    /**
     * 是否第一页
     *
     * @return
     */
    public boolean isFirstPage();

    /**
     * 是否最后一页
     *
     * @return
     */
    public boolean isLastPage();

    /**
     * 返回下页的页号
     */
    public int getNextPage();

    /**
     * 返回上页的页号
     */
    public int getPrePage();

}
