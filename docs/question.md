微服务条目	落地技术	备注
服务开发	Springboot、Spring、SpringMVC	
服务配置与管理	Netflix公司的Archaius、阿里的Diamond等	
服务注册与发现	Eureka、Consul、Zookeeper等	
服务调用	Rest、RPC、gRPC	
服务熔断器	Hystrix、Envoy等	
负载均衡	Ribbon、Nginx等	
服务接口调用(客户端调用服务的简化工具)	Feign等	
消息队列	Kafka、RabbitMQ、ActiveMQ等	
服务配置中心管理	SpringCloudConfig、Chef等	
服务路由（API网关）	Zuul等	
服务监控	Zabbix、Nagios、Metrics、Spectator等	
全链路追踪	Zipkin，Brave、Dapper等	
服务部署	Docker、OpenStack、Kubernetes等	
数据流操作开发包	SpringCloud Stream（封装与Redis,Rabbit、Kafka等发送接收消息）	
事件消息总线	Spring Cloud Bus	
......		

##  问题

1. 什么是微服务？
2. 微服务之间是如何独立通讯的
3. SpringCloud和Dubbo有哪些区别？
4. SpringBoot和SpringCloud，请你谈谈对他们的理解
5. 什么是服务熔断？什么是服务降级？
6. 微服务的优缺点分别是什么？说说你在项目中遇到的坑？
7. 



## 微服务概述

Martin Fowler

**MicroServices**

微服务

​		强调的是服务的大小，它关注的是某一个点，是具体解决某一个问题/提供落地对应服务的一个服务应用,
狭意的看,可以看作Eclipse里面的一个个微服务工程/或者Module



微服务架构

​	a new microservices architectural style

​	small services  

一种架构模式，服务与服务之间用轻量级通信协议



微服务的缺点：

​	开发人员要处理复杂的分布式事务

​	运维



**微服务技术栈**

![1588144618556](C:\Users\ganquanzhong\AppData\Roaming\Typora\typora-user-images\1588144618556.png)

Dubbo 与Spring Cloud的技术选型



目前成熟的互联网架构（分布式+服务治理Duboo）

 		

Spring Cloud与Dubbo的对比

