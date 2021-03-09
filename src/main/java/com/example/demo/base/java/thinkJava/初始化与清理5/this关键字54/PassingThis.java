package com.example.demo.base.java.thinkJava.初始化与清理5.this关键字54;

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}

class Person {
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled(apple);
        System.out.println("Yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple){
        return apple;
    }
}

class Apple{
    Apple getPeeled(Apple apple) {
        return Peeler.peel(apple);
    }
}
