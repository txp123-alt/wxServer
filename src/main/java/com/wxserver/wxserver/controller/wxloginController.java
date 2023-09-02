package com.wxserver.wxserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wxlogin")
public class wxloginController {

    @GetMapping("/control")
    public String loginControl(){
        return "接收到登录请求";
    }

}
