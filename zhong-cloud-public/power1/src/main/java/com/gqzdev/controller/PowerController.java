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


    @RequestMapping("/getPower")
    public Object getPower(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("key","power-cluster-01  服务提供者 【power1】  ");
        return map;
    }

    @RequestMapping("/getProduct")
    public Product getProduct(){
        return new Product(212,"Spring Cloud入门到项目实战","",68.902);
    }
}
