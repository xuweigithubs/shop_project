package com.huawei.service.impl;

import com.huawei.ProductApplication;
import com.huawei.service.IUserService;
import com.huawei.vo.usertable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProductApplication.class)
public class UserServiceImplTest {
    @Autowired
    private IUserService userService;
    @Test
    public void findAllUser() {
      List<usertable> result=userService.findAllUser();
      System.out.println(result);
    }
}