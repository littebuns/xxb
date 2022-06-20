package pers.xxb.java8.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * 方法引用
 */
public class MethodRefer {

    /**
     * 对象 :: 实例方法名
     */
    @Test
    public void t1(){
        //lambda 写法
        Consumer<String> con1 = s -> System.out.println(s);

        //方法引用
        Consumer<String> con2 = System.out::println;
    }

    /**
     * 类 ::静态方法名
     */
    @Test
    public void t2(){
        //lambda 写法
        Comparator<Integer> comparator1 = (x, y)->Integer.compare(x, y);
        System.out.println(comparator1.compare(1, 2));


        //方法引用 ** 需要注意被调用方法的参数列表和返回值类型需要和函数式接口中保持一致 **
        Comparator<Integer> comparator2 = Integer::compare;
    }

    /**
     * 类 :: 实例方法名
     *
     */
    @Test
    public void t3(){
        //lambda 写法
        BiPredicate<String, String> biPredicate1 = (x, y) -> x.equals(y);

        //方法引用 ** 第一个参数是这个实例方法的调用者 第二个参数是这个方法的参数时  可以使用这种语法 **
        BiPredicate<String, String> biPredicate2 = String::equals;

    }

}
