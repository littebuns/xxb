package pers.xxb.java8.Stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * stream的映射操作
 */
public class MapStreamTest {

    /**
     * 计算平方
     */
    @Test
    public void t1(){
        Stream.of(1,2,3,4).map(n -> n *n).forEach(System.out::println);
    }

    /**
     * map
     */
    @Test
    public void t2(){
        Stream.of(" Xxb ", " JAVA", "pYTHON")
                .map(String::trim) //去空格
                .map(String::toLowerCase)   //转小写
                .forEach(System.out::println);
    }

    /**
     * map 操作把每个字符串转化为大写字母 每个序列转化为一个流
     */
    @Test
    public void t3(){
        Stream<String> stream = Stream.of("aaa", "bbb", "ccc");
        Stream<Stream<Character>> stream1 = stream.map(String::toUpperCase).map(s ->
                s.chars().mapToObj(x -> (char) x)
        );
        stream1.forEach(s -> s.forEach(System.out::println));
    }

    /**
     * flatMap  t3方法中把每个子流放入一个流 流中嵌套流
     * 若使用 flatMap 会把子流中的元素组成一个流 然后遍历这个流即可 而不是遍历流中的每一个流
     */
    @Test
    public void t4(){
        Stream<String> stream = Stream.of("aaa", "bbb", "ccc");
        Stream<Character> characterStream = stream.map(String::toUpperCase).flatMap(s -> s.chars().mapToObj(x -> (char) x));
        characterStream.forEach(System.out::println);
    }

}
