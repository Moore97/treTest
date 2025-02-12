package com.tre.news.dao;

import com.tre.news.entity.Nav;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NavDao extends JpaRepository<Nav,Long> {
    List<Nav> findAll();
    List<Nav> findAllByOrderByIdDesc();
    Nav getNavById(Integer id);
}
