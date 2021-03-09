package com.example.demo.base.java.thinkJava.复用类7.代理73;

/**
 * 1.然而，SpaceShip并非真正的SpaveShipControls类型，即使我们可以告诉"SpaceShip"向前运动(forward())
 * 2.继承导致SpaceShip包含SpaceShipControls，同时SpaceShipControls中所有的方法都在SpaceShip中暴露了出来
 * @author HP
 */
public class SpaceShip extends SpaceShipControls {

    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SpaceShip xxb = new SpaceShip("xxb");
        xxb.forward(100);
    }

}
