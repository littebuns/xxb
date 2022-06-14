package pers.xxb.java8.Fuction;

import org.junit.Test;

import java.util.Random;
import java.util.function.Supplier;

/**
 * 供给型函数接口
 */
public class SupplierTest {


    @Test
    public void t1(){
        Supplier<String> supply = String::new;
        System.out.println(supply.get());

        Integer num = getRandomNum(() -> {
            Random random = new Random();
            int i = random.nextInt(20);
            System.out.println("随机数为" + i);
            return i;
        }, 1);
        System.out.println(num);
    }

    /**
     * 通过supplier 获取一个 int 并加上一个值返回
     * @param supplier
     * @param addNum
     * @return
     */
    Integer getRandomNum(Supplier<Integer> supplier, Integer addNum){
        Integer integer = supplier.get();
        integer += addNum;
        return integer;
    }



}
