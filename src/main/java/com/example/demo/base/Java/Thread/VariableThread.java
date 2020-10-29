package com.example.demo.base.Java.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 线程中变量访问问题
 * 匿名内部类访问外部类对象时会默认加上final修饰
 * 因为内部类使用外部类对象是引用传递
 * 会出现外部类对象引用改变而内部类无从获取，而导致一些无法预估的问题
 */
public class VariableThread {

    public static void test(){
        ExecutorService pool = Executors.newFixedThreadPool(5);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            Future<Integer> submit = pool.submit(() -> {
                System.out.println("当前线程" + Thread.currentThread().getName() + "输出:" + finalI);
                return finalI;
            });
        }


//        for (int i = 0; i < 10; i++) {
//            Future<?> future = pool.submit(() -> {
//                System.out.println(list.get());
//            });
//        }
    }

    public static void main(String[] args) {
        VariableThread.test();
    }
}
