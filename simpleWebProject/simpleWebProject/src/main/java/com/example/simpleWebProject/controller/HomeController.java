package com.example.simpleWebProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController//because just @Controller requests a page!
public class HomeController {

    @RequestMapping("/")
    @ResponseBody //need to put so that text is the body.
    public String greet(){
        return "Hello World!";
    }

    @RequestMapping("/about")
    @ResponseBody
    public String about(){
        return "I'm doing this to learn";
    }
}
