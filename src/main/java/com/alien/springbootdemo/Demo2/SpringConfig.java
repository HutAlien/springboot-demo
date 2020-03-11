package com.alien.springbootdemo.Demo2;

import com.alien.springbootdemo.demo3.OtherConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Auther: FYJ
 * @Date: 2020/3/9 21:06
 * @Description:
 */
@Configuration
@Import(OtherConfiguration.class)   //引入其他配置 加入容器
public class SpringConfig {

    /**
     * @Bean的方式不够灵活，若需要加上一些判断（选择性加载）则就要用ImportSelector和Registrar
     *
     * ImportSelector（选择性导入）和Registrar（注册） 自定义装配
     *
     *@param
     *@return
     */
    @Bean
    public DefaultBean defaultBean(){
        return new DefaultBean();
    }
}
