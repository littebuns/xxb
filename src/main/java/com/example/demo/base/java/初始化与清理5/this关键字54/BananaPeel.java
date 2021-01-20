package com.example.demo.base.java.初始化与清理5.this关键字54;

/**
 * peel()方法是怎么知道自己是被哪个对象被调用的呢.编译器做了一些操作，将所操作对象的引用作为第一个参数传给peel(),
 * 类似于Banana.peel(a,1)。
 * 假设我们想在方法的内部获取当前对象的引用。由于这个引用是编译器偷偷传入的，没有标识符可以用。
 * 为此，有个专门的关键字:this。this关键字只能在方法内部使用，表示调用方法的那个对象的引用。
 * tips:如果在方法内部调用同一个类的另一个方法，不必写this,直接调用即可。当前方法中的this引用会自动应用同一类的其他方法
 */
public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana();
        Banana b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}

class Banana{
    void peel(int i){
        System.out.println("peel");
    }
}