package com.alien.springbootdemo.demo4;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({CacheImportSelector.class,LoggerRegistrar.class})
public @interface EnableDefine {

    String[] excludeName() default {};
}
