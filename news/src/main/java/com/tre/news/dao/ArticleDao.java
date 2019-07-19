package com.tre.news.dao;

import com.tre.news.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleDao extends JpaRepository<Article, Long> {

    List<Article> findAll();
    List<Article> findAllByOrderByIdDesc();
    Article getArticleById(Integer id);



}
