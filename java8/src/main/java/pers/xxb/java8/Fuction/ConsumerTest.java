package pers.xxb.java8.Fuction;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * 使用消费者接口
 */
public class ConsumerTest {

    /**
     * 普通消费
     */
    @Test
    public void t1(){
        print("你好", System.out::println);
    }

    /**
     * andThen 用法 实现先进行一个操作 再进行一个操作的效果
     */
    @Test
    public void t2(){
        doubleAction("AbdsfS", s -> {
            System.out.println(s.toUpperCase());
        }, s -> {
            System.out.println(s.toLowerCase());
        });
    }

    public static void print(String str, Consumer<String> consumer){
        consumer.accept(str);
    }

    /**
     * 两个消费操作
     * @param str
     * @param consumer1
     * @param consumer2
     */
    public static void doubleAction(String str, Consumer<String> consumer1, Consumer<String> consumer2){
        consumer1.andThen(consumer2).accept(str);
    }


}
