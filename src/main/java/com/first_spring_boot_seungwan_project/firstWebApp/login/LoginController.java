package com.first_spring_boot_seungwan_project.firstWebApp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    // RequestMapping의 여러 속성들을 통해 해당 컨트롤러가 특정 요청에만 반응하게 만들어줄 수도 있음
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToLoginPage() { // model을 통해서 원하는 데이터를 jsp 같은 view에 제공할 수 있다
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);
            // 여기에서 인증 로직을 추가해서 이상하면 다른 페이지로 리다이렉트 시키기
            return "welcome";
        }

        model.put("errorMessage", "invalid username or password");
        return "login";
    }

}
