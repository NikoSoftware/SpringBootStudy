package com.example.springbootstudy.controller;


import com.example.springbootstudy.domain.ServerSetting;
import com.example.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class TextControl {

    @Autowired
    ServerSetting serverSetting;

    @Resource
    UserService userService;

    @RequestMapping("/")
    Object Home(){

        return serverSetting;

    }


    @RequestMapping("/hotStart")
    Object hotStart(){

        return "hotStart success!";

    }


    @RequestMapping("/getAllPersonInfo")
    Object getAllPersonInfo(){

        return null;
    }


    @RequestMapping("/selectByPrimaryKey")
    Object selectByPrimaryKey(){

        return null;
    }

}
