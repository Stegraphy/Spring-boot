package com.example.exchange.springboot1.Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControl {


    @RequestMapping("hello")
    @ResponseBody
    public String sys() {
        return "HelloWorld!";
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String admin() {
        return "需授权";
    }
}
