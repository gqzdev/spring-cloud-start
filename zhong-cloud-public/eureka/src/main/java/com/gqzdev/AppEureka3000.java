package com.gqzdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: AppEureka
 * @author: ganquanzhong
 * @date: 2020/5/7 17:59
 */


@SpringBootApplication
@EnableEurekaServer
public class AppEureka3000 {

    public static void main(String[] args){
        SpringApplication.run(AppEureka3000.class,args);
    }
}
