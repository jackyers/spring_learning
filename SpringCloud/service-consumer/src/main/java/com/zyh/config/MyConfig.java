package com.zyh.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhuYuHao
 * @time 2024/6/2
 */
@Configuration
public class MyConfig {
    @Bean
    @LoadBalanced //开启负载均衡的调用
    //ribbon的依赖已经被整合在eureka-client依赖中
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule iRule(){
        //也可以在配置文件中定义负载均衡策略
        return new RandomRule();
    }
}
