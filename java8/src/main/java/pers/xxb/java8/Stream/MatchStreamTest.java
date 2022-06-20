package pers.xxb.java8.Stream;

import org.junit.Test;

import java.util.stream.Stream;

/**
 * 流的匹配 查找操作
 */
public class MatchStreamTest {

    private static Stream<StreamEmploy> data = Stream.of(
            new StreamEmploy(18, "ddd"),
            new StreamEmploy(19, "aaa"),
            new StreamEmploy(36, "eee"),
            new StreamEmploy(20,"ccc"));

    /**
     * allMatch 检查是否匹配所有元素
     * 所有元素都满足条件 才返回 true
     */
    @Test
    public void t1(){
        //是否所有的员工年龄都大于16
        System.out.println(data.allMatch(streamEmploy -> streamEmploy.getAge() > 16));
    }

    /**
     * anyMatch 检查是否有一个元素匹配
     * 只要有一个元素满足条件 就返回 true
     */
    @Test
    public void t2(){
        //是否存在小于18岁的员工
        System.out.println(data.allMatch(streamEmploy -> streamEmploy.getAge() < 18));
    }

    /**
     * noneMatch 检查是否没有匹配全部元素
     * 所有元素都不满足条件 才返回 true
     */
    @Test
    public void t3(){
        //检查是否没有所有的员工都大于16岁
        System.out.println(data.noneMatch(streamEmploy -> streamEmploy.getAge() > 20));
    }

    /**
     * findFirst 获取流中第一个元素
     */
    @Test
    public void t4(){
        //获取大于35岁的员工流  并获取第一个元素
        System.out.println(data.filter(streamEmploy -> streamEmploy.getAge() > 35).findFirst());
    }

    /**
     * findAny 返回流中的一个元素
     * 串行流相当于 findFirst
     * 并行流会有区别
     */
    @Test
    public void t5(){
        //并行流
        System.out.println(data.parallel().findAny());
    }


}
