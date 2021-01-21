package com.example.demo.base.java.初始化与清理5.构造器初始化57;

/**
 * 静态初始化只有在必要的时刻才会进行。
 */
public class StaticInitialization {

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
    public static void main(String[] args) {
        System.out.println("creating a new cupboard");
        new Cupboard();
        System.out.println("creating a new cupboard");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
}

class Bowl {
    public Bowl(int marker) {
        System.out.println("Bowl: " + marker);
    }

    void f1(int marker) {
        System.out.println("f1: " + marker);
    }
}

class Table {
    static Bowl bowl = new Bowl(1);

    public Table() {
        System.out.println("Table");
        bowl2.f1(1);
    }

    void f2(int marker){
        System.out.println("f2:" + marker);
    }

    static Bowl bowl2 = new Bowl(2);

}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    public Cupboard() {
        System.out.println("Cupboard");
        bowl4.f1(2);
    }

    void f3(int marker){
        System.out.println("f3: " + marker);
    }

    static Bowl bowl5 = new Bowl(5);
}

class test{
    public static void main(String[] args) {
        Table table = new Table();
        new Table();
    }
}

