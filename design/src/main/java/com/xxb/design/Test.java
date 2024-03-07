package com.xxb.design;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        Pattern compile = Pattern.compile("\\d{1,8}");
        Matcher matcher = compile.matcher(" 2314dsfjk");
        System.out.println(matcher.find());
        System.out.println(matcher.group(0));

    }


    public static Person changeName(Person person) {
        person.name = "xxb1";
        person = new Person();
        person.name = "xxb2";
        return person;
    }



}

class Person {
    public String name;
}