package cn.liuhao.multi.test.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("TEST-EUREKA-CLIENT-PROVIDER")
public interface TestProviderService {

    @RequestMapping(method = RequestMethod.GET, value = "/info")
    public String info();

}
