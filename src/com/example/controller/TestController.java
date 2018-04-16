package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/test")
public class TestController {

    @ModelAttribute
    public void init(Model model) {

    }

    @RequestMapping(value="/testparams", method = { RequestMethod.GET,
            RequestMethod.POST }, produces = "application/json",
            consumes = "application/json")
    public String test() {

        return "test";
    }
}
