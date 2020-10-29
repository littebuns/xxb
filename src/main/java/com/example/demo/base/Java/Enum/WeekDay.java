package com.example.demo.base.Java.Enum;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum WeekDay {

    Sunday(7),

    Friday(2),

    Tuesday(3);

    private int code;

    WeekDay(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static void main(String[] args) {
        String str = WeekDay.valueOf("Sunday").toString();

        System.out.println(WeekDay.Sunday.getCode());

    }

}
