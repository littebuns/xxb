package personal.xxb.generic;

import org.junit.Test;

import java.util.ArrayList;

public class ListErr {

    /**
     * 编译时不检查类型的异常
     */
    @Test
    public void t1(){
        // 创建一个只想保持字符串的集合
        ArrayList list = new ArrayList(){{
           add("哈哈哈");
           add("xxb");
           //不小心存放了Integer类型的数据
           add(5);
        }};
        list.forEach(str -> System.out.println(((String) str).length() ) );
    }

    @Test
    public void t2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("哈哈哈");
        list.add("xxb");
        //会帮助我们在编译的时候检查元素类型是否符合集合的类型
//        list.add(5);
        list.forEach(str -> System.out.println(((String) str).length() ) );
    }

}
