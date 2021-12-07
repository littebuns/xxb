package pers.xxb.keyworld.Dynamic;

import pers.xxb.keyworld.Dynamic.Enum.Note;

public class Wind extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }
}
