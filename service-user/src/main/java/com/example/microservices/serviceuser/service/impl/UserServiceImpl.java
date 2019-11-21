package com.example.microservices.serviceuser.service.impl;

import com.example.microservices.serviceuser.dao.entity.User;
import com.example.microservices.serviceuser.dao.mapper.UserMapper;
import com.example.microservices.serviceuser.feign.FeignDeptService;
import com.example.microservices.serviceuser.feign.entity.Dept;
import com.example.microservices.serviceuser.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author lixiaofeng
 * @date 2019/11/12
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    FeignDeptService feignDeptService;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public List<User> findListByDeptId(Integer deptId) {
        return userMapper.findListByDeptId(deptId);
    }

    @Override
    public User getUser(Integer userId) {
        User user =  userMapper.getUser(userId);
        if (user != null) {
            Dept dept = feignDeptService.getDeptById(user.getDeptId());
            if (dept != null) {
                BeanUtils.copyProperties(dept,user);
            }
        }
        return user;
    }

    @Override
    public void insertUser(String userName, String userCode, String sex, String phone, String birthday, String remarks, Integer deptId) {
        User user = new User();
        user.setUserName(userName);
        user.setUserCode(userCode);
        user.setSex(sex);
        user.setPhone(phone);
        user.setBirthday(birthday);
        user.setRemarks(remarks);
        user.setDeptId(deptId);
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(Integer userId, String userName, String userCode, String sex, String phone, String birthday, String remarks, Integer deptId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName(userName);
        user.setUserCode(userCode);
        user.setSex(sex);
        user.setPhone(phone);
        user.setBirthday(birthday);
        user.setRemarks(remarks);
        user.setDeptId(deptId);
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        userMapper.deleteUser(userId);
    }
}
