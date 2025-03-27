package com.db.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    //http://localhost:9898/home/user
    @GetMapping("/users")
    public String getUser()
    {
        System.out.println("getting Users");
        return "users";
    }
}
