package com.catchstar.springcloud.controller;

import com.catchstar.springcloud.entity.CommonResult;
import com.catchstar.springcloud.entity.Payment;
import com.catchstar.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    // http://localhost/consumer/payment/create?serial=aabb02
    @PostMapping("/payment/create")
    public CommonResult add(@RequestBody Payment payment) {
        int result = paymentService.add(payment);
        log.info("*****插入结果******" + result);

        if(result > 0) {
            return new CommonResult(200, "插入成功", result);
        } else {
            return new CommonResult(444, "插入失败", null);
        }

    }

    // http://localhost/consumer/payment/get/10004
    @GetMapping("/payment/get/{id}")
    public CommonResult getById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getById(id);
        log.info("*****查询结果******O(∩_∩)O哈哈~" + id);

        if(payment != null) {
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(444, "查询失败，查询ID：" + id, null);
        }

    }
}
