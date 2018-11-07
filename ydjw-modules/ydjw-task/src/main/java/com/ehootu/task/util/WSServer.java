package com.ehootu.task.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyong
 * @create 2017-11-29 10:53
 **/

@ServerEndpoint("/ws/{userId}")
public class WSServer {
    private final static Logger log = LoggerFactory.getLogger(WSServer.class);
    public static List<WSServer> sessionList= new ArrayList<WSServer>();
    public Session session;//
    public String userId;
    //连接打开时执行
    @OnOpen
    public void onOpen(@PathParam("userId") String userId, Session session) {
        this.userId = userId;
        this.session =session;
        log.info("onOpen userId:"+userId);
        sessionList.add(this);
    }

    //收到消息时执行
    @OnMessage
    public String onMessage(String message, Session session) {
        log.info("onMessage userId:"+userId);
        return userId + "：" + message;
    }

    //连接关闭时执行
    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        log.info("onClose userId:"+userId);
        sessionList.remove(this);
    }

    //连接错误时执行
    @OnError
    public void onError(Throwable t) {
        log.info("onError userId:"+userId);
        sessionList.remove(this);
    }
}
