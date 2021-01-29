package com.catchstar.springcloud.service;

import com.catchstar.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int add(Payment payment);

    public Payment getById(@Param("id") Long id);
}
