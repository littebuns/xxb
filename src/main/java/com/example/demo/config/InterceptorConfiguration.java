package com.example.demo.config;

import com.example.demo.config.interceptor.Interceptor;
import com.example.demo.config.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * 注册拦截器
 * 拦截规则
 * 1.一个*：匹配字符，不匹配路径/
 * 2.两个**: 匹配字符和路径
 */
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor myInterceptor;
    @Autowired
    private Interceptor interceptor;

    //定义一个数组来保存不被拦截的路径
    final String[] excludes = {"/login"};
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //去拦截登录接口
        registry.addInterceptor(myInterceptor).addPathPatterns("/**").excludePathPatterns(excludes).order(1);
        registry.addInterceptor(interceptor).addPathPatterns("/**").excludePathPatterns(excludes).order(0);
    }

    //这个方法告诉系统，这些是被当成静态文件的
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    }
}
