package com.example.demo.Controller;

import com.example.demo.entity.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {

    //java字符串格式化
    private static final String template = "Hello,%s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting hello(@RequestParam(value = "name", defaultValue = "World") String name ){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
