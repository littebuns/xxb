package com.example.demo.base.java.Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * set接口不允许存储重复的数据
 * 没有索引
 *
 * HashSet 实现了Set接口
 * 无序
 * 底层是哈希表结构  查询速度快
 */
public class SetDemon {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        for (Integer n : set) {
            //发现重复添加的1没有保存
            System.out.println(n);
        }
    }
}
