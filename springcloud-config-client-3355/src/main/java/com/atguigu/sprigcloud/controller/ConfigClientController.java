package com.atguigu.sprigcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LI
 * @Date: 2020/5/10 15:45
 * @Description:
 */
@RestController
@RefreshScope
/**
 * 配置了 @RefreshScope后还需要运行下面命令，动态更新
 * curl -X POST "http://localhost:3355/actuator/refresh"
 */
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
