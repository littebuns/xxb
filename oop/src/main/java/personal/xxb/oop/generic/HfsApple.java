package personal.xxb.oop.generic;

public class HfsApple extends Apple<String>{

    public HfsApple(String info) {
        super(info);
    }

    public static void main(String[] args) {
        HfsApple apple = new HfsApple("xxb");
        System.out.println(apple.getInfo());
    }

}
