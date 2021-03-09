package com.example.demo.base.java.Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 正常的写法
 */
public class normal {

    public void lambda(){
        String[] array = {"1"};
        Arrays.sort(array,(s1,s2)-> {
            return s1.compareTo(s2);
        });
    }

    public static void main(String[] args) {
        String[] array = {"1","2"};
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }
}
