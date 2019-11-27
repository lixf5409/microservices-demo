package com.example.microservices.serviceuser.feign;

import com.example.microservices.serviceuser.feign.entity.Dept;
import org.springframework.stereotype.Component;

/**
 * @ClassName FeignDeptHystric
 * @Description: TODO
 * @Author chengqianpeng
 * @Date 2019/11/27 
 **/
@Component
public class FeignDeptHystric implements FeignDeptService {

    @Override
    public Dept getDeptById(Integer deptId) {
        Dept dept = new Dept();
        dept.setDeptId(1);
        return dept;
    }
}
