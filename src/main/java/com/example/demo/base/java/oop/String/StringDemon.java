package com.example.demo.base.java.oop.String;

/**
 * 程序中所有双引号字符串，都是String类的对象
 *
 * 1.字符串内容永不可变
 * 2.因为内容不可变，因此字符串可以共享使用
 * 3.字符串效果上相当于char[]数组，底层原理是byte[]字节数组 8位1字节
 *
 * 字符串常量池  用双引号写上的字符串才在池中
 * new的字符串不在常量池中，堆中
 */
public class StringDemon {

    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("d");
        //== 引用类型比较的是地址值   基本类型是比较的值
        System.out.println(str1 == str2);
        int a = 0;
        a = fun1(a);
        System.out.println(a);
        String str = "";
    }

    private static int fun1(int num) {
        return num + 1;
    }


}
