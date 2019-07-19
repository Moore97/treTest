package com.tre.news.service;

import com.tre.news.entity.Nav;

import java.util.List;

public interface NavService {
    public List<Nav> findAll();

    public List<Nav> findAllByOrderByIdDesc();
}
