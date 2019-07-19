package com.tre.news.service;

import com.tre.news.entity.Article;

import java.util.List;

public interface ArticleService {
    public List<Article> findAll();

    public List<Article> findAllByOrderByIdDesc();


}
