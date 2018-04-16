package com.example.controller;


import com.example.entity.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private static List<User> userList;
    private static final Log logger = LogFactory.getLog(UserController.class);

    /**
     * UserController类构造器，初始化List<User>集合
     */
    public UserController() {

        super();
        userList = new ArrayList<>();
    }

    @RequestMapping(value="/register", method = RequestMethod.GET)
    public String registerForm() {

        logger.info("Register GET 方法被调用");
        return "registerForm";
    }

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String registerForm(@RequestParam("loginName") String loginName, @RequestParam("password") String password,
    @RequestParam("userName") String userName) {

        logger.info("Register POST 方法被调用");

        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);
        user.setUserName(userName);
        userList.add(user);

        return "loginForm";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("loginName") String loginName, @RequestParam("password") String password, Model model) {

        logger.info("登录名: " + loginName + "密码: " + password);

        for(User user : userList) {
            if (user.getLoginName().equals(loginName) && user.getPassword().equals(password)) {
                model.addAttribute("user", user);
                return "welcome";
            }
        }
        return "loginForm";
    }

}
