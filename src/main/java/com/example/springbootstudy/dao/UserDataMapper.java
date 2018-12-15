package com.example.springbootstudy.dao;

import com.example.springbootstudy.entity.UserData;

public interface UserDataMapper {
    int insert(UserData record);

    int insertSelective(UserData record);
}