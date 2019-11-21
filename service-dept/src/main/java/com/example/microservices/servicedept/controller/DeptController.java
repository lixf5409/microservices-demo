package com.example.microservices.servicedept.controller;


import com.example.microservices.servicedept.dao.entity.Dept;
import com.example.microservices.servicedept.service.IDeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chengqianpeng
 */
@RestController
@RequestMapping("/dept")
@Api(tags = "部门服务")
public class DeptController {

    @Autowired
    IDeptService deptService;
    @ApiResponses({
            @ApiResponse(code=200, message = "查询成功"),
            @ApiResponse(code=404, message = "请求失败"),
            @ApiResponse(code=500, message = "参数错误")})
    @ApiOperation(value = "获取所有部门", notes = "获取所有部门列表", response = Dept.class, responseContainer = "List", consumes="application/json")
    @GetMapping("/list")
    public  List<Dept> listDept() {
        List<Dept> depts = deptService.findAll();
        return depts;
    }

    @ApiResponses({
            @ApiResponse(code=200, message = "查询成功"),
            @ApiResponse(code=404, message = "请求失败"),
            @ApiResponse(code=500, message = "参数错误")})
    @ApiOperation(value = "获取部门信息", notes = "根据部门ID获取用户信息", response = Dept.class, consumes="application/json")
    @GetMapping("/get/{deptId}")
    public Dept getDept(@PathVariable Integer deptId) {
        Dept dept = deptService.getDept(deptId);
        return dept;
    }
}