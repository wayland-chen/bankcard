package com.offke.core.annotation.stereotype;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>注入到原子交易中</p>
 *
 * @version 1.0
 * @since 212/3/31
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
    public enum Status {
        Run, Stop
    }

    public String tradeCode();

    public String tradeName();

    public String comment() default "";

    public String unpack() default "";

    public String pack() default "";

    public String viewconfig() default "";

    public Status status() default Status.Run;

    public String author();

    public String email() default "";

    public String createDate();

    public String version() default "v1.0";

    public String project() default "AppServerPlatform";


    //public Parameter[] params() default {@Parameter(inputs = {@Item(explain = "", id = "", name = "")}, outputs = {@Item(explain = "", id = "", name = "")})};

    //public Modified[] modified() default {@Modified};

    public Parameter[] params() default {};

    public Modified[] modified() default {};

    public boolean singleton() default false;

    public boolean internal() default false;

    /**
     * 是否限制操作员
     *
     * @return false不限制 true-限制
     */
    public boolean limitflag() default true;

    public Systematic systematic() default Systematic.WisdragonAll;

    /**
     * 交易运行时与账务相关
     *
     * @return false:不收费,true:收费
     */
    public boolean feeflag() default false;

    /**
     * @return //false:不做账务处理,true:账务处理
     */
    public boolean transflag() default false;


}
