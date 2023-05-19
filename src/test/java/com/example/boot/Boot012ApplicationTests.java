package com.example.boot;

import com.example.boot.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Boot012ApplicationTests {

    @Autowired
    private UserController userController;

    @Test
    void contextLoads() {
        System.out.println(userController.getUser());
    }

}
