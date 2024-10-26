package com.example.mycondition.annotation;

import com.example.mycondition.condition.MyClassCondition2;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(MyClassCondition2.class)
public @interface MyConditionalOnClass {
    String[] value();       // 定义注解的值
}
