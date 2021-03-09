package com.example.demo.base.java.thinkJava.复用类7.final关键字78;

import java.util.Random;

/**
 * 1.VALUE_THREE是一种典型的对常量进行定义的方式
 * 定义为public，代表可以被用于包之外；定义为staic，则强调只有一份；定义为final，则说明它是一个常量。
 *
 * 2.带有恒定初始值（编译期常量）的final static的基本类型全用大写字母命名，并且字与字之间用下划线隔开。（来源于C常量）
 *
 * 3.不能因为数据是final就认为在编译时可以知道它的值(可以通过random来印证).
 *
 * 4.将final数值定义为静态和非静态是有区别的。i4的值为唯一的，然而INT_5的值不会随创建第二个FinalData对象而加以改变，
 * 因为它是static的，在装载的时候就被初始化了，而不是每次创建新对象的时候都初始化
 *
 * 5.v1,v2,v3则说明了final引用的意义，final意味着无法将引用指向另一个新的对象，然而也不能因为v2是final，就无法改变它的值，
 * 但将引用成为final没有多大的意义。
 *
 * @author HP
 */
public class FinalData {
    private static Random rand = new Random();
    private String id;

    public FinalData(String id) {
        this.id = id;
    }
    private final int VALUE_ONE = 9;
    private static final int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value v3 = new Value(33);
    private final int[] a = {1,2,3,4,5,6};

    @Override
    public String toString() {
        return "FinalData{" +
                "i4=" + i4 + " INT_5=" + INT_5+
                '}';
    }

    public static void main(String[] args) {
        FinalData fd = new FinalData("fd");
//        fd.valueOne ++ ;
        fd.v2.i ++; //Object isn't constant
        fd.v1 = new Value(9);
        for (int i = 0; i < fd.a.length; i++) {
            fd.a[i] ++;
        }
//            fd.v2 = new Value(0);
//            fd.v3 = new Value(1);
//            fd.a = new int[4];
        System.out.println(fd);
        System.out.println("create new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd2);
    }
}

class Value{
    int i;

    public Value(int i) {
        this.i = i;
    }
}
