package com.example.microservices.servicedept.service.impl;

import com.example.microservices.servicedept.dao.entity.Dept;
import com.example.microservices.servicedept.dao.mapper.DeptMapper;
import com.example.microservices.servicedept.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiaofeng on 2019/11/12.
 */
@Service("deptService")
public class DeptServiceImpl implements IDeptService {
    @Autowired
    DeptMapper deptMapper;
    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public Dept getDept(Integer deptId) {
        return deptMapper.getDept(deptId);
    }
}
