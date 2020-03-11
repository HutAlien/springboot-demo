package com.alien.springbootdemo.demo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther: FYJ
 * @Date: 2020/3/9 21:44
 * @Description: SpringBoot自动装配原理
 */
@EnableDefine(excludeName = "123")
@SpringBootApplication
public class DemoMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(DemoMain.class, args);
        CacheService cacheService=context.getBean(CacheService.class);
        LoggerService loggerService=context.getBean(LoggerService.class);
        cacheService.say();
        loggerService.print();
    }


    //SpringFactoriesLoader

    /**
     * SpringBoot里面是怎么实现自动装配的？
     *
     * 比如 你在pom文件中引入了redis的依赖，在SpringIOC中就可以直接获取redis相关的bean
     *
     * 这是因为在引入依赖的时候，在对应项目的resource目录META-INF路径下的spring.factories文件中 申明了需要自动装配
     * 的类。
     *
     *
     *
     */
}
