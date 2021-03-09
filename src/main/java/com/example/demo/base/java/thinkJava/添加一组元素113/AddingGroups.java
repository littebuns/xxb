package com.example.demo.base.java.thinkJava.添加一组元素113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {

    public static void main(String[] args) {
        //Collection的构造器可以接受另一个Collection用来将其自身初始化
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] integers = {6, 7, 8};
        collection.addAll(Arrays.asList(integers));
        System.out.println(collection);

        Collections.addAll(collection, 9);
        Collections.addAll(collection, integers);
        System.out.println(collection);

        List<Integer> list = Arrays.asList(19, 5, 2, 7);
        list.set(0,9);
        //由于Arrays.asList()的底层是数组，因此无法改变长度
//        list.add(9);
    }
}
