package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vadulasp on 8/23/16.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Welcome to Das Boot";
    }
}
