package com.cjx.spring.service;

import com.cjx.spring.entity.User;

import java.util.List;

public interface UserService {

    List<User> list();

    List<User> findByUsername(String username);

    User get(String userId);
}
