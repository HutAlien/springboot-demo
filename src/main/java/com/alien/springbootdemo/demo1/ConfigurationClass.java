package com.alien.springbootdemo.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: FYJ
 * @Date: 2020/3/9 20:38
 * @Description:
 */
@Configuration
public class ConfigurationClass {

    @Bean
    public DemoClass demoClass(){
        return new DemoClass();
    }
}
