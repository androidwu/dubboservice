package com.example.dubboservice.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.model.User;
import com.example.api.service.DemoService;

import java.util.Date;

@Service
public class DefaultDemoService implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello,"+name+"(from Springboot2)";
    }

    @Override
    public User sayHello2(User user) {
        user.setBirthday(new Date());
        user.setAge(11);
        return user;
    }
}
