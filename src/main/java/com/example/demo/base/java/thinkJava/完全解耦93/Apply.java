package com.example.demo.base.java.thinkJava.完全解耦93;

import java.util.Arrays;

/**
 * 一个方法操作的是类，那么只能使用这个类和其子类
 * 如果我们想要这个方法操作 不在这个继承结构之中的类，那是不行的
 * 比如我们看到了一个Filter类，好像也适用于Apply.proceess,但它不是继承于Proceesor
 */
public class Apply {
    public static String s = "This is a test string";
    public static void procees(Proceesor proceesor, Object input){
        System.out.println(proceesor.process(input));
    }

    public static void main(String[] args) {
        procees(new UpperProceesor(), s);
        procees(new LowerProceesor(), s);
        procees(new SplitProceesor(), s);
//        procees(new Filter(), s);
    }

}

class Proceesor{
    Object process(Object input){
        return input;
    }
}

class UpperProceesor extends Proceesor{
    @Override
    Object process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class LowerProceesor extends Proceesor{
    @Override
    Object process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class SplitProceesor extends Proceesor{
    @Override
    Object process(Object input) {
        String[] strings = ((String) input).split(" ");
        return Arrays.toString(strings);
    }
}

class Filter{
    public String process(String s){
        return s;
    }
}