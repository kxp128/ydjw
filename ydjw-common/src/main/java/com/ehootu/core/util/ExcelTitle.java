package com.ehootu.core.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 说明：excel导出时显示的title名
 *
 * @author lupan
 * @version 2016/9/12 14:40
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelTitle {
    public String value() default "未指定标题";

    public String[] needTypes() default "";
}
