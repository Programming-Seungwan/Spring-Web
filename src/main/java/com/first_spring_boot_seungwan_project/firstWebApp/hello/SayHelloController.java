package com.first_spring_boot_seungwan_project.firstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World!"; // 그냥 문자열을 반환하면 문자열을 이름으로하는 view를 반환한다.
    }
}
