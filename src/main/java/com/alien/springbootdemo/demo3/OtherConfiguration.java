package com.alien.springbootdemo.demo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: FYJ
 * @Date: 2020/3/9 20:58
 * @Description:
 */
@Configuration
public class OtherConfiguration {
    @Bean
    public OtherBean otherBean(){
        return new OtherBean();
    }
}
