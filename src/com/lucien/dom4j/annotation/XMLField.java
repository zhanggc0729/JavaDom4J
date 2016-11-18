package com.lucien.dom4j.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
  *   @author  zhanggc@qianbaocard.com
  *   @time:2016年11月17日 下午3:09:29
  *   @Description:
*/
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
public @interface XMLField {
    int ordinal() default 0;//排序

    String name() default "";//别名
    boolean hasNextLevel() default false;
    //upper：大写  lower：小写 default：默认        hump:驼峰
    String format() default "default";
    boolean isEncrypt() default true;//是否参加加密

}
