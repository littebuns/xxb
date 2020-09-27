package com.example.demo.Controller;

import com.example.demo.Dao.UserDao;
import com.example.demo.entity.Greeting;
import com.example.demo.entity.Result;
import com.example.demo.service.HelloService;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.util.concurrent.atomic.AtomicLong;

@Data
@RestController
public class HelloController {

    private final static Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private HelloService helloService;
    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserDao userDao;

    //java字符串格式化
    private static final String template = "Hello,%s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting hello(@RequestParam(value = "name", defaultValue = "World") String name,
                          HttpServletRequest request){
        System.out.println(dataSource.getClass().getName());
        //另外一种方式获取前端传递的参数
        request.getParameter("name");
        log.info(name);
        System.out.println(userDao.listAll());
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/patch")
    public Result patch(){
        return this.helloService.patch();
    }
}
