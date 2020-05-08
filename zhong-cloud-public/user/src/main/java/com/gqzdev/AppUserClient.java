package com.gqzdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: AppUserClient
 * @author: ganquanzhong
 * @date: 2020/4/30 16:31
 */

@SpringBootApplication

@EnableEurekaClient
public class AppUserClient {

    public static void main(String[] args){
        SpringApplication.run(AppUserClient.class,args);
    }
}
