package cn.liuhao.multi.test;

import cn.liuhao.multi.test.conf.BeanFactoryTestConfig;
import cn.liuhao.multi.test.events.MyTestEvent;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationTest {

    @Test
    public void test01() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(BeanFactoryTestConfig.class);
        context.publishEvent(new MyTestEvent(new String("我发布了测试事件")));
        context.close();
    }

}
