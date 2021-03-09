package com.example.demo.base.java.thinkJava.控制执行流程4.foreach语法;

import java.util.Random;

public class ForEachFloat {
    public static void main(String[] args) {
        Random random = new Random(47);
        Float f[] = new Float[10];
        for (int i = 0; i < 10; i++){
            f[i] = random.nextFloat();
        }
        for (Float x : f){
            System.out.println(x);
        }
    }
}
