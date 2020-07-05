package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author LI
 * Description: springcloud
 * Created by 2020/4/28 11:50
 * 描述：
 */
@Component
public class MyLb implements LoadBalanced {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 利用自旋锁获取期待值
     *
     * @return 期待得到的值
     */
    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = (current >= 2147483647) ? 0 : (current + 1);
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("*****第几次访问:next:" + next);
        return next;
    }


    /**
     * 负载均衡算法：rest接口第几次请求 % 服务器集群总数量 = 实际调用服务器位置下标
     * 每次服务重启后rest接口计数从1开始
     *
     * @param instanceList 集群数量
     * @return 第几个服务器
     */
    @Override
    public ServiceInstance instance(List<ServiceInstance> instanceList) {
        int index = getAndIncrement() % instanceList.size();
        return instanceList.get(index);
    }
}
