package com.gqzdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @ClassName: AppZipkinServer
 * @author: ganquanzhong
 * @date: 2020/5/15 16:39
 */

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class AppZipkinServer {
    public static void main(String[] args){
        SpringApplication.run(AppZipkinServer.class);
    }
}
