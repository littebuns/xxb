package com.example.demo.ioc;

import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.support.XmlWebApplicationContext;


@RunWith(SpringRunner.class)
@SpringBootTest
public class iocTest {


    //创建一个Spring的IOC容器实例，然后加载配置文件
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("bean.xml");

    @Test
    public void ioc(){
        User user = (User) ioc.getBean("user");
        System.out.println(user);
    }
}
