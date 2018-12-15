package com.example.springbootstudy.serviceimpl;

import com.example.springbootstudy.dao.UserMapper;
import com.example.springbootstudy.entity.User;
import com.example.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;


@Service("UserService")
public class UserServiceImpl implements UserService {

   @Resource
    UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public ArrayList<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }


}
