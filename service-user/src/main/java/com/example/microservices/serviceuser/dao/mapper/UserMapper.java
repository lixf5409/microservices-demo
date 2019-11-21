package com.example.microservices.serviceuser.dao.mapper;

import com.example.microservices.serviceuser.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by lixiaofeng on 2019/11/12.
 */
@Mapper()
@Repository("userMapper")
public interface UserMapper {

    List<User> findAll();
    User getUser(Integer userId);
}
