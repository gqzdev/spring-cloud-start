package com.gqzdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName: AppZuul
 * @author: ganquanzhong
 * @date: 2020/5/13 13:40
 */

@SpringBootApplication
@EnableZuulProxy
public class AppZuul9001 {

    public static void main(String[] args){
        SpringApplication.run(AppZuul9001.class,args);
    }
}
