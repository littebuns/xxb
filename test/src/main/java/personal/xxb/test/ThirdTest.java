package personal.xxb.test;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThirdTest {

    @Test
    public void t1(){
        Boolean a = null;
        Boolean isName = (a);
        System.out.println(isName);
    }


    @Test
    public void t2(){
        ArrayList<Map<String, String>> list = new ArrayList<>();
        list.add(simpleMap("name","xxb"));
        list.add(simpleMap("name", "hahah"));
        Long xxb1 = list.stream().filter(s -> s.get("name").equals("xxb")).count();
        System.out.println(xxb1);
    }


    public Map<String, String> simpleMap(String key, String value){
        HashMap<String, String> map = new HashMap<>();
        map.put(key, value);
        return map;
    }


}
