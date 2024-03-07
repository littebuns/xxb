package personal.xxb.oop.keyword.Dynamic;

import personal.xxb.oop.keyword.Dynamic.Enum.Note;

public class Music {

    public static void tune(Instrument i){
        i.play(Note.MEDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
/*
        Music.tune()方法中接收一个Instrument的引用，也接收任何导出自Instrument的类
        当一个Wind引用传递到tune()的方法中，Wind从Instrument继承过来，因此Instrument的方法
        必定存在于wind中，因此wind可以 Upcasting 向上转型为Instrument
*/
        tune(flute);    //wind play MEDDLE_C
    }
}
