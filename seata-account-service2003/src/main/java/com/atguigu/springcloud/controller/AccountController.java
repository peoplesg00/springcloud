package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.domian.CommonResult;
import com.atguigu.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author: LI
 * @Date: 2020/5/20 16:00
 * @Description:
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult<>(200, "扣减账户余额成功");
    }
}
