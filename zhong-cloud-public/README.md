## Spring Cloud 微服务Start


### Eureka  
服务发现与注册
  微服务中的每个模块都需要注册到Eureka中！！

  单实例，一般不注册自己
  
  集群，将服务注册到多个Eureka

  心跳检测机制
  
  

### Ribbon
服务客户端的负载均衡
  自定义IRule 策略


### Feign
服务调用


### Hystrix  
服务熔断
   服务限流  超时监控  服务熔断  服务降级
   
### Zuul 网关
   路由 router 
   过滤器 filter
   集群 高可用  
   
### Hystrix DashBorad
   监控板
   
### Spring Cloud Config
   配置中心
   从Git、GitHub、GitLab、GitEE获取配置信息
   
          