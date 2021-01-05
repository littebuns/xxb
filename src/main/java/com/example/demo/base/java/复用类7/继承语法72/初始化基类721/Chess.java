package com.example.demo.base.java.复用类7.继承语法72.初始化基类721;

/**
 * 1.如果是自定义的无参构造函数会存在，但如果你没有定义无参构造函数，默认构造函数则失效。
 * 2.默认构造函数是编译器隐含提供的一个无参构造函数，仅当类中没有定义任何构造函数时才有效。
 *
 * @author HP
 */
public class Chess extends BoardGame{

    public Chess() {
        super(1);
        System.out.println("Chess Constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }

}

class Game{

    public Game(int i) {
        System.out.println("Game Constructor");
    }

}

class BoardGame extends Game{

    public BoardGame(int i) {
        super(i);
        System.out.println("BoardGame Constructor");
    }

}