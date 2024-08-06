package com.zyh.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhuYuHao
 * @time 2024/6/1
 */
@Data
public class PaymentPO implements Serializable {
    private long id;
    private String serial;
}
