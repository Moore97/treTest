package com.tre.news.service.impl;

import com.tre.news.dao.ArticleDao;
import com.tre.news.entity.Article;
import com.tre.news.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleDao articleDao;
    @Override
    public List<Article> findAll() {
        return articleDao.findAll();
    }

    @Override
    public List<Article> findAllByOrderByIdDesc() {
        return articleDao.findAllByOrderByIdDesc();
    }
}
