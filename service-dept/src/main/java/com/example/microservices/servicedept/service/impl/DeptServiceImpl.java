package com.example.microservices.servicedept.service.impl;

import com.example.microservices.servicedept.dao.entity.Dept;
import com.example.microservices.servicedept.dao.mapper.DeptMapper;
import com.example.microservices.servicedept.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * @author lixiaofeng
 * @date 2019/11/12
 */
@Service("deptService")
public class DeptServiceImpl implements IDeptService {
    @Autowired
    DeptMapper deptMapper;
    @Resource
    RedisTemplate<Integer,Dept> redisTemplate;
//    @Autowired
//    RedisTemplate<Object,Object> redisTemplate;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public Dept getDept(Integer deptId) {
        Dept dept = redisTemplate.opsForValue().get(deptId);
        if(dept != null){
            return dept;
        }
        dept = deptMapper.getDept(deptId);
        redisTemplate.opsForValue().set(deptId,dept);
        return dept;
    }
}
