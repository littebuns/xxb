package pers.xxb.java8.Stream;

import org.junit.Test;

import java.util.Arrays;

/**
 * 创建 stream 的几种方式
 */
public class StreamCreateTest {

    /**
     * 基于数组创建
     * char 数组不支持 因为不是引用类型
     */
    @Test
    public void t1(){
        int[] a = {1,2,3};
        System.out.println(Arrays.stream(a));
    }

}
