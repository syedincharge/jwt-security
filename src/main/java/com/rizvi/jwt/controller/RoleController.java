package com.rizvi.jwt.controller;

import com.rizvi.jwt.entity.Role;
import com.rizvi.jwt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

     @Autowired
     private RoleService roleService;

    @PostMapping("/{create-role}")
     public Role createNewRole(@RequestBody Role role){
     return roleService.createNewRole(role);

     }
}
