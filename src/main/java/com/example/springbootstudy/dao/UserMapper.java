package com.example.springbootstudy.dao;

import com.example.springbootstudy.entity.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}