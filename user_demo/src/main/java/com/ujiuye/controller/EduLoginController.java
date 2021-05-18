package com.ujiuye.controller;

import com.ujiuye.pojo.result.Result;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
@CrossOrigin
public class EduLoginController {

    //登录
    @PostMapping("/login")
    public Result login(){
        System.out.println("用户要进行登录啦");
        return Result.ok().data("token","admin");
    }
    //获取用户信息
    @GetMapping("/info")
    public Result info(){
        System.out.println("获取用户信息");
        return Result.ok().data("roles","[admin]")
                .data("name","admin").data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
}
