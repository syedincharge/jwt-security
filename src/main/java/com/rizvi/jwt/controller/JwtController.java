package com.rizvi.jwt.controller;

import com.rizvi.jwt.entity.JwtRequest;
import com.rizvi.jwt.entity.JwtResponse;
import com.rizvi.jwt.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @PostMapping({"/authenticate"})
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
     return jwtService.createJwtToken(jwtRequest);

    }
}
