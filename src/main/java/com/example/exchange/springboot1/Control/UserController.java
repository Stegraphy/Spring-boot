package com.example.exchange.springboot1.Control;

import com.example.exchange.springboot1.pojo.IMoocJSONResult;
import com.example.exchange.springboot1.pojo.Resource;
import com.example.exchange.springboot1.pojo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//@Controller  这是SpringMVC的用法
@RestController     //@RestControll = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Resource resource;

    @RequestMapping("/getuser")
    @ResponseBody
    public User getuser() {

        User u = new User();
        u.setName("LeiCong1");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("llllll");
        u.setDesc("Hi 聪哥slow！");

        return  u;

    }

    @RequestMapping("/getuserJson")
    @ResponseBody
    public IMoocJSONResult getuserJson() {

        User u = new User();
        u.setName("LeiCong2");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("llllll");
        u.setDesc("Hi 聪哥2！");

        return  IMoocJSONResult.ok(u);

    }

    @RequestMapping("/getResource")
    public IMoocJSONResult getResource() {
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);

        return IMoocJSONResult.ok(bean);
    }
}
