package com.example.springbootstudy.dao;

import com.example.springbootstudy.entity.Person;

public interface PersonMapper {
    int insert(Person record);

    int insertSelective(Person record);
}