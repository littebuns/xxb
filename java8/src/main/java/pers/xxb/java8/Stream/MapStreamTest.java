package pers.xxb.java8.Stream;

import org.junit.Test;

import java.util.stream.Stream;

public class MapStreamTest {

    /**
     * 计算平方
     */
    @Test
    public void t1(){
        Stream.of(1,2,3,4).map(n -> n *n).forEach(System.out::println);
    }

    /**
     * 对String进行操作
     */
    @Test
    public void t2(){
        Stream.of(" Xxb ", " JAVA", "pYTHON")
                .map(String::trim) //去空格
                .map(String::toLowerCase)   //转小写
                .forEach(System.out::println);
    }

}
