package com.aaa.controller;

import com.aaa.entity.Users;
import com.aaa.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@Controller
@RequestMapping("/users")
public class UsersController {
    @Resource
    UsersService service;

    @RequestMapping(value="/querypwd",method = RequestMethod.GET)
    @ResponseBody
    public Users querypwd(Model model, String uname, String pwd){
        Users users =  service.querypwd(uname,pwd);
        model.addAttribute("list"+users);
        System.out.println(users);
        return users;
    }
}

