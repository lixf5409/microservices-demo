package com.example.microservices.serviceuser.service;

import com.example.microservices.serviceuser.dao.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lixiaofeng on 2019/11/12.
 */
public interface IUserService {
    List<User> findAll();
    User getUser(@Param("userId") Integer userId);
}
