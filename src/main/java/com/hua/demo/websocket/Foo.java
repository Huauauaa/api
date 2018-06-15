package com.hua.demo.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

/**
 * Created by Administrator on 2018/6/15.
 */
public class Foo {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    //客户端只要订阅了/topic/subscribeTest主题，调用这个方法即可
    public void templateTest() {
        messagingTemplate.convertAndSend("/topic/subscribeTest", new ServerMessage("服务器主动推的数据"));
    }
}
