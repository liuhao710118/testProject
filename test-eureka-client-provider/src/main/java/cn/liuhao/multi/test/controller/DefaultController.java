package cn.liuhao.multi.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DefaultController {

    @GetMapping("/info")
    public String info() {

        return "provider cn.liuhao.multi.test.controller.DefaultController#info";
    }
}
