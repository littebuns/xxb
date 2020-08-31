package com.example.demo.base.Static;

/**
 * ①对于变量而言，用static修饰 代表这个是属于类的，多个对象共享这个数据（可以节省内存）
 * 在内存中，对象的引用是在栈中，对象在堆中，但是通过类名找静态变量，其实是找放在方法区中的静态区，所以static修饰的成员变量和对象没
 * 关系，只和类有关系。
 * ②对于方法而言,用static修饰后，可以直接通过类使用方法，不需要新建对象
 * ③静态代码块，当第一次使用本类时，静态代码块只执行一次（主要使用场景：用来一次性的对静态成员变量进行赋值）
 *
 */
public class StaticDemon {
    int num; //成员变量
    static int numStatic;  //静态变量

    public void method(){
        System.out.println(num + numStatic);
        System.out.println("普通方法");
    }

    static {
        System.out.println("静态代码块");
    }

    public static void methodStatic(){
        //静态方法无法访问成员变量
        System.out.println(numStatic);
        System.out.println("静态方法");
    }

    public static void main(String[] args) {
        StaticDemon staticDemon = new StaticDemon();
        //需要通过新建对象
        staticDemon.method();
        //直接通过类名称使用static方法
        StaticDemon.methodStatic();
        //如果是本类，可以直接用方法名
        methodStatic();
    }
}
