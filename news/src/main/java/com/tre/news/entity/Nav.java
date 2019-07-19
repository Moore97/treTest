package com.tre.news.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "tbl_leibie")
public class Nav {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自带递增
    private Integer id;
    @Column
    private String nav1;

    public String getNav1() {
        return nav1;
    }

    public void setNav1(String nav1) {
        this.nav1 = nav1;
    }

//
//    public String getNav1() {
//        return nav1;
//    }
//
//    public void setNav1(String nav1) {
//        this.nav1 = nav1;
//    }

//    @Column
//    private String nav1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String getNav() {
//        return nav;
//    }
//
//    public void setNav(String nav) {
//        this.nav = nav;
//    }
}
