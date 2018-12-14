package com.example.springbootstudy.controller;


import com.example.springbootstudy.domain.ServerSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextControl {

    @Autowired
    ServerSetting serverSetting;

    @RequestMapping("/")
    Object Home(){


        return serverSetting;

    }


    @RequestMapping("/hotStart")
    Object hotStart(){


        return "hotStart success!";

    }



}
