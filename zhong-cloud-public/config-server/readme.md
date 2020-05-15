## Spring Cloud Config

### 服务端配置   config-server模块

配置一个spring-cloud-config-server【服务端】，并注册到Eureka中

添加依赖`pom.xml`

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-config-server</artifactId>
</dependency>
```

`application.yml`中添加config配置

```yaml
server:
  port: 8888

spring:
  application:
    name: spring-cloud-config

  cloud:
    config:
      server:
        git:
          #配置文件在github上的地址
          uri: https://github.com/gqzdev/spring-cloud-config.git
          username: gqzdev
          password:

          #Config  Server会在 Git仓库根目录、 foo子目录，
          # 以及所有以gqz开始的子目录中查找配置文件。
          search-paths: "gqz*"

          #启动时就clone仓库到本地，默认是在配置被首次请求时，
          #configserver才会clone git仓库
          clone-on-start: true

          #若配置中心在本地，本地的地址

#          native:#search-locations: classpath:/config

#服务注册到Eureka中
eureka:
    client:
        serviceUrl:
          defaultZone: http://localhost:3000/eureka/  #eureka服务端提供的注册地址 参考服务端配置的这个路径

    instance:
        instance-id: config-1 #此实例注册到eureka服务端的唯一的实例ID
        prefer-ip-address: true #是否显示IP地址
        leaseRenewalIntervalInSeconds: 1 #eureka客户需要多长时间发送心跳给eureka服务器，表明它仍然活着,默认为30 秒 (与下面配置的单位都是秒)
        leaseExpirationDurationInSeconds: 3 #Eureka服务器在接收到实例的最后一次发出的心跳后，需要等待多久才可以将此实例删除，默认为90秒

```

在启动类上面添加注解 `@EnableConfigServer`

```java
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class AppConfigServer {
    public static void main(String[] args){
        SpringApplication.run(AppConfigServer.class,args);
    }
}
```

### 客户端   从config中心获取配置

配置好了注册中心，其他的模块则可以获取配置

添加依赖，`pom.xml`

```xml
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-config</artifactId>
</dependency>
```

:balloon:  可通过下面的方式访问

```
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
```

## Config集群，高可用

将配置中心config注册到eureka