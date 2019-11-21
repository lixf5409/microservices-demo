package com.example.microservices.servicedept.service;

import com.example.microservices.servicedept.dao.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lixiaofeng on 2019/11/12.
 */
public interface IDeptService {
    List<Dept> findAll();
    Dept getDept(@Param("deptId") Integer deptId);
}
