package com.example.helloWorld.dao;

import com.example.helloWorld.emity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {
    User selectUserById(Integer Id);
}
