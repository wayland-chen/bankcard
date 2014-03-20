/*
 * SimplePage.java  v1.00  2012-4-16
 * Peoject	com.wisdragon.splus-core
 * Copyright (c) 2012 Wisdragon
 *
 * Filename	:	SimplePage.java  v1.00 2012-4-16
 * Project	: 	com.wisdragon.splus-core
 * Copyight	:	Copyright (c) 2012 Wisdragon
 */
package com.offke.core.bu.struct.pojo;

/**
 * 分页简单实现.
 *
 * @version v1.00
 * @since 1.00 2012-4-16
 */
public class SimplePage implements Paginable {

    protected long totalItems = 0;
    protected int pageSize = 20;
    protected int pageNo = 1;

    /**
     * 检查页码 checkPageNo
     *
     * @param pageNo
     * @return if pageNo==null or pageNo<1 then return 1 else return pageNo
     */
    public static int cpn(Integer pageNo) {
        return (pageNo == null || pageNo < 1) ? 1 : pageNo;
    }

    public SimplePage() {
    }

    /**
     * 构造器
     *
     * @param pageNo     页码
     * @param pageSize   每页几条数据
     * @param totalItems 总共几条数据
     */
    public SimplePage(int pageNo, int pageSize, int totalItems) {
        setTotalItems(totalItems);
        setPageSize(pageSize);
        setPageNo(pageNo);

        if (pageNo == 1) {
            return;
        }
        int tp = getTotalPage();
        if (pageNo > tp) {
            pageNo = tp;
        }
    }

    /**
     * 获得页码
     */
    public int getPageNo() {
        return pageNo;
    }

    /**
     * 每页几条数据
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 总共几条数据
     */
    public long getTotalItems() {
        return totalItems;
    }

    /**
     * 总共几页
     */
    public int getTotalPage() {
        return (int) Math.ceil((double) totalItems / (double) getPageSize());
    }

    /**
     * 是否第一页
     */
    public boolean isFirstPage() {
        return pageNo <= 1;
    }

    /**
     * 是否最后一页
     */
    public boolean isLastPage() {
        return pageNo >= getTotalPage();
    }

    /**
     * 下一页页码
     */
    public int getNextPage() {
        if (isLastPage()) {
            return pageNo;
        } else {
            return pageNo + 1;
        }
    }

    /**
     * 上一页页码
     */
    public int getPrePage() {
        if (isFirstPage()) {
            return pageNo;
        } else {
            return pageNo - 1;
        }
    }

    /**
     * if totalItems<0 then totalItems=0
     *
     * @param totalItems
     */
    public void setTotalItems(long totalItems) {
        if (totalItems < 0) {
            this.totalItems = 0;
        } else {
            this.totalItems = totalItems;
            if (getTotalPage() < getPageNo()) {
                setPageNo(getTotalPage());
            }
        }
    }

    /**
     * if pageSize< 1 then pageSize=20
     *
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        if (pageSize < 1) {
            this.pageSize = 20;
        } else {
            this.pageSize = pageSize;
        }
    }

    /**
     * if pageNo < 1 then pageNo=1
     *
     * @param pageNo
     */
    public void setPageNo(int pageNo) {
        if (pageNo < 1) {
            this.pageNo = 1;
        } else {
            this.pageNo = pageNo;
        }
    }

    public int getPosition() {
        return ((pageNo - 1) * pageSize);
    }
}