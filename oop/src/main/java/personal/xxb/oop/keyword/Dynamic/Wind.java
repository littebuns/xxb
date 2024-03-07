package personal.xxb.oop.keyword.Dynamic;

import personal.xxb.oop.keyword.Dynamic.Enum.Note;

public class Wind extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }
}
