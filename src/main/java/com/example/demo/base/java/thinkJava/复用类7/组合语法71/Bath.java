package com.example.demo.base.java.thinkJava.复用类7.组合语法71;

/**
 * 如果想要在新类中为每个引用初始化，可以在代码的下列位置进行
 * 1.在定义对象的地方。意味在它们能够在构造器被调用前被初始化
 * 2.在类的构造器中
 * 3.就这使用这些对象之前，惰性初始化
 * 4.使用实例初始化
 * Java类的实例化的初始化过程：https://www.cnblogs.com/kabi/p/6362841.html
 * @author HP
 */
public class Bath {
    //1.定义对象的地方
    private String
    s1 = "Happy",
    s2 = "Happy",
    s3,s4;
    private Soap soap;
    private int i;

    public Bath() {
        //2.构造器中初始化
        System.out.println("Inside Bath()");
        s3 = "joy";
        soap = new Soap();
    }

    {
        //4.实例初始化块
        i = 47;
    }

    @Override
    public String toString() {
        //3.懒加载，在使用前初始化
        if (null == s4){
            s4 = "joy";
        }
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", soap=" + soap +
                ", i=" + i +
                '}';
    }

    public static void main(String[] args) {
        Bath bath = new Bath();
        System.out.println(bath);
    }
}

class Soap{
    private String s;

    public Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return "Soap{" +
                "s='" + s + '\'' +
                '}';
    }
}