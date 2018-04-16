package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value="/pathVariable/{userId}")
    public void pathVariableTest(@PathVariable Integer userId) {

    }

    @RequestMapping(value="/requestHeaderTest")
    public void requestHeaderTest(@RequestHeader("User-Agent") String userAgent, @RequestHeader(value="Accept") String[] accepts) {

    }


}
