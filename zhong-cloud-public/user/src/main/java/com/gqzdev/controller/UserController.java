package com.gqzdev.controller;

import com.gqzdev.service.PowerFeignClient;
import com.gqzdev.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * @ClassName: UserController
 * @author: ganquanzhong
 * @date: 2020/4/30 16:38
 */

@RestController
public class UserController {

    private static final String POWER_URL="Http://SERVER-POWER";
    private static final String ORDER_URL="Http://SERVER-ORDER";

    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private PowerFeignClient powerFeignClient;

    @RequestMapping("/getUser")
    public Result getUser(){

        HashMap<String, Object> map = new HashMap<>();
        map.put("key","user");
        return Result.success("返回成功",map);
    }


    /**
     *  远程调用其他模块的服务 RPC 远程调用  Remote Procedure Call
     * 调用其他模块的服务接口   通过RestTemplate     Dubbo   Eureka
     *  power服务，搭建集群
     *  使用nginx反向代理，负载均衡调用power服务
     */

    @RequestMapping("/getPower")
    public Result getPower(){

        //通过Nginx方向代理，直接访问nginx服务 【RestTemplate】
        //return Result.success("操作成功！",restTemplate.getForObject("http://localhost/getPower",Object.class));

        //调用Eureka注册的服务，通过服务名
        return Result.success("调用成功",restTemplate.getForObject(POWER_URL+"/getPower",Object.class));
    }

    /**
     *  通过使用Feign组件  封装请求调用
     */
    @RequestMapping("/getFeignPower")
    public Result getFeignPower(){
        System.out.println("----->通过FeignPower调用 ");
        return powerFeignClient.getPower();

    }



    @RequestMapping("/getOrder")
    public Result getOrder(){

        //通过Nginx方向代理，直接访问nginx服务 【RestTemplate】
        //return Result.success("操作成功！",restTemplate.getForObject("http://localhost/getPower",Object.class));

        //调用Eureka注册的服务，通过服务名
        return Result.success("调用成功",restTemplate.getForObject(ORDER_URL+"/getOrder",Object.class));
    }
}
