package com.wgs.exe.dockerspringbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/docker/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, Docker Spring Boot Demo!" + "测试Docker Hub + Github自动构建技术";
    }
}
