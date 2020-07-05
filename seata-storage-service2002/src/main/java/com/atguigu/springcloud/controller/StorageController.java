package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.domian.CommonResult;
import com.atguigu.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LI
 * @Date: 2020/5/20 15:20
 * @Description:
 */
@RestController
@Slf4j
public class StorageController {
    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     *
     * @param productId 已用库存  +
     * @param count     剩余库存  -
     * @return 扣减结果
     */
    @GetMapping(value = "/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult<>(200, "扣减库存成功");
    }
}
