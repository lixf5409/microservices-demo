package com.example.microservices.servicedept.controller;


import com.example.microservices.servicedept.dao.entity.Dept;
import com.example.microservices.servicedept.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    IDeptService deptService;

    @GetMapping("/listDept")
    public  List<Dept> listDept() {
        List<Dept> depts = deptService.findAll();
        return depts;
    }
    @GetMapping("/getDept")
    public Dept getDept(Integer deptId) {
        Dept dept = deptService.getDept(deptId);
        return dept;
    }
}