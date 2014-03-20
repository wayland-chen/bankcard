package com.offke.core.annotation.stereotype;

public @interface Item {
    /*
     * 定量定义
     */
    String reasoncode = "reasoncode";
    String reasonremark = "reasonremark";

    public enum Type {
        INT, INTEGER, LONG, STRING, FLOAT, DOUBLE, BIGDECIMAL, JsonObject, JSONOBJECT, JsonArray, JSONARRAY, Map, MAP, List, LIST
    }

    ;

    public String classify() default "";

    public enum Nullable {
        YES, NO
    }

    ;

    public String id();

    public String name();

    public Nullable nullable() default Nullable.NO;

    public Type type() default Type.STRING;

    public String explain();
}
