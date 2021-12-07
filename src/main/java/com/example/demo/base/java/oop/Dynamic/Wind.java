package com.example.demo.base.java.oop.Dynamic;

import com.example.demo.base.java.oop.Dynamic.Enum.Note;

public class Wind extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }
}
