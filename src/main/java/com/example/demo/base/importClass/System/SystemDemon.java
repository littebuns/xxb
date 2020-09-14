package com.example.demo.base.importClass.System;

import java.util.Arrays;

public class SystemDemon {

    public static void main(String[] args) {
        demon01();
        demon02();
    }

    /**
     * 拷贝数组
     */
    private static void demon02() {
        int[] src = {1,2,3};
        int[] dest = {4,5,6,7,8};
        System.arraycopy(src,1, dest, 2, 2);
        System.out.println(Arrays.toString(dest)); //{4,5,2,3,8}
    }

    /**
     * 测试程序效率
     */
    private static void demon01() {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 9999; i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end-start) + "毫秒");
    }
}
