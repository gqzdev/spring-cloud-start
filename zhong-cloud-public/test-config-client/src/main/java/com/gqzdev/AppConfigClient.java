package com.gqzdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName AppConfigClient
 * @Description
 * @Author ganquanzhong
 * @Date2020/5/14 22:48
 * @Version
 **/

@SpringBootApplication
@EnableEurekaClient
public class AppConfigClient {
    public static void main(String[] args){
        SpringApplication.run(AppConfigClient.class);
    }
}
