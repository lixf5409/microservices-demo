package com.example.microservices.servicedept.dao.mapper;

import com.example.microservices.servicedept.dao.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 *
 * @author lixiaofeng
 * @date 2019/11/12
 */
@Mapper()
@Repository("deptMapper")
public interface DeptMapper {

    List<Dept> findAll();
    Dept getDept(Integer deptId);
}
