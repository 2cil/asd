package com.atu.service;

import com.atu.entity.Heroes;
import com.atu.mapper.HeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class HeroServiceImpl implements HeroService {
    @Autowired
    private HeroMapper heroMapper;
    @Override
    public List<Heroes> getAll(){
        return heroMapper.getAll();
    }
}
