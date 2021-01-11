package com.example.demo.base.java.复用类7.结合使用组合和继承74.名称屏蔽742;

/**
 * 1.可以看到Bart中引入了一个新的重载方法,但是Bart中Homer中所有的
 */
public class Hide {

    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh(new Milhouse());
        bart.doh('a');
        bart.doh(1f);
    }
}

class Homer {

    char doh(char c) {
        System.out.println("doh(char)");
        return c;
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return f;
    }
}

class Milhouse {

}

class Bart extends Homer {

    void doh(Milhouse m){
        System.out.println("doh(m)");
    }

    @Override
    float doh(float f) {
        System.out.println("bart.doh(float)");
        return 1.0f;
    }
}