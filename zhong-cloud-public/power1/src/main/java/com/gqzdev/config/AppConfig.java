package com.gqzdev.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: AppConfig
 * @author: ganquanzhong
 * @date: 2020/4/30 16:46
 */

@Configuration
public class AppConfig {



    @Bean
    public TomcatServletWebServerFactory tomcat(){
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.setPort(6001);
        return tomcat;
    }

}
