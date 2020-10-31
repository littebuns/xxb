package com.example.demo.ioc;

import com.example.demo.entity.Dog;
import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class iocTest {


    //创建一个Spring的IOC容器实例，然后加载配置文件
    private final ApplicationContext ioc = new ClassPathXmlApplicationContext("bean.xml");

    @Test
    public void ioc(){
        User user = (User) ioc.getBean("user");
        System.out.println(user);
    }

    //用于测试ref的bean是否为同一个bean
    @Test
    public void iocRef(){
        System.out.println("容器启动完毕");
        Dog dog = (Dog) ioc.getBean("dog");
        User user = (User) ioc.getBean("user");
        User user1 = (User) ioc.getBean("user");
        System.out.println(user1);
        System.out.println(dog);
        System.out.println(dog == user.getDog());
    }

    @Test
    public void iocFactory(){
        User user = (User) ioc.getBean("userFactoryPojo");
        User user1 = (User) ioc.getBean("userFactoryPojo");
        System.out.println(user);
    }

    @Test
    public void beanTest(){
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1 == dog2);
    }

}
