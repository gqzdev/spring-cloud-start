package com.gqzdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: OrderApplication01
 * @author: ganquanzhong
 * @date: 2020/5/11 15:19
 */

@SpringBootApplication
@EnableEurekaClient
public class OrderApplication01 {

    public static void main(String[] args){
        SpringApplication.run(OrderApplication01.class,args);
    }

}
