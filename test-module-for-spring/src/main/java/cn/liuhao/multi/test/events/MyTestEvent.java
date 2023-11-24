package cn.liuhao.multi.test.events;

import org.springframework.context.ApplicationEvent;

public class MyTestEvent extends ApplicationEvent {
    public MyTestEvent(Object source) {
        super(source);
    }
}
