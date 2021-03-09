package com.example.demo.base.java.thinkJava.初始化与清理5.方法重载52;

/** 1. 创建Tree对象的时候，可以不含参数，也可以用树的高度来做参数
 * 2. 如果我们想用多种方式来调用info()方法，对于相同概念使用不同方法，一定会让人很柠檬。有了方法重载，可以为两者使用相同的名字。
 * @author HP
 */
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree tree = new Tree(i);
            tree.info();
            tree.info("overloaded method");
        }
        new Tree();
    }
}

class Tree {
    int height;

    public Tree() {
        System.out.println("planting a seeding");
    }

    public Tree(int height) {
        this.height = height;
        System.out.println("creating new Tree is " + height + " feet tall");
    }

    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s){
        System.out.println(s + ":Tree is " + height + " feet tall");
    }
}
