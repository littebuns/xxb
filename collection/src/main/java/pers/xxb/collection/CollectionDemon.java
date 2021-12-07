package pers.xxb.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;

@Slf4j
public class CollectionDemon {


    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("xxb");
        log.info("结果" + collection.contains("xxb"));
    }

}
