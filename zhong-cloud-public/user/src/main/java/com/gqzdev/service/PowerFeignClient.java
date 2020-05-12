package com.gqzdev.service;

        import com.gqzdev.util.Result;
        import org.springframework.cloud.openfeign.FeignClient;
        import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: PowerFeignClient
 *
 *  使用Feign组件，统一调用
 *
 * @author: ganquanzhong
 * @date: 2020/5/11 16:17
 */

@FeignClient(name = "SERVER-POWER",fallback =PowerFeignFallBack.class )
public interface PowerFeignClient {
    @RequestMapping("/getPower")
    public Result getPower();

    @RequestMapping("/getProduct")
    public Result getProduct();
}
