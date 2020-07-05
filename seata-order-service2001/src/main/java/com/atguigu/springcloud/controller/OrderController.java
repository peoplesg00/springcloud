package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.domain.CommonResult;
import com.atguigu.springcloud.domain.Order;
import com.atguigu.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: LI
 * @Date: 2020/5/20 13:41
 * @Description:
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping(value = "/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult<>(200, "下订单成功");
    }
}
