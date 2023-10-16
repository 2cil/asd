package com.atu.service;

import com.atu.entity.Heroes;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public interface HeroService {
    List<Heroes> getAll();
}
