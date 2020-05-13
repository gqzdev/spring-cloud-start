zuul是什么？
    Zuul包含了对请求的路由和过滤两个最主要的功能：
    其中路由功能负责将外部请求转发到具体的微服务实例上，
    是实现外部访问统一入口的基础而过滤器功能则负责对请求的处理过程进行干预，是实现请求校验、服务聚合等功能的基础.Zuul和Eureka进行整合，
    将Zuul自身注册为Eureka服务治理下的应用，
    同时从Eureka中获得其他微服务的消息，
    也即以后的访问微服务都是通过Zuul跳转后获得。
    注意：Zuul服务最终还是会注册进Eureka
    
    
### 路由
    zuul本身将会注册到eureka中，
    zuul可以通过服务名，调用Eureka中的服务
    
如：zuul模块直接通过服务名，调用order中的接口
http://localhost:9000/server-order/getOrder

配置后，通过 http://localhost:9000/order/getOrder  访问

http://localhost:9000/server-power/getProduct

http://localhost:9000/server-power/getPower 


### 过滤器 filter    
zuul中定义了4中过滤器
 PRE：这种过滤器在请求被路由`之前`调用。可利用这种过滤器实现身份验证、在集群中选择请求的微服务、记录调试信息等。 
 ROUTING：这种过滤器将请求路由到微服务。这种过滤器用于构建发送给微服务的请求，并使用 Apache HttpCIient或 Netfilx Ribbon请求微服务 
 POST:这种过滤器在路由到微服务以后执行。这种过滤器可用来为响应添加标准的 HTTP Header、收集统计信息和指标、将响应从微服务发送给客户端等。 
 ERROR：在其他阶段发生错误时执行该过滤器。