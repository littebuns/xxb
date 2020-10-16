package com.example.demo.base.DesignPattern.SingletonPattern;

public class SingleObject {

    //创建SingleObject的唯一对象
    private static final SingleObject instance = new SingleObject();

    //让构造函数为private 这样这个类就不会被实例化
    private SingleObject() {
    }

    //返回SingleObject的单例
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World");
    }

}
