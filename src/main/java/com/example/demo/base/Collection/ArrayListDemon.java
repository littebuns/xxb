package com.example.demo.base.Collection;

import java.util.ArrayList;
import java.util.Random;

/**
 * 数组的长度不可改变
 * ArrayList 的长度可变
 * ArrayList<E> <E>是泛型
 * 泛型是装在集合中所有元素统一的类型，只能是引用类型，不能是基本类型
 */
public class ArrayListDemon {

    public static void main(String[] args) {

//        使用基本类型会出问题，可以使用基本类型对应的包装类(引用类型)
//        ArrayList<int> list = new ArrayList<int>();
        //jdk 1.7以后右侧的尖括号可以不写
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加元素  返回值boolean
        list.add("0");
        list.add("1");
        //集合中获取元素
        String s = list.get(0);
        //往集合中删除元素,返回值为该元素
        String str = list.remove(0);
        //获取集合长度，返回集合中包含的元素个数
        int size = list.size();

        //开始遍历list
        for (String value : list) {
            System.out.println(value);
        }

        System.out.println(list);

    }


}
