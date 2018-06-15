package com.hua.demo.controller;

import com.hua.demo.websocket.ServerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/22.
 */
@RestController
public class TestController {

    @GetMapping("/hi")
    public String test(){
        return "Hello";
    }

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    //客户端只要订阅了/topic/subscribeTest主题，调用这个方法即可
    @GetMapping("/b")
    public void templateTest() {
        messagingTemplate.convertAndSend("/topic/subscribeTest", new ServerMessage("服务器主动推的数据"));
    }

    //客户端只要订阅了/topic/subscribeTest主题，调用这个方法即可
    @GetMapping("/a")
    public void templateTest1() {
        messagingTemplate.convertAndSend("/topic/sendTest", new ServerMessage("服务器主动推的数据"));
    }
}
