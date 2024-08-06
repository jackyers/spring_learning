package com.zyh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan(basePackages = "com.zyh.mapper")
@EnableDiscoveryClient //开启服务发现的功能
public class ProviderApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
