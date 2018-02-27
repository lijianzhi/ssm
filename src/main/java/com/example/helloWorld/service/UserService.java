package com.example.helloWorld.service;

import com.example.helloWorld.emity.User;
import org.springframework.stereotype.Service;


public interface UserService {
     User getUser(int id);
}
