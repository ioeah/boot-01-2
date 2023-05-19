package com.example.boot.service;

import com.example.boot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/5/10 16:59
 */
public class UserService {

    @Autowired
    private User user;

    public User getUser() {
        return user;
    }
}
