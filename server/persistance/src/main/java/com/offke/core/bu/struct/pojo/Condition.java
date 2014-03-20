package com.offke.core.bu.struct.pojo;

public class Condition {
    /**
     * 常量定义
     */
    public final static String eq = "="; // 对应 SQL field = value ”表达式
    public final static String noteq = "!="; // 对应 SQL field != value ”表达式
    public final static String gt = ">"; // 对应 SQL 中的 “field > value ” 表达式
    public final static String ge = ">="; // 对应 SQL 中的 “field >= value” 表达式
    public final static String lt = "<"; // 对应 SQL 中的 “field < value” 表达式
    public final static String le = "<="; // 对应 SQL 中的 “field <= value” 表达式
    public final static String between = "BETWEEN"; // 对应 SQL 中的 BETWEEN 表达式
    public final static String notbetween = "NOT BETWEEN"; // 对应 SQL 中的 NOT
    // BETWEEN 表达式
    /**
     * like:对应 SQL 中的 “field like value” 表达式.
     *
     * @since JDK1.2
     */
    public final static String like = "LIKE"; // 对应 SQL 中的 “field like value”
    // 表达式
    /**
     * notlike:对应 SQL 中的 “field like value” 表达式.
     *
     * @since JDK1.2
     */
    public final static String notlike = "NOT LIKE"; // 对应 SQL 中的 “field like
    // value” 表达式
    public final static String in = "IN"; // 对应 SQL 中的 “field like value” 表达式
    public final static String notin = "NOT IN"; // 对应 SQL 中的 “field like value”
    // 表达式

    public final static String isNull = "IS NULL"; // 对应 SQL 中的" IS NULL"表达式
    public final static String isNotNull = "IS NOT NULL"; // 对应 SQL
    // 中的" IS NULL"表达式

    /**
     * 连接
     */
    public final static JoinCondition and = new JoinCondition("AND");
    public final static JoinCondition or = new JoinCondition("OR");

    private String name; // 字段
    private Object value; // 字段值或者连接字段
    private String operation = eq;// 运算符
    private JoinCondition join = and;// 连接条件
    private boolean option = false; // false: 可选项，true:必选项

    /**
     * 组织查询条件,可决定是否可选.
     *
     * @param name      查询字段
     * @param value     匹配值
     * @param operation 匹配类型(Condition.eq, Condition.like等)
     * @see com.offke.core.common.util.SqlAssembling
     */
    public Condition(String name, Object value, String operation) {
        this.name = name;
        this.value = value;
        this.operation = operation;
    }

    /**
     * 组织查询条件，默认为可选.
     *
     * @param name  查询字段
     * @param value 匹配值
     */
    public Condition(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    /**
     * 组织查询条件，带连接方式 or 或 and.
     *
     * @param name  查询字段
     * @param value 匹配值
     * @param join  联接方式(Condition.and, Condition.or)
     */
    public Condition(String name, Object value, JoinCondition join) {
        this.name = name;
        this.value = value;
        this.join = join;
    }

    /**
     * 组织查询条件.
     *
     * @param name      查询字段
     * @param value     匹配值
     * @param operation 匹配类型(Condition.eq, Condition.like等)
     * @param join      联接方式(Condition.and, Condition.or)
     */
    public Condition(String name, Object value, String operation, JoinCondition join) {
        this.name = name;
        this.value = value;
        this.operation = operation;
        this.join = join;
    }

    /**
     * 组织查询条件.
     *
     * @param name      查询字段
     * @param value     匹配值
     * @param operation 匹配类型(Condition.eq, Condition.like等)
     * @param option    是否必选,默认可选(true时值为空则抛出异常)
     */
    public Condition(String name, Object value, String operation, boolean option) {
        this.name = name;
        this.value = value;
        this.operation = operation;
        this.option = option;
    }

    /**
     * 组织查询条件.
     *
     * @param name   查询字段
     * @param value  匹配值
     * @param join   联接方式(Condition.and, Condition.or)
     * @param option 是否必选,默认可选(true时值为空则抛出异常)
     */
    public Condition(String name, Object value, JoinCondition join, boolean option) {
        this.name = name;
        this.value = value;
        this.join = join;
        this.option = option;
    }

    /**
     * 组织查询条件.
     *
     * @param name   查询字段
     * @param value  匹配值
     * @param option 是否必选,默认可选(true时值为空则抛出异常)
     */
    public Condition(String name, Object value, boolean option) {
        this.name = name;
        this.value = value;
        this.option = option;
    }

    /**
     * 组织查询条件.
     *
     * @param name      查询字段
     * @param value     匹配值
     * @param operation 匹配类型(Condition.eq, Condition.like等)
     * @param join      联接方式(Condition.and, Condition.or)
     * @param option    是否必选,默认可选(true时值为空则抛出异常)
     */
    public Condition(String name, Object value, String operation, JoinCondition join, boolean option) {
        this.name = name;
        this.value = value;
        this.operation = operation;
        this.join = join;
        this.option = option;
    }


    /**
     * 组织查询条件，默认为可选.
     *
     * @param value 匹配值
     */
    public Condition(ConditionValue value) {
        this.value = value;
    }

    /**
     * 组织查询条件，带连接方式 or 或 and.
     *
     * @param value 匹配值
     * @param join  联接方式(Condition.and, Condition.or)
     */
    public Condition(ConditionValue value, JoinCondition join) {
        this.value = value;
        this.join = join;
    }

    public JoinCondition getJoin() {
        return join;
    }

    public void setJoin(JoinCondition join) {
        this.join = join;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public boolean isOption() {
        return option;
    }

    public void setOption(boolean option) {
        this.option = option;
    }

}
