package com.example.demo.base.java.thinkJava.复用类7.final关键字78;

/**
 * 1.必须在域的定义处或者每个构造器中对final进行赋值，这正是final域在使用前总被初始化的原因所在。
 * @author HP
 */
public class BlankFinal {
    private final int i =0;
    private final int j;
    private final Poppet p;

    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }

    public BlankFinal(int x) {
        j = x;
        p = new Poppet(47);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}

class Poppet{
    private int i;

    public Poppet(int i) {
        this.i = i;
    }
}
