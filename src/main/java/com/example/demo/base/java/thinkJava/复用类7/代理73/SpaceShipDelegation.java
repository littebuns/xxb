package com.example.demo.base.java.thinkJava.复用类7.代理73;

/**
 * 1.可以看到通过传递controls对象，使得其接口可以与继承的接口相同
 * 2.我们使用代理可以拥有更多的控制力，因为我们可以选择只提供在成员对象中方法的某个子集
 * @author HP
 */
public class SpaceShipDelegation {

    private String name;

    /**
     * 通过组合
     */
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                '}';
    }

    /**
     * Delegated methods
     * @param velocity
     */
    public void back(int velocity){
        controls.back(velocity);
    }

    public void down(int velocity){
        controls.down(velocity);
    }

    public void forward(int velocity){
        controls.forward(velocity);
    }

    public void left(int velocity){
        controls.left(velocity);
    }

    public void right(int velocity){
        controls.right(velocity);
    }

    public void up(int velocity){
        controls.up(velocity);
    }

    public void turboBoost(){
        controls.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation xxb = new SpaceShipDelegation("xxb");
        xxb.forward(100);
    }

}
