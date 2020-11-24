package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserRestController {
    private static UserService service;

    public UserRestController(){
        service = UserService.getInstance();
    }

    @GetMapping("/all")
    public List<User> findAll(){
        return service.findAll();
    }

}
