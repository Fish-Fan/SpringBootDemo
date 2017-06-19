package com.fanyank.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanfeng-mac on 2017/6/19.
 */
@RestController
@EnableAutoConfiguration
public class BbsController {
    @RequestMapping("/")
    public String index() {
        return "欢迎光临我的论坛";
    }

    public static void main(String[] args) {
        SpringApplication.run(BbsController.class,args);
    }
}
