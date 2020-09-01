package com.example.demo.amqp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.Message  消息,由消息头和消息体组成
 *
 * 2.Publisher 生产者,消息的发布者
 *
 * 3.Exchange 交换器 4种类型,direct(点对点) topic,fanout,headers （订阅式）
 * 交换器决定消息发往哪个队列
 *
 * 4.Queue 消息队列 是消息的容器
 *
 * 5.Binding  绑定 消息队列和交换器之间的关联 多对多
 *
 * 6.Connection 网络连接
 *
 * 7.Channel 信道 复用Tcp连接
 *
 * 8.Consumer 消费者
 *
 * 9.Virtual Host 虚拟主机 相当于主机和虚机的区别 默认是/
 *
 * 10.Broker 消息队列服务器
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AmqpTest {

    @Autowired
    RabbitTemplate rabbitTemplate;

    /**
     * 1.单播（点对点）
     */
    @Test
    public void contextLoads(){
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "HelloWorld");
        //这个会默认序列化当成消息体
        rabbitTemplate.convertAndSend("xxb.direct", "xxb", map);
    }

    @Test
    public void receive(){
        Object o = rabbitTemplate.receiveAndConvert("xxb");
        System.out.println(o.getClass());
        System.out.println(o);

    }


}
