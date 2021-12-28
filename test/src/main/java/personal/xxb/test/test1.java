package personal.xxb.test;

import org.junit.Test;

public class test1 {
    final int a;
    final int b = 1;
    final static int c;

    static {
        c = 3;
    }

    {
        a = 1;
    }

    @Test
    public void t1(){
        final int b = 0;
        System.out.println(b);

    }

}
