package personal.xxb.oop.generic;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Apple<T> {

    private T info;

    public Apple(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public static void main(String[] args) {
        //传输给T形参是String  所以是Apple<String>
        Apple<String> apple = new Apple<>("test");
        String info = apple.getInfo();
        System.out.println(info);

        Apple<Integer> apple1 = new Apple<>(1);
        System.out.println(apple1.getInfo());
    }

}
