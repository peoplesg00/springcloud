package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: LI
 * @Date: 2020/5/20 12:37
 * @Description:
 */
@Mapper
public interface OrderDao {
    /**
     * 1.新建订单
     *
     * @param order 订单参数
     */
    void create(Order order);

    /**
     * 2.修改订单状态
     *
     * @param userId 用户ID
     * @param status 订单状态
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
