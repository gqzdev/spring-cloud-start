Spring Cloud对微服务的解决方案是

通过RestTemplate调用其他服务中的Controller,基于HTTP协议 RestFul风格
或者通过Feign封装的调用
- 而 Dubbo是通过service的引用，就像本地调用一样

不同微服务，配置不同的Ribbon的负载均衡策略


IRule不同通过ComponentScan扫描，这样会扫到一个里面

单独放在config包下面配置