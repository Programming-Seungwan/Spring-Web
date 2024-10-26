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

    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My first HTML PAGE!</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>My first HTML PAGE with body!</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    @RequestMapping("/say-hello-jsp")
    @ResponseBody
    public String sayHelloJSP() {
        return "say Hello"; // 그냥 문자열을 반환하면 문자열을 이름으로하는 view를 반환한다.
    }
}
