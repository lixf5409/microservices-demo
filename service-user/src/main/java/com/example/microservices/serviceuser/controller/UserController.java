package com.example.microservices.serviceuser.controller;


import com.example.microservices.serviceuser.dao.entity.User;
import com.example.microservices.serviceuser.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public  List<User> findListByDeptId(@PathVariable(name = "deptId") Integer deptId) {
        List<User> users = userService.findListByDeptId(deptId);
        return users;
    }


    @ApiResponses({
            @ApiResponse(code=200, message = "查询成功"),
            @ApiResponse(code=404, message = "请求失败"),
            @ApiResponse(code=500, message = "参数错误")})
    @ApiOperation(value = "获取用户信息", notes = "根据用户ID获取用户信息", response = User.class, produces = "application/json", consumes="application/json")
    @GetMapping("/get/{userId}")
    public User getUser(@PathVariable(name = "userId") Integer userId) {
        User user = userService.getUser(userId);
        return user;
    }

    @ApiResponses({
            @ApiResponse(code=200, message = "添加成功"),
            @ApiResponse(code=404, message = "参数错误"),
            @ApiResponse(code=500, message = "参数错误")})
    @ApiOperation(value = "添加用户", notes = "向指定部门添加用户信息", produces = "application/json")
    @PostMapping("/add")
    public User addUser(@RequestParam(name = "userName") String userName,
                        @RequestParam(name = "userCode") String userCode,
                        @RequestParam(name = "sex", required = false) String sex,
                        @RequestParam(name = "phone", required = false) String phone,
                        @RequestParam(name = "birthday", required = false) String birthday,
                        @RequestParam(name = "remarks", required = false) String remarks,
                        @RequestParam(name = "deptId") Integer deptId){
        User user = userService.insertUser(userName, userCode, sex, phone, birthday, remarks, deptId);
        return user;
    }

    @ApiResponses({
            @ApiResponse(code=200, message = "更新成功"),
            @ApiResponse(code=404, message = "参数错误"),
            @ApiResponse(code=500, message = "参数错误")})
    @ApiOperation(value = "更新用户", notes = "根据用户ID更新用户信息", produces = "application/json")
    @PutMapping("/update")
    public void updateUser(@RequestParam(name = "userId") Integer userId,
                           @RequestParam(name = "userName", required = false) String userName,
                            @RequestParam(name = "userCode", required = false) String userCode,
                            @RequestParam(name = "sex", required = false) String sex,
                            @RequestParam(name = "phone", required = false) String phone,
                            @RequestParam(name = "birthday", required = false) String birthday,
                            @RequestParam(name = "remarks", required = false) String remarks,
                            @RequestParam(name = "deptId", required = false) Integer deptId){
        userService.updateUser(userId,userName, userCode, sex, phone, birthday, remarks, deptId);
    }

    @ApiResponses({
            @ApiResponse(code=200, message = "删除成功"),
            @ApiResponse(code=404, message = "参数不能为空"),
            @ApiResponse(code=500, message = "参数错误")})
    @ApiOperation(value = "删除用户", notes = "根据用户ID删除用户信息")
    @DeleteMapping("/delete/{userId}")
    public void deleteUser(@PathVariable(name = "userId") Integer userId){
        userService.deleteUser(userId);
    }
}