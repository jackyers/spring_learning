package com.zyh.controller;

import com.zyh.po.PaymentPO;
import com.zyh.po.Result;
import com.zyh.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuYuHao
 * @time 2024/6/1
 */
@RestController
@RequestMapping("provider")
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @Value("${server.port}")
    String port;
    @RequestMapping("findById")
    public Result<PaymentPO> findById(@RequestParam("id") long id){
        PaymentPO paymentPO = paymentService.findById(id);
        return new Result<>(200,"成功成功,当前服务端口号是" + this.port,paymentPO);
    }
}
