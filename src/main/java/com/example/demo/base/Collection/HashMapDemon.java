package com.example.demo.base.Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 哈希值是一个十进制的整数，由系统随机给出
 * (对象的地址值，逻辑地址值，是模拟的地址，不是数据实际存储的物理地址)
 * object中 hasCode() 返回该对象的哈希码值
 */
public class HashMapDemon {

    public static void main(String[] args) {
//        method01();
        method02();
    }

    private static void method02() {
        Map<String, Object> map = new HashMap<>();
        map.put("xxb", 1);
        map.put("xj", 2);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    /**
     * 通过key set的方式遍历hashmap
     */
    private static void method01() {
        Map<String, Object> map = new HashMap<>();
        map.put("xxb", 1);
        map.put("xj", 2);
        for (String s : map.keySet()) {
            System.out.println(s + ":" + map.get(s));
        }
    }
}
