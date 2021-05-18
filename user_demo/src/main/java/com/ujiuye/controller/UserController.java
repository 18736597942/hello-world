package com.ujiuye.controller;

import com.ujiuye.pojo.User;
import com.ujiuye.pojo.result.Result;
import com.ujiuye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add/{id}/{name}")
    public Result add(@PathVariable Integer id,@PathVariable String name){
        User user=new User();
        user.setId(1);
        user.setName("gaoke");
        userService.save(user);
        return Result.ok();
    }

    @GetMapping
    public Result selectAll(){
        List<User> list=userService.list(null);
        return Result.ok().data("list",list);
    }

    @GetMapping("/{id}")
    public Result selectOne(@PathVariable Integer id){
        User user=userService.getById(id);
        return Result.ok().data("user",user);
    }
}
