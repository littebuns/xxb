package com.example.demo.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Configuration 表明当前类是配置类，代替之前的Spring配置文件
 * 配置文件中使用<bean></bean>添加组件
 */

@Configuration
public class MyAppConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.other")
    DataSource otherDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    JdbcTemplate otherJdbcTemplate(@Qualifier("otherDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
