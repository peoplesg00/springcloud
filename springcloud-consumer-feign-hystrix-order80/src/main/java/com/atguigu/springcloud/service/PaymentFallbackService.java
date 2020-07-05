package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author LI
 * Description: springcloud
 * Created by 2020/5/8 21:07
 * 描述：
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "paymentInfo_Ok ————O(∩_∩)O哈哈~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "paymentInfo_TimeOut————o(╥﹏╥)o";
    }
}
