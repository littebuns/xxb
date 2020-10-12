package com.example.demo.test.other;

import com.example.demo.entity.Dog;
import org.springframework.beans.BeanUtils;

public class test {

    public static void main(String[] args) {
        String str = "sf,uhu";
        String[] strings = str.split(",");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
