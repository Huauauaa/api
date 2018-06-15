package com.hua.demo.websocket;

/**
 * Created by Administrator on 2018/6/15.
 */
/**
 *
 * @ClassName: ServerMessage
 * @Description: 服务端发送消息实体
 * @author cheng
 * @date 2017年9月27日 下午4:25:26
 */
public class ServerMessage {
    private String responseMessage;

    public ServerMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}