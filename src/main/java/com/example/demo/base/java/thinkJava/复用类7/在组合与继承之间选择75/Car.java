package com.example.demo.base.java.thinkJava.复用类7.在组合与继承之间选择75;

/**
 * 1.这个Car中将成员对象设为public可以让我们了解怎样去使用类
 *
 * 2.一般情况域为private
 *
 *
 */
public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door left = new Door();
    public Door right = new Door();

    public Car() {
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheels[0].inflate(72);
    }
}

class Engine {
    public void start(){};
    public void rev(){};
    public void stop(){};
}

class Wheel {
    public void inflate(int psi){};
}

class Window {
    public void rollup(){};
    public void rolldown(){};
}

class Door {
    public Window window = new Window();
    public void open(){};
    public void close(){};
}