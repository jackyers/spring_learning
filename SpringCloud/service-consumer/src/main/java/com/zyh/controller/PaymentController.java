package com.zyh.controller;

import com.zyh.feign.PaymentFeignClient;
import com.zyh.po.PaymentPO;
import com.zyh.po.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhuYuHao
 * @time 2024/6/2
 */
@RestController
@RequestMapping("consumer")
@Slf4j
public class PaymentController {
//    @Autowired
//    RestTemplate restTemplate;
//
//    @RequestMapping("findById/{id}")
//    public Result<PaymentPO> findById(@PathVariable long id){
////        String url = "http://localhost:8001/provider/findById?id=" + id;
//        //通过服务提供方的服务名称进行调用
//        String url = "http://SERVICE-PROVIDER/provider/findById?id=" + id;
//        return restTemplate.getForObject(url,Result.class);
//    }

    //注入的是feign接口的代理对象
    @Resource
    PaymentFeignClient paymentFeignClient;

    @RequestMapping("findById/{id}")
    public Result<PaymentPO> findById(@PathVariable("id") long id){
        Result<PaymentPO> result = paymentFeignClient.findById(id);
        return result;
    }

    @Resource
    DiscoveryClient discoveryClient;

    //获取注册中心的服务实例信息
    @RequestMapping("discovery")
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        for (String service:list){
            log.info("Service:" + service);
        }
        //根据服务的实例名称获取对应的服务实例信息
        List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
        for (ServiceInstance instance:instances){
            //获取服务的主机地址
            String host =  instance.getHost();
            //获取服务的端口号
            int port = instance.getPort();
            String serviceId = instance.getServiceId();
            log.info("Host:" + host + " Port" + port + " ServiceId" + serviceId);
        }
        return this.discoveryClient;
    }
}
