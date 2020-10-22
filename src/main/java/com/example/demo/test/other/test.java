package com.example.demo.test.other;

import com.example.demo.entity.Dog;
import org.springframework.beans.BeanUtils;

class Test {

    //以可变长度参数列表作为传参
    private static void test(String...strings){
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        String str = "dsfa?dsf?sfd";
        str.split("\\?");
        test("a","b");
        test(new String[]{"a","b"});
    }

}
