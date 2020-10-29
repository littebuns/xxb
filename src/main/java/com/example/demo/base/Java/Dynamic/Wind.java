package com.example.demo.base.Java.Dynamic;

import com.example.demo.base.Java.Dynamic.Enum.Note;

public class Wind extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }
}
