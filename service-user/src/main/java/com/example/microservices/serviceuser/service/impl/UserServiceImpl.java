package com.example.microservices.serviceuser.service.impl;

import com.example.microservices.serviceuser.dao.entity.User;
import com.example.microservices.serviceuser.dao.mapper.UserMapper;
import com.example.microservices.serviceuser.feign.FeignDeptService;
import com.example.microservices.serviceuser.feign.entity.Dept;
import com.example.microservices.serviceuser.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.shardingsphere.core.keygen.DefaultKeyGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jnlp.IntegrationService;
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
    public PageInfo<User> findListByDeptId(Integer deptId, Integer pageNum, Integer pageSize) {
        //分页插件，只有startPage方法后的第一个select会执行分页
        PageHelper.startPage(pageNum, pageSize);
        List<User> list = userMapper.findListByDeptId(deptId);

        PageInfo<User> pageInfo =  new PageInfo<User>(list);
        return pageInfo;
    }

    @Override
    public User getUser(String userId) {
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
    public User insertUser(String userName, String userCode, String sex, String phone, String birthday, String remarks, Integer deptId) {
        User user = new User();
        //通过sharding-jdbc生成分布式id
        Number userId = new DefaultKeyGenerator().generateKey();
        user.setUserId(String.valueOf(userId.longValue()));
        user.setUserName(userName);
        user.setUserCode(userCode);
        user.setSex(sex);
        user.setPhone(phone);
        user.setBirthday(birthday);
        user.setRemarks(remarks);
        user.setDeptId(deptId);
        userMapper.insertUser(user);
        return user;
    }

    @Override
    public void updateUser(String userId, String userName, String userCode, String sex, String phone, String birthday, String remarks, Integer deptId) {
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
    public void deleteUser(String userId) {
        userMapper.deleteUser(userId);
    }
}
