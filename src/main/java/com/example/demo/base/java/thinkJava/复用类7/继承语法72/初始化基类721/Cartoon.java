package com.example.demo.base.java.thinkJava.复用类7.继承语法72.初始化基类721;

/**
 * 1.构建过程是从基类向外扩散的，基类在导出类构造器可以访问它之前，就完成了初始化。
 * 2.即使不为Cartoon()构建构造器，编译器也会合成一个默认的构造器，该构造器将调用基类的构造器。
 * @author HP
 */
public class Cartoon extends Drawing{

    public Cartoon() {
        System.out.println("Cartoon Constructor");
    }

    public static void main(String[] args) {
        Cartoon c = new Cartoon();
    }
}

class Art{

    public Art() {
        System.out.println("Art Constructor");
    }

}

class Drawing extends Art{

    public Drawing() {
        System.out.println("Drawing Constructor");
    }

}
