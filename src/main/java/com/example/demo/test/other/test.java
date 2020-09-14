package com.example.demo.test.other;

import com.example.demo.entity.Dog;
import org.springframework.beans.BeanUtils;

public class test {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.setAge(1);
        dog2.setAge(2);
        dog1.setName("1");
        BeanUtils.copyProperties(dog2, dog1);
        System.out.println(dog1);
    }
}
