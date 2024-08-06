package com.zyh.feign;

import com.zyh.po.PaymentPO;
import com.zyh.po.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhuYuHao
 * @time 2024/7/25
 */
//定义feign接口的包，必须和消费方的包名一致
    //使用@RequestParam，消费方和客户端都需要加这个注解
    //消费方传递pojo实体的时候，feign客户端和提供方需要加@RequestBody
@FeignClient(name = "service-provider")//标识当前接口是一个feign客户端,name/value：服务提供方的服务名称
public interface PaymentFeignClient {
    //定义feign接口，需要将服务提供方的控制器方法，带上springMVC注解(注意url要拷贝全)，拷贝过来
    @RequestMapping("provider/findById")
    Result<PaymentPO> findById(@RequestParam("id") long id);

}
