package com.alien.springbootdemo.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * @Auther: FYJ
 * @Date: 2020/3/9 20:40
 * @Description:
 */
@ComponentScan//会加载当前包下的所有类到IOC中
public class ConfigurationDemo {

    public static void main(String[] args) {
       /* ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationClass.class);
        DemoClass demoClass=context.getBean(DemoClass.class);
        demoClass.say();*/
        //
        ApplicationContext context1=new AnnotationConfigApplicationContext(ConfigurationDemo.class);
        String[] defNames=context1.getBeanDefinitionNames();
        Arrays.stream(defNames).forEach(System.out::println);
    }
}
