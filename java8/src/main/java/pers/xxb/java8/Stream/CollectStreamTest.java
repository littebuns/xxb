package pers.xxb.java8.Stream;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectStreamTest {

    @Test
    public void t1(){
        ArrayList<Map<String, Object>> list = new ArrayList<>();
        list.add(ImmutableMap.of("a","a1","b","b1"));
        list.add(ImmutableMap.of("a", "a1","b","b2"));
        list.add(ImmutableMap.of("a", "a3", "b", "b3"));
        Map<Object, HashMap<String, String>> mapMap = list.stream().collect(Collectors.toMap(
                m -> m.get("a"),
                m -> {
                    HashMap<String, String> map = new HashMap<>();
                    map.put(m.get("b").toString(), m.get("b").toString());
                    return map;
                },
                (k, v) -> {
                    k.putAll(v);
                    return k;
                }
        ));
        System.out.println(mapMap);
    }

}
