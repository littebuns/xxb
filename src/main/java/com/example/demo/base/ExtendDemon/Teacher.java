package com.example.demo.base.ExtendDemon;


public class Teacher extends Employee {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        String str = null;
        str = teacher.method(str);
        System.out.println(str);

    }

    private String method(String str){
        str += "====";
        return str ;
    }
}
