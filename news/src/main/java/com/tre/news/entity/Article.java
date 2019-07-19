package com.tre.news.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "tbl_article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自带递增
    private Integer id;
    @Column
    private String articleTitle;
    @Column
    private String articleContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}
