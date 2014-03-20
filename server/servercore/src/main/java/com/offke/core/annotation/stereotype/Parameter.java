package com.offke.core.annotation.stereotype;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>原子交易入口以及出口参数设置</p>
 *
 * @version 1.0
 * @since 212/3/31
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Parameter {
    public String classify() default "";

    public String demo() default "";

    public Item[] inputs();

    public Item[] outputs();
}
