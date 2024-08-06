package com.zyh.mapper;

import com.zyh.po.PaymentPO;

/**
 * @author zhuYuHao
 * @time 2024/6/1
 */
public interface PaymentMapper {
    PaymentPO findById(long id);
    void add(PaymentPO paymentPO);
}
