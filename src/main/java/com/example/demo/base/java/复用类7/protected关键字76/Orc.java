package com.example.demo.base.java.复用类7.protected关键字76;

/**
 * change()可以访问set(),因为set()是protected
 */
public class Orc extends Villain{
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "orcNumber=" + orcNumber +
                '}';
    }

    public static void main(String[] args) {
        Orc orc = new Orc("xxb", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}

class Villain {
    private String name;
    protected void set(String nm){
        name = nm;
    }

    public Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                '}';
    }
}
