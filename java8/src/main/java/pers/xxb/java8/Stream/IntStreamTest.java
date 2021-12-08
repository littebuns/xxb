package pers.xxb.java8.Stream;

import org.junit.Test;

import java.util.stream.IntStream;

/**
 * 聚集方法只能调用一次
 */
public class IntStreamTest {

    IntStream intStream = IntStream.builder()
            .add(1)
            .add(2)
            .add(3)
            .build();

    /**
     * 输出最小值
     */
    @Test
    public void t1(){
        System.out.println(intStream.max().getAsInt());
    }

    /**
     * 是否存在或都
     */
    @Test
    public void t2(){
        //是否所有的值的平方都小于10
//        System.out.println(intStream.allMatch(n -> {
//            return n * n < 10;
//        }));

        //是否存在值的平方大于5
        System.out.println(intStream.anyMatch(n -> n * n > 5));
    }

    /**
     * 映射一个新的Stream（每个元素是原本的 2倍 + 1）  并打印
     */
    @Test
    public void t3(){
        IntStream newStream = this.intStream.map(ele -> ele * ele + 1);
        newStream.forEach(System.out::println);
    }

}
