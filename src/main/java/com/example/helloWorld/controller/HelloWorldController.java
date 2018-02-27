package com.example.helloWorld.controller;

import com.example.helloWorld.emity.User;
import com.example.helloWorld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/user/{id}")
//    public String index(){
//        return "Hello World";
//    }
    public User getUserC(@PathVariable int id){
        User user=userService.getUser(id);
        return user;
    }

}
