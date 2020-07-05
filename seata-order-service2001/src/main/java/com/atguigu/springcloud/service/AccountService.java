package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author: LI
 * @Date: 2020/5/20 13:07
 * @Description:
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
    /**
     * 扣减金额
     *
     * @param userId 用户id
     * @param money  金额
     * @return 结果
     * //@PostMapping(value = "/account/decrease")
     */
    @GetMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
