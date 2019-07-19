package com.tre.news.service.impl;

import com.tre.news.dao.UserDao;
import com.tre.news.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserDao userDao;


    @Override
    public int countAllByUserNameAndPassword(String username, String password) {
        return userDao.countAllByUserNameAndPassword(username, password);
    }


}
