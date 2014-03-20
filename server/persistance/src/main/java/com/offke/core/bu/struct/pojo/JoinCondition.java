package com.offke.core.bu.struct.pojo;

public class JoinCondition {
    private String join;

    public JoinCondition(String join) {
        this.join = join;
    }

    @Override
    public String toString() {
        return join;
    }
}