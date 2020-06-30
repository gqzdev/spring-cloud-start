package com.gqzdev.service;

import com.gqzdev.util.Result;
import org.springframework.stereotype.Component;

/**
 * @ClassName: PowerFeignFallBack
 * @author: ganquanzhong
 * @date: 2020/5/12 17:26
 */

@Component
public class PowerFeignFallBack implements PowerFeignClient{
    @Override
    public Result getPower() {
        return Result.error("服务调用失败，请稍后重试！！！！");
    }

    @Override
    public Result getProduct() {
        return Result.error("商品服务繁忙,,调用失败，请稍后重试！！！！");
    }
}
