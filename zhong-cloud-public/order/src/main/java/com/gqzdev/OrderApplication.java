package com.gqzdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: OrderApplication
 * @author: ganquanzhong
 * @date: 2020/5/11 15:06
 */

@SpringBootApplication
@EnableEurekaClient
public class OrderApplication {

    public static void main(String[] args){
        SpringApplication.run(OrderApplication.class,args);
    }
}
