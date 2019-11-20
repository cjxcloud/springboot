package com.cjx.spring.service.impl;

import com.cjx.spring.bean.User;
import com.cjx.spring.config.DynamicDataSourceContextHolder;
import com.cjx.spring.dao.UserDao;
import com.cjx.spring.enums.DatabaseTypeEnum;
import com.cjx.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getByMap(Map<String,Object> map){
        DynamicDataSourceContextHolder.setDatabaseType(DatabaseTypeEnum.USER);
        return userDao.getByMap(map);
    }

    @Override
    public User getById(Integer id){
        DynamicDataSourceContextHolder.setDatabaseType(DatabaseTypeEnum.USER);
        return userDao.getById(id);
    }

    @Override
    public User create(User user){
        DynamicDataSourceContextHolder.setDatabaseType(DatabaseTypeEnum.USER);
        userDao.create(user);
        return user;
    }

    @Override
    public User update(User user){
        DynamicDataSourceContextHolder.setDatabaseType(DatabaseTypeEnum.USER);
        userDao.update(user);
        return user;
    }

    @Override
    public int delete(Integer id){
        DynamicDataSourceContextHolder.setDatabaseType(DatabaseTypeEnum.USER);
        return userDao.delete(id);
    }
}
