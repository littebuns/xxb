package com.example.demo.base.java.thinkJava.初始化与清理5.构造器初始化57;

public class Counter {
    int i;

    public Counter() {
        System.out.println(i);
        i = 7;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.i);
    }
}
