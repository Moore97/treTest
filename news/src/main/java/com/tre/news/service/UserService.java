package com.tre.news.service;

import com.tre.news.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public List<User> findAllByOrderByIdDesc();


}
