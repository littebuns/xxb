package com.example.demo.base.java.generic;

import com.example.demo.entity.Dog;

/**
 * 1. 在类上定义的泛型，在类的方法中也可以使用
 * @author HP
 */
public class ObjectTool<T> {

    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }


    public <T> void show(T t){
        System.out.println(t);
    }


    public static void main(String[] args) {
        //创建对象并指定元素类型
        ObjectTool<String> objectTool = new ObjectTool<>();
        /**
         * 如果我这时候想传入Long类型的数据，那么编译期间就无法通过
         * 体现了泛型设计的原则：
         * 只要在编译期间没有出现警告，那么运行时期不会出现ClassCastException异常
         */
        objectTool.setObj("xxb");
        System.out.println(objectTool.getObj());


        //调用方法 传入什么数据类型就展示什么数据类型
        objectTool.show("sfd");
        objectTool.show(1);
        objectTool.show(new Dog("hxt"));
    }
}
