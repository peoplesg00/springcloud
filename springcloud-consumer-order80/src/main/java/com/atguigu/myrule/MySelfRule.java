package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LI
 * Description: springcloud
 * Created by 2020/4/26 20:40
 * 描述：
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRile() {
        /**
         * 定义为随机
         */
        return new RandomRule();
    }
}
