package com.gqzdev.controller;

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
        map.put("power","调用power服务00 返回结果success ");
        return map;
    }
}
