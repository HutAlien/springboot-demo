package com.alien.springbootdemo.demo4;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;


/**
 * @Auther: FYJ
 * @Date: 2020/3/9 21:23
 * @Description: 自定义装配 选择加载器（判断 选择性导入）
 */
public class CacheImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //获取注解信息
        Map<String, Object> map=annotationMetadata.getAnnotationAttributes(EnableDefine.class.getName());
        //进行逻辑判断
        map.get("excludeName");
        return new String[]{CacheService.class.getName()};//返回需要加载的类名
    }
}
