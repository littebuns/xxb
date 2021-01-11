package com.example.demo.base.java.复用类7.结合使用组合和继承74.确保正确清理741;

/**
 * 1.构造器中super语句必须置于第一位
 *
 * 2.main()中有try和finally, try下面被大括号括起来的范围就是保护区，需要特别处理。
 * finally表示无论try块发生什么，一定会调用dispose()方法。
 *
 * 3.这个系统中的一切都是Shape,每个类都会复写Shape的dispose()方法，并运用super来调用该方法的基类版本来将未存于
 * 内存中的东西恢复到对象存在之前的状态。
 *
 * 4.dispoes()中，需要注意对基类清理方法和成员对象清理方法的调用顺序，防止某个子对象依赖于另一个子对象。
 *
 *
 *
 * @author HP
 */
public class CADSystem extends Shape{
    private Circle circle;
    private Triangle triangle;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++){
            lines[j] = new Line(j, j*j);
        }
        circle = new Circle(1);
        triangle = new Triangle(1);
        System.out.println("Combined Constructor");
    }

    @Override
    void dispose() {
        System.out.println("CADSystem.dispose()");
        triangle.dispose();
        circle.dispose();
        for (int i = lines.length - 1; i > 0 ; i--) {
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            System.out.println("try code");
        }finally {
            x.dispose();
        }
    }

}

class Shape {

    public Shape(int i) {
        System.out.println("Shape Constructor");
    }

    void dispose(){
        System.out.println("Shape dispose");
    }

}

class Circle extends Shape{

    public Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape{

    public Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape{

    private int start,end;

    public Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line: " + start + "," + end);
    }

    @Override
    void dispose() {
        super.dispose();
        System.out.println("Erasing Line: " + start + "," + end);
    }

}

