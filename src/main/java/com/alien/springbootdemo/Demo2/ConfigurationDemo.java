package com.alien.springbootdemo.Demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @Auther: FYJ
 * @Date: 2020/3/9 20:40
 * @Description: SpringBoot是怎么实现自动装配的
 */

public class ConfigurationDemo {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] defNames=context.getBeanDefinitionNames();
        Arrays.stream(defNames).forEach(System.out::println);
    }
}
