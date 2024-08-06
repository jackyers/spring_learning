package com.zyh.FeignConfig;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhuYuHao
 * @time 2024/7/26
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLever(){
        return Logger.Level.FULL;//设置日志的输出级别
    }
}
