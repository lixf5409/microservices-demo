package com.example.microservices.servicedept.service.impl;

import com.example.microservices.servicedept.dao.entity.Dept;
import com.example.microservices.servicedept.dao.mapper.DeptMapper;
import com.example.microservices.servicedept.service.IDeptService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo<Dept> findAll(Integer curPage, Integer pageSize) {
        PageHelper.startPage(curPage, pageSize);
        List<Dept> list = deptMapper.findAll();
        PageInfo<Dept> pageInfo =  new PageInfo<Dept>(list);
        return pageInfo;
    }

    @Override
    public Dept getDept(Integer deptId) {
        return deptMapper.getDept(deptId);
    }
}
