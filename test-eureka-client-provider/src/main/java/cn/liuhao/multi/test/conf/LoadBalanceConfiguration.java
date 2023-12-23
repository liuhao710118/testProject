package cn.liuhao.multi.test.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class LoadBalanceConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {

        return new RestTemplate();
    }

}
