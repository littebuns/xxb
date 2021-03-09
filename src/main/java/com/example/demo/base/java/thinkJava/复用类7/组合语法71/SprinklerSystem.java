package com.example.demo.base.java.thinkJava.复用类7.组合语法71;

/**
 * 组合技术：对于非基本类型的对象，直接将对象的引用置于新类中。
 * 1.toString() 方法比较特殊，每一个非基本类型的对象都有一个toString()的方法，当编译器需要一个String而你提供了一个对象，该方法就会被调用。
 * 2.类中域为基本类型的时候能自动初始化为零，但对象的引用会被初始化为null。
 * 3.编译器不会为每一个引用都创建默认对象，不然的话会增加不必要的负担。
 * @author HP
 */
public class SprinklerSystem {
    private String value1,value2,value3,value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }

}


class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return "WaterSource{" +
                "s='" + s + '\'' +
                '}';
    }
}