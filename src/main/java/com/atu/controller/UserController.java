package com.atu.controller;

import com.atu.entity.Heroes;
import com.atu.mapper.HeroMapper;
import com.atu.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private HeroService heroService;
    @RequestMapping("getAll")
    public List<Heroes> getAll(){
        return heroService.getAll();
    }
//    @RequestMapping("getq")
//    public List<Heroes> getq(){
//        return heroMapper.getq();
//    }
}
