package com.example.demo.base.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 迭代器 Collection通用的遍历方式
 * hasNext();
 * next() 取出集合的下一个元素
 *
 * Iterator的使用步骤
 * 1.通过collection的iterator（）获取迭代器的实现类对象,使用Iterator接口接收(多态)
 * 2.hasNext()判断是否有下一个元素
 * 3.next()取出元素
 *
 */
public class IteratorDemon {


    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("xxb");
        coll.add("hxt");
        //多态
        Iterator it = coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }

}
