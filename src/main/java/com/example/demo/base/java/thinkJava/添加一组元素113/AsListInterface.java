package com.example.demo.base.java.thinkJava.添加一组元素113;

import java.util.Arrays;
import java.util.List;

public class AsListInterface {
    public static void main(String[] args) {
        List<Snow> snows = Arrays.asList(new Crusty(), new Slush());
        System.out.println(snows);

        List<Snow> powders = Arrays.asList(new Heavy(), new Light());

    }
}

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}
