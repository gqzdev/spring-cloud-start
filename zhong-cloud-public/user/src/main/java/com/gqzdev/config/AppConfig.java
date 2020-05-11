package com.gqzdev.config;

import com.gqzdev.rule.MyLBRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @ClassName: AppConfig
 * @author: ganquanzhong
 * @date: 2020/4/30 16:46
 */

@ComponentScan("com.gqzdev")
@Configuration
public class AppConfig extends WebMvcConfigurationSupport {

    /**
     * @LoadBalanced 负载均衡
     *
     * Eureka只负责服务的发现与注册，不能调用服务
     *
     * 需要使用netflix提供的Ribbon组件
     * Ribbon客户端的负载均衡
     *
     */



    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }

    /**
     *  自定义Ribbon的负载均衡 策略
     *  RoundRobbinRule  轮询  默认
     *  RandomRule  随机
     *  Retry
     */

    //不同微服务，配置不同的Ribbon策略。
    @Bean
    public IRule iRule(){
//        new RoundRobinRule();
        //return new RandomRule();

        //使用自定义的rule
        return new MyLBRule();
    }

    @Override
    protected void configurePathMatch(PathMatchConfigurer configurer) {
        //super.configurePathMatch(configurer);
        configurer.setUseSuffixPatternMatch(true);
    }


/*    @Bean
    public TomcatServletWebServerFactory tomcat(){
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.setPort(5000);
        return tomcat;
    }*/

}
