package com.example.demo.base.java.thinkJava.初始化与清理5.this关键字54;

public class Leaf {
    int i = 1;

    Leaf increment(){
        i++;
        return this;
    }

    void print(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }
}
