package com.example.demo.base.java.keyworld;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CharDemon {

    @Test
    public void t1(){
        char c1 = 'A';
        System.out.println(c1);
    }

    @Test
    public void t2(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("徐鑫", "xxb");
        String str = "徐鑫波";
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (str.contains(entry.getKey())){
                System.out.println(true);
            }
        }
    }


}
