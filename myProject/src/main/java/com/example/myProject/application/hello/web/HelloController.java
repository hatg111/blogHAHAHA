package com.example.myProject.application.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public ModelAndView getHome(ModelAndView mnv) throws Exception {
        mnv.setViewName("home");
        return mnv;
    }

//    @GetMapping(value = "/")
//    public String goHome() throws Exception {
//        return "hello";
//    }

}
