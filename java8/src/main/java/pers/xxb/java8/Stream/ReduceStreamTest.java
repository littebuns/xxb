package pers.xxb.java8.Stream;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceStreamTest {

    /**
     * "profile=native", "debug=true", "logging=warn", "interval=500"
     * 将一个 List 聚合到一个Map
     */
    @Test
    public void t1() {
        ArrayList<String> props = Lists.newArrayList("profile=native", "logging=warn", "interval=500");
        HashMap<String, String> reduce = props.stream().map(kv -> {
            String[] split = kv.split("=");
            HashMap<String, String> map = new HashMap<>();
            map.put(split[0], split[1]);
            return map;
        }).reduce(new HashMap<>(), (m, kv) -> {
            m.putAll(kv);
            return m;
        });
        System.out.println(reduce);
    }

    /**
     * 累加
     */
    @Test
    public void t2() {
        Optional<Integer> sum = Stream.of(1, 2, 3, 4).reduce((acc, n) -> {
            System.out.println("acc : " + acc);
            System.out.println("item: " + n);
            acc += n;
            System.out.println("acc+ : " + acc);
            System.out.println("--------");
            return acc;
        });
        System.out.println(sum.get());
    }


}
