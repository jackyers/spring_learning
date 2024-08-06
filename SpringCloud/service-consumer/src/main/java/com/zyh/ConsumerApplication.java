package com.zyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhuYuHao
 * @time 2024/6/2
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//扫描feign客户端，扫描规则是当前启动类所在的包及其子包
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
