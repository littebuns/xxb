package com.example.demo.ioc;

import com.example.demo.Dao.Impl.UserDaoImpl;
import com.example.demo.Dao.UserDao;
import com.example.demo.entity.Dog;
import com.example.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class iocTest {


    //创建一个Spring的IOC容器实例，然后加载配置文件
    private final ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:bean.xml");

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

    /**
     * spring连接池测试
     */
    @Test
    public void jdbcPoolTest(){
        DataSource dataSource = ioc.getBean(DataSource.class);
        log.info("xml配置的数据：" + dataSource.toString());
    }

    /**
     * SPEL 和 XML 自动装配测试
     */
    @Test
    public void SpeLTest(){
        User user = (User) ioc.getBean("userSpeL");
        log.info(user.toString());
    }

    /**
     * 基于注解添加bean
     */
    @Test
    public void annotationTest(){
        UserDao userDao = (UserDaoImpl) ioc.getBean("userDaoImpl");
        log.info(userDao.toString());
    }

}
