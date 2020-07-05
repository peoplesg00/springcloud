package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author LI
 * Description: springcloud
 * Created by 2020/4/28 11:48
 * 描述：手写轮循算法接口
 */
public interface LoadBalanced {

    /**
     * 得到第几个服务器
     *
     * @param instanceList 集群数量
     * @return 第几个服务器
     */
    ServiceInstance instance(List<ServiceInstance> instanceList);
}
