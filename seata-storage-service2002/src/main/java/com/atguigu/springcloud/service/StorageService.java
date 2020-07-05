package com.atguigu.springcloud.service;

/**
 * @author: LI
 * @Date: 2020/5/20 15:27
 * @Description:
 */

public interface StorageService {
    /**
     * 扣减库存
     *
     * @param productId 已用库存  +
     * @param count     剩余库存  -
     */
    void decrease(Long productId, Integer count);
}
