package cn.liuhao.multi.test.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.LifecycleProcessor;
import org.springframework.stereotype.Component;

@Component("lifecycleProcessor")
public class SpringLifecycleProcessor implements LifecycleProcessor {

    private static Logger logger = LoggerFactory.getLogger(SpringLifecycleProcessor.class);

    public void onRefresh() {
        logger.debug("onRefresh");
    }

    public void onClose() {
        logger.debug("onClose");
    }

    public void start() {
        logger.debug("start");
    }

    public void stop() {
        logger.debug("stop");
    }

    public boolean isRunning() {
        return true;
    }
}
