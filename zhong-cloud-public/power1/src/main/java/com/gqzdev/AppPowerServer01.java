package com.gqzdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: AppPowerServer
 * @author: ganquanzhong
 * @date: 2020/4/30 17:01
 */

@SpringBootApplication
@EnableEurekaClient
public class AppPowerServer01 {

    public static void main(String[] args){
        SpringApplication.run(AppPowerServer01.class,args);
    }
}
