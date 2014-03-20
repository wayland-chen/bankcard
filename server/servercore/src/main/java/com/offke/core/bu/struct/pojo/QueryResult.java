package com.offke.core.bu.struct.pojo;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryResult {
    private int position;
    private int pageNo;
    private int pageSize;
    private long totalItems;
    private List<?> result;
    private Map<String, DataType> formats = new HashMap<String, DataType>();
    private Object columns;

    private ResultSet resultSet;

    public QueryResult() {
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(long totalItems) {
        this.totalItems = totalItems;
    }

    public List<?> getResult() {
        return result;
    }

    public void setResult(List<?> result) {
        this.result = result;
    }

    public Map<String, DataType> getFormats() {
        return formats;
    }

    public void setColumns(Object columns) {
        this.columns = columns;
    }

    public Object getColumns() {
        return columns;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }


}
