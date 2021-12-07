package pers.xxb.collection;

import java.util.LinkedList;

/**
 * 1.底层是链表，查询慢，增删快
 * 2.包含了大量操作首尾元素的方法
 * 3.要想使用linkedlist的特有方法，不能使用多态
 */
public class LinkedListDemon {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");

        list.addFirst("first");
        //等效于addFirst
        list.push("push");
        System.out.println(list);

    }
}
