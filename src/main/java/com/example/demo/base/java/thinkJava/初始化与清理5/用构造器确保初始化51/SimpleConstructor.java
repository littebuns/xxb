package com.example.demo.base.java.thinkJava.初始化与清理5.用构造器确保初始化51;

/**
 * 1. 当new Rock()的时候，将会为对象分配存储空间，并调用相应的构造器。这就确保了在操作对象之前，它已经被初始化了。
 * 2. 构造器的名称与类名相同，所以 "每个方法首字母小写" 的编码风格不适用构造器。
 * 3. 不接受任何参数的构造器叫做 "无参构造器"
 * 4. 构造器是一种特殊的方法，因为它没有返回值
 * @author HP
 */
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}

class Rock {
    public Rock() {
        System.out.println("Rock");
    }

}
