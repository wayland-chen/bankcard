package com.offke.core.bu.struct.pojo;

/**
 * <p>自定义条件值</p>
 *
 * @version 1.0
 * @since 2012/04/27
 */
public class ConditionValue {
    private String value;

    public ConditionValue(String value) {
        super();
        this.value = value;
    }

    public static ConditionValue set(String value) {
        return new ConditionValue(value);
    }

    @Override
    public String toString() {
        return value;
    }

}
