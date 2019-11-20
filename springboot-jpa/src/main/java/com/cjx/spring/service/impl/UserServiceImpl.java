package com.cjx.spring.service.impl;

import com.cjx.spring.entity.User;
import com.cjx.spring.repository.UserRepository;
import com.cjx.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User get(String userId) {
        return userRepository.getOne(userId);
    }
}
