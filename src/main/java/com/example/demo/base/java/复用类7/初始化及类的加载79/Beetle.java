package com.example.demo.base.java.复用类7.初始化及类的加载79;

/**
 * 1.构造器也是static方法(没有显式的写出来)。类是在其任何static成员被访问时加载的
 *
 * 2.运行Beetle.java时候，第一件是访问Beetle.main()方法(一个static方法)，于是加载器开始启动并找出Beetle的编译代码。
 * 在加载的过程中，编译器发现它有个基类(从关键字extends可知),于是继续加载。
 *
 * 3.因此基类的static会被执行，下一个是导出类，以此类推。(导出类的static初始化可能依赖于基类的初始化)
 *
 * 4.至此，必要的类以及加载完毕了，对象就可以被创建了。首先将对象中所有的基本类型设置为默认值，对象的引用被设为null。
 * 然后，基类的构造器会被调用
 *
 * @author HP
 */
public class Beetle extends Insect{
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle beetle = new Beetle();
    }
}

class Insect {
    private int i = 9;
    protected int j;

    public Insect() {
        System.out.println("i = " + i + ",j = " + j );
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}