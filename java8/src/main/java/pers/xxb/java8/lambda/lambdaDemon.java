package pers.xxb.java8.lambda;

import org.junit.Test;

public class lambdaDemon {

    interface MathOperation{
        int operation(int x,int y);
    };

    int operate(int x, int y,MathOperation mathOperation){
        return mathOperation.operation(x,y);
    }

    @Test
    public void t1(){
        lambdaDemon lambdaDemon = new lambdaDemon();
        MathOperation add = Integer::sum;
        MathOperation division = (x, y) -> x/y;
        System.out.println("10 + 5 = " + lambdaDemon.operate(10, 5, add));
        System.out.println("10 / 5 = " + lambdaDemon.operate(10, 5, division));
    }
}
