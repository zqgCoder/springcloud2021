package com.catchstar.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;                     // 返回通用数据类型

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
