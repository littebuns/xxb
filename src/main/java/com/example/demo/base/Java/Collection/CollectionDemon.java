package com.example.demo.base.Java.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemon {

    private static Logger log = LoggerFactory.getLogger(CollectionDemon.class);

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("xxb");
        log.info("结果" + collection.contains("xxb"));
    }

}
