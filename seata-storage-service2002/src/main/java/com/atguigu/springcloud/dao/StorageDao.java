package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: LI
 * @Date: 2020/5/20 15:19
 * @Description:
 */
@Mapper
public interface StorageDao {
    /**
     * 扣减库存
     *
     * @param productId 已用库存 +
     * @param count     剩余库存  -
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
