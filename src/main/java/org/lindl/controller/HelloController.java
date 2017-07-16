package org.lindl.controller;

import org.lindl.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lin on 2017/7/16.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        User user=new User();
        user.setUsername("LinDL");
        user.setPassword("123456");
        return user;
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String view(Model model){
        model.addAttribute("name","Lindl");
        return "hello";
    }
}
