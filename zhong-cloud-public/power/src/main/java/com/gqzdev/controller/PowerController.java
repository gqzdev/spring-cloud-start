package com.gqzdev.controller;

import com.gqzdev.bean.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName: PowerController
 * @author: ganquanzhong
 * @date: 2020/4/30 17:04
 */

@RestController
public class PowerController {

/*    @RequestMapping("/getPower")
    public Object getPower(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("power","调用power服务00 返回结果success ");
        return map;
    }*/

    /**
     *  Hystrix  处理微服务调用链中出现错误
     *  降级  超时监控
     */

    //模拟服务降级  方法报错
/*    @RequestMapping("/getPower")
    public Object getPower(String name) throws Exception{
        HashMap<String, Object> map = new HashMap<>();
        map.put("power","调用power服务00 --服务降级-- 返回结果success ");
        if (name==null){
            throw new Exception();
        }
        return map;
    }*/


    //超时监控  方法报错
/*    @RequestMapping("/getPower")
    public Object getPower() throws InterruptedException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("power","调用power服务00 --访问超时-- 返回结果success【power0】");
        Thread.sleep(2000);
        return map;
    }*/


    //熔断机制
/*    @RequestMapping("/getPower")
    public Object getPower(String name) throws Exception {
        HashMap<String, Object> map = new HashMap<>();
        map.put("power","调用power服务00 --熔断-- 返回结果success【power0】");
        if (null == name){
            throw new Exception();
        }
        return map;
    }*/


    //限流  方法报错
    @RequestMapping("/getPower")
    public Object getPower() throws InterruptedException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("power","调用power服务00 --模拟限流{线程池控制}-- 返回结果success【power0】");
        Thread.sleep(10000);
        return map;
    }


    @RequestMapping("/getProduct")
    public Product getProduct(){
        return new Product(212,"Spring Cloud入门到项目实战","全站式微服务解决方案--》power0",68.902);
    }
}
