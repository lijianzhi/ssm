package com.example.helloWorld.serviceImpl;

import com.example.helloWorld.dao.UserMapper;
import com.example.helloWorld.emity.User;
import com.example.helloWorld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public User getUser(int id){
        return userMapper.selectUserById(id);
    }
}
