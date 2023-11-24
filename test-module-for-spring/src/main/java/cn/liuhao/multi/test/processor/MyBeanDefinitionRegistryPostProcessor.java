package cn.liuhao.multi.test.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

@Component("cn.liuhao.multi.test.processor.MyBeanDefinitionRegistryPostProcessor")
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    private static Logger logger = LoggerFactory.getLogger(MyBeanDefinitionRegistryPostProcessor.class);

    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

        logger.debug("执行 cn.liuhao.multi.test.processor.MyBeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry");
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        logger.debug("执行 cn.liuhao.multi.test.processor.MyBeanDefinitionRegistryPostProcessor.postProcessBeanFactory");
    }
}
