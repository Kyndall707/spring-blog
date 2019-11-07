package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
//    @GetMapping("/hello")
//    public String sayHello() {
//        return "hello";
//    }
//
//
//    @GetMapping("/hello/{name}")
//    public String sayHelloWithName(@PathVariable String name, Model veiwModle) {
//        veiwModle.addAttribute("name", name);
//        return "hello";
//    }

@GetMapping("/")
    public String index(Model veiwModel){
    return "home";
}


}