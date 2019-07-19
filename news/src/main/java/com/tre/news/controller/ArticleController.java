package com.tre.news.controller;

import com.tre.news.dao.ArticleDao;
import com.tre.news.entity.Article;
import com.tre.news.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @Autowired
    ArticleDao articleDao;

    @GetMapping("/ulist2")
    public String showPage(Model model){
        List<Article> list=articleService.findAllByOrderByIdDesc();
        model.addAttribute("article",list);
        return "tables2";
    }

    //来到添加页面
    @GetMapping("/article")
    public String toAdd(Model model){
//        List<User> list=userService.findAll();
//        model.addAttribute("users",list);
        return "add2";
    }


    //添加操作
    @RequestMapping(value = "/addarticle",method = RequestMethod.POST)
    public String insertArticle(Article article,Map<String,Object> map){
        articleDao.save(article);
        map.put("msg","添加成功!!!");
        return "redirect:/ulist2";
    }

    //删除
    @DeleteMapping("/ulist2/{id}")
    public String delete(Article article){
        articleDao.delete(article);
        System.out.println("删除数据");
        return  "redirect:/ulist2";
    }

    //来到修改页面，查出当前员工，在页面的回显
    @GetMapping("/ulist2/{id}")
    public  String toEditPage(@PathVariable("id") Integer id,Model model){
        Article article=articleDao.getArticleById(id);
        model.addAttribute("article",article);
        return "add2";
    }

    //员工修改,需要提交员工id
    @PutMapping("/addarticle")
    public String updateArticle(Article article, Map<String,Object> map){
        articleDao.save(article);
        map.put("msg","修改成功");
        System.out.println("修改数据");
        return "redirect:/ulist2";

    }



}
