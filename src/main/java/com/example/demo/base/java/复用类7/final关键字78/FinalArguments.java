package com.example.demo.base.java.复用类7.final关键字78;

/**
 * 1.with（） 和 without（） 方法可以看出，但引用类型的参数指明为final时，可以读参数，但却无法修改参数
 * 这一特性主要用来向匿名内部类传递数据
 */
public class FinalArguments {
    void with(final Gizmo g){
//        g = new Gizmo();
    }

    void without(Gizmo g){
        g = new Gizmo();
        g.spin();
    }

    int g(final int i){
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}

class Gizmo{
    public void spin(){};
}
