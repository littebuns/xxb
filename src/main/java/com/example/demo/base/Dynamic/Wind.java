package com.example.demo.base.Dynamic;

import com.example.demo.base.Dynamic.Enum.Note;

public class Wind extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }
}
