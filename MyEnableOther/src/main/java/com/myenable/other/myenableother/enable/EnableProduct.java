package com.myenable.other.myenableother.enable;

import com.myenable.other.myenableother.config.ProductConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ProductConfig.class)
public @interface EnableProduct {
}
