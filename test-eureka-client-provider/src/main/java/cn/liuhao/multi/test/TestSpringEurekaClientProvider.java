package cn.liuhao.multi.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TestSpringEurekaClientProvider {
    public static void main(String[] args) {
        SpringApplication.run(TestSpringEurekaClientProvider.class, args);
    }
}
