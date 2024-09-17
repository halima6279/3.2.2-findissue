package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    @ResponseBody
    public String homePage(){
        return "home";
    }
    @GetMapping("/index")
    @ResponseBody
    public String indexPage(){
        return "index";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }


}
