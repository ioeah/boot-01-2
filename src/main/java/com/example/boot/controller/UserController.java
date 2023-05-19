package com.example.boot.controller;

import com.example.boot.domain.User;
import com.example.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/5/10 16:59
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public User getUser() {
        return userService.getUser();
    }
}
