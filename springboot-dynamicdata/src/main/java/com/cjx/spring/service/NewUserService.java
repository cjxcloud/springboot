package com.cjx.spring.service;

import com.cjx.spring.bean.News;

import java.util.List;
import java.util.Map;

public interface NewUserService {

    List<News> getByMap(Map<String, Object> map);

    News getById(Integer id);

    News create(News news);

    News update(News news);

    int delete(Integer id);
}
