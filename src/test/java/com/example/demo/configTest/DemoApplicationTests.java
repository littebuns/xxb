package com.example.demo.configTest;

import com.example.demo.config.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 可以注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    Person person;

    //把spring的ioc容器注入进来
    @Autowired
    ApplicationContext ioc;

    /**
     * 测试容器中是否存在helloService
     */
    @Test
    void iocTest(){
        System.out.println(ioc.containsBean("helloService"));
        System.out.println(ioc.containsBean("helloService1"));
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
