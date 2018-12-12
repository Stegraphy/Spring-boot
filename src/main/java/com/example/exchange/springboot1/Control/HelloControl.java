package com.example.exchange.springboot1.Control;

import com.example.exchange.springboot1.pojo.IMoocJSONResult;
import com.example.exchange.springboot1.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControl {

    @Autowired
    private Resource resource;

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

    @RequestMapping("/getResource")
    public IMoocJSONResult getResource() {
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);

        return IMoocJSONResult.ok(bean);
    }


}
