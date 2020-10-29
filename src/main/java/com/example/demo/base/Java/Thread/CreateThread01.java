package com.example.demo.base.Java.Thread;

/**
 * 创建线程的第一种方式
 * 继承Thread类，重写run()方法
 */
public class CreateThread01 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        //新建一个线程并使它进入新建状态
        Thread thread01 = new CreateThread01();
        Thread thread02 = new CreateThread01();
        //调用start()方法，使线程进入就绪状态
        thread01.start();
        thread02.start();
    }
}
