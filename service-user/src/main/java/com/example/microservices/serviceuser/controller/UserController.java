package com.example.microservices.serviceuser.controller;


import com.example.microservices.serviceuser.dao.entity.User;
import com.example.microservices.serviceuser.service.IUserService;
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
@RequestMapping("/user")
@Api(tags = "用户服务")
public class UserController {

    @Autowired
    IUserService userService;

    @ApiResponses({
            @ApiResponse(code=200, message = "查询成功"),
            @ApiResponse(code=404, message = "请求失败"),
            @ApiResponse(code=500, message = "参数错误")})
    @ApiOperation(value = "获取所有用户", notes = "查询所有用户列表", response = User.class, responseContainer = "List", consumes="application/json")
    @GetMapping("/list")
    public  List<User> listAll() {
        List<User> users = userService.findAll();
        return users;
    }

    @ApiResponses({
            @ApiResponse(code=200, message = "查询成功"),
            @ApiResponse(code=404, message = "请求失败"),
            @ApiResponse(code=500, message = "参数错误")})
    @ApiOperation(value = "获取部门下的用户", notes = "查询部门下的用户列表", response = User.class, responseContainer = "List", consumes="application/json")
    @GetMapping("/find/{deptId}")
    public  List<User> findListByDeptId(@PathVariable Integer deptId) {
        List<User> users = userService.findListByDeptId(deptId);
        return users;
    }


    @ApiResponses({
            @ApiResponse(code=200, message = "查询成功"),
            @ApiResponse(code=404, message = "请求失败"),
            @ApiResponse(code=500, message = "参数错误")})
    @ApiOperation(value = "获取用户信息", notes = "根据用户ID获取用户信息", response = User.class, produces = "application/json", consumes="application/json")
    @GetMapping("/get/{userId}")
    public User getUser(@PathVariable Integer userId) {
        User user = userService.getUser(userId);
        return user;
    }
}