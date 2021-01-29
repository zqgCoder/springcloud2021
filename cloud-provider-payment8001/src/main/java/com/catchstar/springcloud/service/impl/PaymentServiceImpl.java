package com.catchstar.springcloud.service.impl;

import com.catchstar.springcloud.dao.PaymentDao;
import com.catchstar.springcloud.entity.Payment;
import com.catchstar.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    // @Autowired
    @Resource
    private PaymentDao paymentDao;

    public int add(Payment payment) {
        return paymentDao.add(payment);
    };

    public Payment getById(Long id) {
        return paymentDao.getById(id);
    };
}
