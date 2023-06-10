package com.atguigu.spring6.resource.service;

import com.atguigu.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author hliu
 * @Date 2023/5/23 19:54
 * @Version 1.0
 */
@Service("myUserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao myUserDao;

    @Override
    public void add() {
        System.out.println("service........");
        myUserDao.add();
    }
}
