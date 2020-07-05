package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @author: LI
 * @Date: 2020/5/18 12:44
 * @Description:
 */

public class CustomerHandler {

    public CommonResult customerHandler(BlockException exception) {
        return new CommonResult(4444, "按客户自定义处理异常,global-------customerHandler");
    }

    public CommonResult customerHandler2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义处理异常,global--------customerHandler2");
    }
}
