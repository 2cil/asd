package com.atu.mapper;

import com.atu.entity.Heroes;
import com.atu.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface HeroMapper {
    List<Heroes> getAll();
    List<Heroes> getq();
}
