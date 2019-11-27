package com.example.microservices.serviceuser.feign.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 部门对象
 * @ClassName Dept
 * @Description:
 * @Author chengqianpeng
 * @Date 2019/11/21 
 **/
@Data
public class Dept implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer deptId;
    private String deptName;
    private String deptCode;
}
