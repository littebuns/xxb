package com.example.demo.base.ExtendDemon;

/**
 * 面向对象的三大特征：封装，继承，多态   没有继承就没有多态
 * 继承主要解决的问题是共性抽取，把一些相同的属性或方法抽取出来，作为父类
 * 在继承中，“子类就是一个父类”，比如讲师就是一个员工
 */
public class Concept {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.method();
    }
}
