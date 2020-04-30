package com.gqzdev.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: AppConfig
 * @author: ganquanzhong
 * @date: 2020/4/30 16:46
 */

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }


    @Bean
    public TomcatServletWebServerFactory tomcat(){
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.setPort(5000);
        return tomcat;
    }

}
