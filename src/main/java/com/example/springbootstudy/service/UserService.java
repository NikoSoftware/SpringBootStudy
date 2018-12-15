package com.example.springbootstudy.service;


import com.example.springbootstudy.entity.User;

import java.util.ArrayList;

public interface UserService {

     int insertUser(User user);

     ArrayList<User> getAllUser();

     User selectByPrimaryKey(Integer id);

}
