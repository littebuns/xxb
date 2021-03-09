package com.example.demo.base.java.thinkJava.复用类7.继承语法72;

/**
 * 解析：
 * 1.一个程序中含有多个类，也只有命令行调用的那个类的main()方法会被调用。
 *
 * 2.java Detergent ,那么Detergent.main()会被调用。然而Cleanser不是一个public类，是protected，只具有包访问权限。
 * 然后java Cleanser, Cleanser.main()仍然会被调用。即使一个类只有包访问权限，其public main()仍然是可访问的。
 *
 * 3.Cleanser中的方法最好是public，如果没有加任何访问权限修饰符，那么成员默认的访问权限是包访问权限，它只允许包内的成员访问。
 * 例如，Detergent 就可以使用Cleanser的方法，但是在其他包中的某个类想从Cleanser中继承，则只能访问public成员。
 * 为了继承，我们一般将所有的数据成员指定为private，将所有的方法指定为public
 *
 * 4.scrub()中可见，我们可以使用并修改基类中的方法。我们可能想在子类中调用从基类继承而来的方法。但是在scrub()中并不能直接
 * 调用scrub()方法，这样会产生递归。Java用super关键字表示超类的意思，当前类就是从超类中继承过来的。
 * super.scrub() 就是调用基类的scrub() 方法。
 *
 * 5.继承中，不一定非得使用基类的方法，也可以在导出类添加新的方法，例如foam()方法。
 * @author HP
 */
public class Detergent extends Cleanser {

    @Override
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam(){
        append( "  foam()");
    }

    public static void main(String[] args) {
        Detergent d = new Detergent();
        d.dilute();
        d.apply();
        d.scrub();
        d.foam();
        System.out.println(d);
        System.out.println("test base class");
        Cleanser.main(args);
    }
}


class Cleanser{

    private String s = "Cleanser";

    public void append(String a){
        s += a;
    }

    public void dilute(){
        append("  dilute()");
    }

    public void apply(){
        append("  apply()");
    }

    public void scrub(){
        append("  scrbu()");
    }

    @Override
    public String toString() {
        return "Cleanser{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        System.out.println(cleanser);
    }
}