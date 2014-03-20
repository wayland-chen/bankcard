package com.offke.core.bu.struct.pojo;

public class OrderBy {
    public final static String asc = "ASC";
    public final static String desc = "DESC";

    private String fieldName; //字段名称
    private String fieldOrder = "ASC"; //顺序

    public OrderBy(String fieldName, String fieldOrder) {
        this.fieldName = fieldName;
        this.fieldOrder = fieldOrder;
    }

    public OrderBy(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldOrder() {
        return fieldOrder;
    }

    public void setFieldOrder(String fieldOrder) {
        this.fieldOrder = fieldOrder;
    }
}