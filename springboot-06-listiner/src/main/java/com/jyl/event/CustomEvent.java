package com.jyl.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);

    }

    public void pringMessage(String msg){

        System.out.println("CustomEvent 事件信息："+ msg);

    }

}
