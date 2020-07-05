package com.atguigu.xpringcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author LI
 * Description: springcloud
 * Created by 2020/4/26 15:11
 * 描述：
 */
@RestController
public class OrderZkController {

    private static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping(value = "/consumer/payment/zk")
    public String getInvokeUrl() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }
}
