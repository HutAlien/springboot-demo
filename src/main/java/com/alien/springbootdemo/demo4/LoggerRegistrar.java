package com.alien.springbootdemo.demo4;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

/**
 * @Auther: FYJ
 * @Date: 2020/3/9 22:13
 * @Description: 自定义装配 注册bean
 */
public class LoggerRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        Class beanClass=LoggerService.class;
        RootBeanDefinition beanDefinition=new RootBeanDefinition(beanClass);
        String beanName= StringUtils.uncapitalize(beanClass.getSimpleName());//首字母转换为小写
        registry.registerBeanDefinition(beanName,beanDefinition);
    }

}
