package com.offke.core.bu.struct.pojo;

public class TableName {
    private String name;
    private String othername;

    public TableName(String name) {
        super();
        this.name = name;
    }

    public TableName(String name, String othername) {
        super();
        this.name = name;
        this.othername = othername;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public boolean isExistOtherName() {
        if (this.othername == null || this.othername.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public String wrap(String column) {
        String[] split = column.split(".");
        if (split.length == 2) {
            return (name + "." + split[1]).toLowerCase();
        } else {
            return (name + "." + column).toLowerCase();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
