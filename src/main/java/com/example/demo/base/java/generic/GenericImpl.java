package com.example.demo.base.java.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 子类明确泛型的类型参数变量
 */
public class GenericImpl implements Generic<Integer>{

    @Override
    public void show(Integer integer) {
        System.out.println(integer);
    }

    public static void test(List list){

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hxt");
        GenericImpl.test(list);
    }

}
