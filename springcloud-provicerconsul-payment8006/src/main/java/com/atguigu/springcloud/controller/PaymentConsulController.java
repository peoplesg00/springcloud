package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author LI
 * Description: springcloud
 * Created by 2020/4/26 16:04
 * 描述：
 */
@RestController
@Slf4j
public class PaymentConsulController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentConsul() {
        return "SpringCloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
