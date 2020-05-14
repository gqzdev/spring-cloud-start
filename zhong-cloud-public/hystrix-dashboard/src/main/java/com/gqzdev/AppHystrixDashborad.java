package com.gqzdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName: AppHystrixDashborad
 * @author: ganquanzhong
 * @date: 2020/5/14 16:21
 */

@SpringBootApplication
@EnableHystrixDashboard
public class AppHystrixDashborad {
    public static void main(String[] args){
        SpringApplication.run(AppHystrixDashborad.class,args);
    }
}
