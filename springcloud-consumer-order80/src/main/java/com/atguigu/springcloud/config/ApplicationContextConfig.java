package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author LI
 * Description: springcloud
 * Created by 2020/4/21 15:20
 * 描述：各种请求的远程访问
 */
@Configuration
public class ApplicationContextConfig {
    /**
     * 使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
     *
     * @return RestTemplate()
     */
    @Bean
//    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
