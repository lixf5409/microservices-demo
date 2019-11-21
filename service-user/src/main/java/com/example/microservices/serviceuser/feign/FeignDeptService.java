package com.example.microservices.serviceuser.feign;

import com.example.microservices.serviceuser.feign.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName FeignUserService
 * @Description: TODO
 * @Author chengqianpeng
 * @Date 2019/11/21 
 **/
@FeignClient(value = "service-dept")
public interface FeignDeptService {

    /**
     * 根据部门ID获取部门信息
     * @name getDeptById
     * @author chengqianpeng
     * @date 2:43 下午 2019/11/21
     * @param deptId 部门ID
     * @return java.lang.String
     * @throws
     */
    @RequestMapping(value = "/dept/get/{deptId}", method = RequestMethod.GET)
    Dept getDeptById(@PathVariable(value = "deptId") Integer deptId);
}
