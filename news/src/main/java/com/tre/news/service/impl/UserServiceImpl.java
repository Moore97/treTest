package com.tre.news.service.impl;

import com.tre.news.dao.UserDao;
import com.tre.news.entity.User;
import com.tre.news.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public List<User> findAllByOrderByIdDesc() {
        return userDao.findAllByOrderByIdDesc();
    }
}
