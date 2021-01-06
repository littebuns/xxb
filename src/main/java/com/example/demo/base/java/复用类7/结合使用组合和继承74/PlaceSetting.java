package com.example.demo.base.java.复用类7.结合使用组合和继承74;

/**
 * 1.编译器不会明确要求将成员对象初始化，我们需要注意防止没有初始化成员对象就去使用它
 * @author HP
 */
public class PlaceSetting extends Custom{

    private Spoon spoon;
    private Fork fork;
    private Knife knife;
    private DinnerPlate dinnerPlate;

    public PlaceSetting(int i) {
        super(i + 1);
        spoon = new Spoon(i + 2);
        fork = new Fork(i + 3);
        knife = new Knife(i + 4);
        dinnerPlate = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting Constructor");
    }

    public static void main(String[] args) {
        PlaceSetting placeSetting = new PlaceSetting(1);
        System.out.println(placeSetting.dinnerPlate.i);
    }
}

class Plate{

    public int i;

    public Plate(int i) {
        System.out.println("Plate Constructor");
    }

}

class DinnerPlate extends Plate{

    public DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate Constructor");
    }

}

class Utensil{

    public Utensil(int i) {
        System.out.println("Utensil Constructor");
    }

}

class Spoon extends Utensil{

    public Spoon(int i) {
        super(i);
        System.out.println("Spoon Constructor");
    }

}

class Fork extends Utensil{

    public Fork(int i) {
        super(i);
        System.out.println("Fork Constructor");
    }

}

class Knife extends Utensil{

    public Knife(int i) {
        super(i);
        System.out.println("Knife Constructor");
    }

}

class Custom{

    public Custom(int i) {
        System.out.println("Custom Constructor");
    }

}
