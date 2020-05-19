package com.example.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login/success")
    public String success() {
        return "login success";
    }
    
    @RequestMapping("/api/userinfo")
    public UserDetails userinfo() {
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return (UserDetails)auth.getPrincipal();
    }


}
