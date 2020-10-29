package com.example.demo.base.Java.Constructor;

/**
 * 构造方法是用来专门创建对象的方法
 * 当我们通过关键字new来创建对象的时候，就是在调用构造方法
 * 构造方法不能return一个具体的返回值
 * 如果没有编写任何构造方法，会有一个默认的构造方法 public Student() {}
 * 一旦编写了构造方法，默认构造方法会失效
 * 多个构造方法即重载 方法名相同，参数不同
 */
public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("构造方法执行");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
