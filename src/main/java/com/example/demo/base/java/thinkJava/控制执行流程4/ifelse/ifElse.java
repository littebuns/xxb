package com.example.demo.base.java.thinkJava.控制执行流程4.ifelse;

public class ifElse {
    static int result = 0;
    static void test(int source, int target){
        if (source > target){
            result = 1;
        }else if (source < target){
            result = -1;
        }else {
            result = 0;
        }
    }
    public static void main(String[] args) {
        test(10,5);
        System.out.println(result);
        test(5,10);
        System.out.println(result);
        test(5,5);
        System.out.println(result);
    }
}
