package com.example.demo.controller;

import com.example.demo.pojo.ResponseMessage;
import com.example.demo.pojo.User;
import com.example.demo.pojo.dto.UserDto;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController  // 接口方法返回对象 转换成json文本
@RequestMapping("/user")  //localhost:8088/user/**
public class UserController {

    @Autowired
    IUserService userService;

    // REST风格的接口
    // 增加
    @PostMapping
    ////localhost:8088/user     method: post
    public ResponseMessage<User> add(@Validated @RequestBody UserDto user){
        User userNew = userService.add(user);
        return ResponseMessage.success(userNew);
    }

    // 查询
    @GetMapping("/{userId}") ////localhost:8088/user/1     method: get
    public ResponseMessage get(@PathVariable Integer userId){
        User userNew = userService.getUser(userId);
        return ResponseMessage.success(userNew);
    }
    // 修改
    @PutMapping     ////localhost:8088/user/1     method: get
    public ResponseMessage edit(@Validated @RequestBody UserDto user){
        User userNew = userService.edit(user);
        return ResponseMessage.success(userNew);
    }
    // 删除用户
    @DeleteMapping("/{userId}")
    public ResponseMessage delete(@PathVariable Integer userId){
        userService.delete(userId);
        return ResponseMessage.success();
    }
}
