package com.rizvi.jwt.controller;

import com.rizvi.jwt.entity.User;
import com.rizvi.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class UserController {

     @Autowired
     private UserService userService;

     @PostConstruct
     public void initRolesAndUsers(){
          userService.initRolesAndUser();
     }

     @GetMapping("/foradmin")
     public String forAdmin(){
          return "This URL is only accessible for Admin to Login";
     }

     @GetMapping("/foruser")
     public String forUser(){
          return "This URL is accessible for User to Login";
     }

     @PostMapping("(/{registernewuser})")
     public User registerNewUser(@RequestBody User user){

     return userService.registerNewUser(user);

    }
}
