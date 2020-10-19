package com.example.demo.ioc;

import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class iocTest {

    @Autowired
    private User user;

    @Test
    public void ioc(){
        System.out.println(user);
    }
}
