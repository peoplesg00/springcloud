package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: LI
 * @Date: 2020/5/18 13:09
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentProvideMain9003 {
    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentProvideMain9003.class, args);
    }
}
