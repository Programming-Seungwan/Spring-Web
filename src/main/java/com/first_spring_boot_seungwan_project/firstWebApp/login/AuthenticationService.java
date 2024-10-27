package com.first_spring_boot_seungwan_project.firstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("seungwan");
        boolean isValidPassword = password.equals("981123");
        return isValidUsername && isValidPassword;
    }
}
