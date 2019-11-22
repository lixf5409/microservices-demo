package com.example.microservices.servicedept.service;

import com.example.microservices.servicedept.dao.entity.Dept;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lixiaofeng on 2019/11/12.
 */
public interface IDeptService {
    PageInfo<Dept> findAll(Integer curPage, Integer pageSize);
    Dept getDept(@Param("deptId") Integer deptId);
}
