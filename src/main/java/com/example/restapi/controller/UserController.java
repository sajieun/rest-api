package com.example.restapi.controller;

import com.example.restapi.model.UserRequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @PostMapping("/user")
    public UserRequestParam User(
            @RequestBody UserRequestParam userRequestParam
    ){
        System.out.println(userRequestParam);
        return userRequestParam;
    }
}
