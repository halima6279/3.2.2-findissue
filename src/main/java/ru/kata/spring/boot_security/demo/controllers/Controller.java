package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String homePage(){
        return "home";
    }

    @GetMapping("/authenticated")
    public String pageForAuthenticatedUsers(){
        return "secured part of website";
    }
}
