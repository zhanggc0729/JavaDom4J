package com.lucien.dom4j.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
  *   @author  zhanggc@qianbaocard.com
  *   @time:2016年12月1日 下午3:32:03
  *   @Description:
*/
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE ,ElementType.PARAMETER })
public @interface XMLRoot {
    String name() default "";//别名
}
