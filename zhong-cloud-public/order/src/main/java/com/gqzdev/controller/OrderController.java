package com.gqzdev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName: OrderController
 * @author: ganquanzhong
 * @date: 2020/5/11 15:07
 */

@RestController
public class OrderController {


    @RequestMapping("/getOrder")
    public Object getOrder(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("orderinfo","order 订单信息 uid  productInfo");
        return map;
    }
}
