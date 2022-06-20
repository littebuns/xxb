package pers.xxb.java8.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * stream 流的筛选和切片操作
 */
public class CutStreamTest {

    private List<Phone> phones = new ArrayList<>();

    {
        phones.add(new Phone("ios", 111));
        phones.add(new Phone("android", 222));
        phones.add(new Phone("ios", 111));
    }

    /**
     * filter 保留符合条件的值
     */
    @Test
    public void t1(){
        phones.stream().filter(x-> x.getName().equals("")).forEach(System.out::println);
    }

    /**
     * distinct 去重
     */
    @Test
    public void t2(){
        phones.stream().distinct().forEach(System.out::println);
    }

    /**
     * limit 截断流
     */
    @Test
    public void t3(){
        phones.stream().limit(2).forEach(System.out::println);
    }

    /**
     * skip 跳过元素
     */
    @Test
    public void t4(){
        phones.stream().skip(2).forEach(System.out::println);
    }

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Phone {
    private String name;
    private int price;
}