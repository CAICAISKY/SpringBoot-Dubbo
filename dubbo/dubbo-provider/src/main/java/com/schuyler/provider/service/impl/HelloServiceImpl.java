package com.schuyler.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.schuyler.api.HelloService;


@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String s) {
        return "Hello " + s + "!";
    }
}
