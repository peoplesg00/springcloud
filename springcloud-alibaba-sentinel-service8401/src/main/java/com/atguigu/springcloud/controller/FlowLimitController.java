package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author: LI
 * @Date: 2020/5/17 20:21
 * @Description:
 */
@RestController
@Slf4j
public class FlowLimitController {
    @GetMapping(value = "/testA")
    public String testA() {
        try {
            TimeUnit.MICROSECONDS.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("I am testA.");
        return "I am testA()";
    }

    @GetMapping(value = "/testB")
    public String testB() {
        log.info("I am testB.");
        return "I am testB()";
    }

    @GetMapping(value = "/testD")
    public String testD() {
        log.info("I am testD.测试异常比例");
        int age = 10 / 0;
        return "I am testD()，测试异常比例";
    }

    @GetMapping(value = "/testE")
    public String testE() {
        log.info("I am testE.测试异常数");
        int age = 10 / 0;
        return "I am testE()，测试异常数";
    }

    @GetMapping(value = "/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        log.info("I am testHotKey.测试热点key,p1=" + p1 + ",p2=" + p2);
        return "I am testHotKey()，测试热点key,p1=" + p1 + ",p2=" + p2;
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception) {
        log.info("deal_testHotKey，o(╥﹏╥)o,p1=" + p1 + ",p2=" + p2);
        return "deal_testHotKey，o(╥﹏╥)o,p1=" + p1 + ",p2=" + p2;
    }
}
