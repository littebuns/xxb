package pers.xxb.java8.Fuction;

import org.junit.Test;

import java.util.function.Function;

/**
 * 函数型接口
 */
public class FunctionTest {

    @Test
    public void t1(){
        Function<String, String> fun = String::new;
        System.out.println(fun.apply("哈哈哈"));
    }

}
