package cn.liuhao.multi.test.controller;

import cn.liuhao.multi.test.service.TestProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DefaultController {

    private static String providerDomain = "TEST-EUREKA-CLIENT-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TestProviderService testProviderService;

    @GetMapping("/info")
    public String info() {
        String res = restTemplate.getForObject("http://" + providerDomain + "/info", String.class);
        String info = testProviderService.info();
        return "consumer "+res;
    }

}