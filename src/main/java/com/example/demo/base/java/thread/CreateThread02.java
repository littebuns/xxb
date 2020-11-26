package com.example.demo.base.java.thread;

/**
 * 创建线程的第二种方式
 * 1.实现Runnable()接口,重写run()方法
 * 2.创建Runnable()实现类的实例并以此实例作为Thread的Target
 * 3.Thread.start
 */
public class CreateThread02 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }


    public static void main(String[] args) {
        Runnable runnable = new CreateThread02();
        Thread thread01 = new Thread(runnable);
        Thread thread02 = new Thread(runnable);
        thread01.setPriority(6);
        thread01.start();
        thread02.start();
    }

}
