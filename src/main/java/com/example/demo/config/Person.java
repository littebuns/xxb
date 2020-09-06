package com.example.demo.config;

import com.example.demo.entity.Dog;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中每一个属性中的值，映射到这个组件中
 * prefix 前缀
 *
 * 组件得添加到容器
 * @ConfigurationProperties 默认从全局配置文件中获取值
 * @PropertySource 指定配置文件
 *
 */
@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
@Data
public class Person {

    private String name;
    private String age;
    private Date birth;

    private Map<String, Object> map;
    private List<Object> list;
    private Dog dog;

}
