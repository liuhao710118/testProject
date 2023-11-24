package cn.liuhao.multi.test.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("cn.liuhao.multi.test.processor.MyBeanFacrotyProcessor")
public class MyBeanFacrotyProcessor implements BeanFactoryPostProcessor {

    private static Logger logger = LoggerFactory.getLogger(MyBeanFacrotyProcessor.class);

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        logger.debug("beanDefinitionNames" + Arrays.toString(beanDefinitionNames));
        logger.debug("beanDefinitionCount=" + beanDefinitionCount);
        logger.debug("执行 cn.liuhao.multi.test.processor.MyBeanFacrotyProcessor.postProcessBeanFactory");
    }
}
