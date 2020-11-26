package com.example.demo.base.java.Collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 这是一个斗地主的案例
 * 分为4步
 * 1.准备牌
 * 2.洗牌
 * 3.发牌
 * 4.看牌
 */
public class Poker {

    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");

        //嵌套循环
        String[] colors = {"♣","♦","❤","♠"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color + number);
            }
        }

        //洗牌
        Collections.shuffle(poker);

        //发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51){
                dipai.add(poker.get(i));
            }
            else if (i % 3 == 0 ){
                player01.add(poker.get(i));
            }
            else if (i % 3 == 1 ){
                player02.add(poker.get(i));
            }
            else if (i % 3 == 2 ){
                player03.add(poker.get(i));
            }
        }

        //看牌
        System.out.println("徐鑫波" + player01.toString());
        System.out.println("徐  婧" + player02.toString());
        System.out.println("玩家 3" + player03.toString());
        System.out.println("底牌" + dipai.toString());
        System.out.println(poker.size());



    }
}
