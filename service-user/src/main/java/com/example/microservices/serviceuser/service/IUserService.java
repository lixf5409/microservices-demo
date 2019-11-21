package com.example.microservices.serviceuser.service;

import com.example.microservices.serviceuser.dao.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lixiaofeng on 2019/11/12.
 */
public interface IUserService {


    /**
     * 查询所有用户信息
     * @name findAll
     * @author chengqianpeng
     * @date 1:52 下午 2019/11/21
     * @param 
     * @return java.util.List<com.example.microservices.serviceuser.dao.entity.User>
     * @throws 
     */
    List<User> findAll();
    /**
     * 部门ID获取用户列表
     * @name findListById
     * @author chengqianpeng
     * @date 11:24 上午 2019/11/21
     * @param deptId
     * @return java.util.List<com.example.microservices.serviceuser.dao.entity.User>
     * @throws
     */
    List<User> findListByDeptId(Integer deptId);

    /**
     * 根据用户ID获取用户信息
     * @name getUser
     * @author chengqianpeng
     * @date 11:25 上午 2019/11/21
     * @param userId
     * @return com.example.microservices.serviceuser.dao.entity.User
     * @throws
     */
    User getUser(@Param("userId") Integer userId);

    void insertUser(String userName, String userCode, String sex, String phone, String birthday, String remarks, Integer deptId);

    void updateUser(Integer userId, String userName, String userCode, String sex, String phone, String birthday, String remarks, Integer deptId);

    void deleteUser(Integer userId);
}
