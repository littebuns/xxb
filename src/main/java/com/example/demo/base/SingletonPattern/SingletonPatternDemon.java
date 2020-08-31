package com.example.demo.base.SingletonPattern;

public class SingletonPatternDemon {

    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取SingleObject的单例
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
