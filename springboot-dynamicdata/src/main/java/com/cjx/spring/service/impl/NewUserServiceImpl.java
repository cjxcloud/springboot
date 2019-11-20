package com.cjx.spring.service.impl;

import com.cjx.spring.bean.News;
import com.cjx.spring.config.DynamicDataSourceContextHolder;
import com.cjx.spring.dao.NewsDao;
import com.cjx.spring.service.NewUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NewUserServiceImpl implements NewUserService {

    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> getByMap(Map<String, Object> map) {
        DynamicDataSourceContextHolder.resetDatabaseType();
        return newsDao.getByMap(map);
    }

    @Override
    public News getById(Integer id) {
        DynamicDataSourceContextHolder.resetDatabaseType();
        return newsDao.getById(id);
    }

    @Override
    public News create(News news) {
        DynamicDataSourceContextHolder.resetDatabaseType();
        newsDao.create(news);
        return news;
    }

    @Override
    public News update(News news) {
        DynamicDataSourceContextHolder.resetDatabaseType();
        newsDao.update(news);
        return news;
    }

    @Override
    public int delete(Integer id) {
        DynamicDataSourceContextHolder.resetDatabaseType();
        return newsDao.delete(id);
    }

}
