package com.gqzdev.controller;

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

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getUser")
    public Result getUser(){

        HashMap<String, Object> map = new HashMap<>();
        map.put("key","user");
        return Result.success("返回成功",map);
    }


    /**
     *  调用其他模块的服务接口
     *  power服务，搭建集群
     *  使用nginx反向代理，负载均衡调用power服务
     */

    @RequestMapping("/getPower")
    public Result getPower(){

        return Result.success("操作成功！",restTemplate.
                getForObject("http://localhost/getPower",Object.class));
    }
}
