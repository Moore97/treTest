package com.tre.news.service.impl;

import com.tre.news.dao.NavDao;
import com.tre.news.entity.Nav;
import com.tre.news.service.NavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NavServiceImpl implements NavService {
    @Autowired
    NavDao navDao;
    @Override
    public List<Nav> findAll() {
        return navDao.findAll();
    }

    @Override
    public List<Nav> findAllByOrderByIdDesc() {
        return navDao.findAllByOrderByIdDesc();
    }
}
