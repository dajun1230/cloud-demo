package com.ycj.user.service.impl;

import com.ycj.user.mapper.UserMapper;
import com.ycj.user.pojo.User;
import com.ycj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Long id){
        return userMapper.queryById(id);
    }
}
