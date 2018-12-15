package com.example.springbootstudy.dao;

import com.example.springbootstudy.entity.Websites;

public interface WebsitesMapper {
    int insert(Websites record);

    int insertSelective(Websites record);
}