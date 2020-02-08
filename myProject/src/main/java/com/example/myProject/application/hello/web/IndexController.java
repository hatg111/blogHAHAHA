package com.example.myProject.application.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {
    @GetMapping(value = "/")
    public ModelAndView getHome(ModelAndView mnv) throws Exception {
        mnv.setViewName("index");
        return mnv;
    }

    @GetMapping(value = "/blog/view")
    public ModelAndView getView(ModelAndView mnv) throws Exception {
        mnv.setViewName("blog/view");
        return mnv;
    }

    @GetMapping(value = "/blog/modify")
    public ModelAndView getModifyView(ModelAndView mnv) throws Exception {
        mnv.setViewName("blog/modify");
        return mnv;
    }


}
