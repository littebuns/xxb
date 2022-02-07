package pers.xxb.keyword.annotation;

import pers.xxb.keyword.annotation.anno.Testable;

public class MyTest {

    @Testable
    public void m1(){
        System.out.println("m1");
    }

    public void m2(){
        System.out.println("m2");
    }

    @Testable
    public void m3(){
        throw new RuntimeException("运行时异常");
    }



}
