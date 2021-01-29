package com.catchstar.springcloud.dao;

import com.catchstar.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public int add(Payment payment);

    public Payment getById(@Param("id") Long id);
}
