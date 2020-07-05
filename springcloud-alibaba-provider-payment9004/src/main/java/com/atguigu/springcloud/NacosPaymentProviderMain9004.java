package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: LI
 * @Date: 2020/5/18 13:10
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentProviderMain9004 {
    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentProviderMain9004.class, args);
    }
}
