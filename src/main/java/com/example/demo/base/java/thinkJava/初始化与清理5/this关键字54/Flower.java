package com.example.demo.base.java.thinkJava.初始化与清理5.this关键字54;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    public Flower(int petalCount) {
        this.petalCount = petalCount;
        System.out.println("int " + petalCount );
    }

    public Flower(String s) {
        this.s = s;
    }

    public Flower(int petalCount, String s) {
        this(petalCount);
        this.s = s;
    }

    public Flower() {
        this(47, "hi");
    }

    @Override
    public String toString() {
        return "Flower{" +
                "petalCount=" + petalCount +
                ", s='" + s + '\'' +
                '}';
    }

    void print(){
        System.out.println("Flower{" +
                "petalCount=" + petalCount +
                ", s='" + s + '\'' +
                '}');
    }


    public static void main(String[] args) {
        Flower x = new Flower();
        x.print();
    }
}
