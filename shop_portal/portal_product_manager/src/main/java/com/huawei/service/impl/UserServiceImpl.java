package com.huawei.service.impl;

import com.huawei.dao.UsertableMapper;
import com.huawei.service.IUserService;
import com.huawei.vo.usertable;
import com.huawei.vo.UsertableCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UsertableMapper userDao;
    @Override
    public List<usertable> findAllUser() {
        UsertableCondition condition=new UsertableCondition();
        return userDao.selectByCondition(condition);
    }
}
