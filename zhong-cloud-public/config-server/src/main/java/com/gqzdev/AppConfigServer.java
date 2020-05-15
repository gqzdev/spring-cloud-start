package com.gqzdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName AppConfigServer
 * @Description
 * @Author ganquanzhong
 * @Date2020/5/14 21:30
 * @Version
 **/

@SpringBootApplication

//注册到Eureka中 做集群
//@EnableEurekaClient
@EnableConfigServer
public class AppConfigServer {
    public static void main(String[] args){
        SpringApplication.run(AppConfigServer.class,args);
    }
}
