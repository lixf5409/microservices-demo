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

    /**
     *
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
    User getUser(Long userId);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(Long userId);
}
