package com.itwang.hello.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @GetMapping(value = "/")
    public String index(){
        return "hello world,this is cola test;";
    }
}
