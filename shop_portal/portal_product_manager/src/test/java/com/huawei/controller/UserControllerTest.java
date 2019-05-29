package com.huawei.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {
        UserController.class,
        PropertySourcesPlaceholderConfigurer.class
}, initializers = ConfigFileApplicationContextInitializer.class)
public class UserControllerTest {
    @Autowired
    private UserController userController;
    @Test
    public void getAllUsers() {
        userController.getAllUsers();
    }
}