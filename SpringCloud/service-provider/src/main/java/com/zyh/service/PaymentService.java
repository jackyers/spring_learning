package com.zyh.service;

import com.zyh.mapper.PaymentMapper;
import com.zyh.po.PaymentPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuYuHao
 * @time 2024/6/1
 */
@Service
public class PaymentService {
    @Autowired
    PaymentMapper paymentMapper;

    public PaymentPO findById(long id){
        return paymentMapper.findById(id);
    }

    public void add(PaymentPO paymentPO){
        paymentMapper.add(paymentPO);
    }
}
