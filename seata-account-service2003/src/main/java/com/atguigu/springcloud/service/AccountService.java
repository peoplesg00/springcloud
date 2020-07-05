package com.atguigu.springcloud.service;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author: LI
 * @Date: 2020/5/20 16:19
 * @Description:
 */

public interface AccountService {
    /**
     * 扣减账户余额
     *
     * @param userId 用户id
     * @param money  金额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
