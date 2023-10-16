package com.atu.controller;

import com.atu.entity.Heroes;
import com.atu.mapper.HeroMapper;
import com.atu.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private HeroService heroService;
    @GetMapping("getAll")
    public List<Heroes> getAll(){
        return heroService.getAll();
    }
    @GetMapping("findByName/{name}")
    public Heroes findByName(@PathVariable("name") String name){
        return heroService.findByName(name);
    }
    @GetMapping("findByType/{type}")
    public List<Heroes> findByType(@PathVariable("type") String type){
        return heroService.findByType(type);
    }
//    @RequestMapping("getq")
//    public List<Heroes> getq(){
//        return heroMapper.getq();
//    }
}
