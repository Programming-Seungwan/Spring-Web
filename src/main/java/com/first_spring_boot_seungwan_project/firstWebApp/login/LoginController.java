package com.first_spring_boot_seungwan_project.firstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("login")
    public String goToLoginPage(@RequestParam String name, ModelMap model) { // model을 통해서 원하는 데이터를 jsp 같은 view에 제공할 수 있음
        model.put("name", name);
        return "login";
    }

}
