package cn.liuhao.multi.test.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyApplicationListener implements ApplicationListener {



    @Autowired
    private ApplicationEventPublisher eventPublisher;

    private static Logger logger = LoggerFactory.getLogger(MyApplicationListener.class);

    private static List<ApplicationEvent> events = new ArrayList<ApplicationEvent>();

    public void onApplicationEvent(ApplicationEvent event) {
        events.add(event);
        logger.debug("cn.liuhao.multi.test.processor.MyApplicationListener.onApplicationEvent event type[" + event.getClass() + "]");
    }
}
