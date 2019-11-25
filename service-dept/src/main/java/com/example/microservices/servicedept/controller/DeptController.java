package com.example.microservices.servicedept.controller;


import com.example.microservices.servicedept.dao.entity.Dept;
import com.example.microservices.servicedept.service.IDeptService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chengqianpeng
 */
@RestController
@RequestMapping("")
@Api(tags = "部门服务")
public class DeptController {

    @Autowired
    IDeptService deptService;
    @ApiResponses({
            @ApiResponse(code=200, message = "查询成功"),
            @ApiResponse(code=404, message = "请求失败"),
            @ApiResponse(code=500, message = "参数错误")})
    @ApiOperation(value = "获取所有部门", notes = "获取所有部门列表", response = Dept.class, responseContainer = "List", produces="application/json", consumes="application/json")
    @ApiImplicitParams(
            @ApiImplicitParam(paramType = "query", dataType = "int", name = "pageNum", value = "页码", required = true, defaultValue = "1")
    )
    @GetMapping("/list")
    public  PageInfo<Dept> listDept(Integer pageNum,
                             Integer pageSize) {
        PageInfo<Dept> depts = deptService.findAll(pageNum,pageSize);
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