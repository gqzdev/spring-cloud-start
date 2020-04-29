## [MicroServices](http://blog.cuicc.com/blog/2015/07/22/microservices/)



## Spring Cloud architecture highlights

![Spring Cloud diagram](https://spring.io/images/cloud-diagram-1a4cad7294b4452864b5ff57175dd983.svg)



## Service discovery

​		在云计算中，应用程序并不总是知道其他服务的确切位置。服务注册中心(如Netflix Eureka)或sidecar解决方案(如HashiCorp)可以提供帮助。Spring Cloud为流行的注册中心(如Eureka、、Zookeeper甚至Kubernetes的内置系统)提供了DiscoveryClient实现。还有一个Spring云负载均衡器，可以帮助您在服务实例之间小心地分配负载。

​		In the cloud, applications can’t always know the exact location of other services. A service registry, such as [Netflix Eureka](https://github.com/Netflix/eureka), or a sidecar solution, such as [HashiCorp Consul](https://www.consul.io/), can help. Spring Cloud provides `DiscoveryClient` implementations for popular registries such as [Eureka](https://spring.io/projects/spring-cloud-netflix), [Consul](https://spring.io/projects/spring-cloud-consul), [Zookeeper](https://spring.io/projects/spring-cloud-zookeeper), and even [Kubernetes'](https://spring.io/projects/spring-cloud-kubernetes) built-in system. There’s also a [Spring Cloud Load Balancer](https://spring.io/guides/gs/spring-cloud-loadbalancer/) to help you distribute the load carefully among your service instances.

[Get started with this simple guide](https://spring.io/guides/gs/service-registration-and-discovery/)

## API gateway

​		有这么多的客户端和服务器，在云架构中包含一个API网关通常是有帮助的。网关可以负责保护和路由消息、隐藏服务、调整负载和许多其他有用的事情。Spring Cloud Gateway为您提供了对API层的精确控制，集成了Spring云服务发现和客户端负载平衡解决方案，从而简化了配置和维护。

​		With so many clients and servers in play, it’s often helpful to include an API gateway in your cloud architecture. A gateway can take care of securing and routing messages, hiding services, throttling load, and many other useful things. [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway) gives you precise control of your API layer, integrating Spring Cloud service discovery and client-side load-balancing solutions to simplify configuration and maintenance.

[Getting Started with Spring Cloud Gateway](https://spring.io/blog/2019/06/18/getting-started-with-spring-cloud-gateway)

## Cloud configuration

​		在云计算中，配置不能简单地嵌入到应用程序中。配置必须足够灵活，以处理多个应用程序、环境和服务实例，并在不停机的情况下处理动态更改。Spring Cloud Config旨在减轻这些负担，并提供与版本控制系统(如Git)的集成，以帮助您保持配置的安全性。

​		In the cloud, configuration can’t simply be embedded inside the application. The configuration has to be flexible enough to cope with multiple applications, environments, and service instances, as well as deal with dynamic changes without downtime. [Spring Cloud Config](https://spring.io/projects/spring-cloud-config) is designed to ease these burdens and offers integration with version control systems like Git to help you keep your configuration safe.

[Try it now](https://spring.io/guides/gs/centralized-configuration/)

## Circuit breakers

​		Resilience4J, Sentinel, or Hystrix

​		分布式系统可能不可靠。请求可能会遇到超时或完全失败。一个断路器可以帮助缓解这些问题，Spring Cloud断路器为您提供了三种流行的选择:[Resilience4J](https://resilience4j.readme.io/docs/getting-started)、[Sentinel](https://github.com/alibaba/Sentinel/wiki/Circuit-Breaking)或[Hystrix](https://github.com/Netflix/Hystrix/wiki)。

​		Distributed systems can be unreliable. Requests might encounter timeouts or fail completely. A circuit breaker can help mitigate these issues, and [Spring Cloud Circuit Breaker](https://spring.io/projects/spring-cloud-circuitbreaker) gives you the choice of three popular options: [Resilience4J](https://resilience4j.readme.io/docs/getting-started), [Sentinel](https://github.com/alibaba/Sentinel/wiki/Circuit-Breaking), or [Hystrix](https://github.com/Netflix/Hystrix/wiki).

[Try this guide to get started](https://spring.io/guides/gs/circuit-breaker/)

## Tracing

​		调试分布式应用程序可能很复杂，需要很长时间。对于任何给定的故障，您可能需要将来自几个独立服务的信息跟踪拼凑在一起。Spring Cloud Sleuth可以以一种可预测和可重复的方式来检测您的应用程序。当与Zipkin一起使用时，您可以将注意力集中在任何可能出现的延迟问题上。	

​		Debugging distributed applications can be complex and take a long time. For any given failure, you might need to piece together traces of information from several independent services. [Spring Cloud Sleuth](https://spring.io/projects/spring-cloud-sleuth) can instrument your applications in a predictable and repeatable way. And when used in conjunction with [Zipkin](https://zipkin.io/), you can zero in on any latency problems you might have.

## Testing

​		在云计算中，拥有一个可靠的、值得信赖的、稳定的api，您可以获得额外的分数——但是实现它可能是一段旅程。基于契约的测试是高绩效团队经常使用的一种技术，以保持在正轨上。它有助于形式化api的内容，并围绕这些内容构建测试，以确保代码处于检查状态。

​		Spring Cloud Contract使用Groovy、Java或Kotlin编写的契约，为REST和基于消息的api提供基于契约的测试支持。

​		In the cloud, you get extra points for having reliable, trustworthy, stable APIs—but getting there can be a journey. Contract-based testing is one technique that high-performing teams often use to stay on track. It helps by formalizing the content of APIs and building tests around them to ensure code remains in check.

​		[Spring Cloud Contract](https://spring.io/projects/spring-cloud-contract) provides contract-based testing support for REST and messaging-based APIs with contracts written in Groovy, Java, or Kotlin.

[Try this guide to get started](https://spring.io/guides/gs/contract-rest/)



