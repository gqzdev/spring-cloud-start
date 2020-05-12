package com.gqzdev;

import config.OrderRuleConfig;
import config.PowerRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: AppUserClient
 * @author: ganquanzhong
 * @date: 2020/4/30 16:31
 */

@SpringBootApplication
@EnableEurekaClient

//配置不同微服务，使用不同负载均衡策略

@RibbonClients({
        @RibbonClient(name = "SERVER-ORDER",configuration = OrderRuleConfig.class),
        @RibbonClient(name = "SERVER-POWER",configuration = PowerRuleConfig.class)
})

@EnableFeignClients
@EnableHystrix
public class AppUserClient {

    public static void main(String[] args){
        SpringApplication.run(AppUserClient.class,args);
    }
}
