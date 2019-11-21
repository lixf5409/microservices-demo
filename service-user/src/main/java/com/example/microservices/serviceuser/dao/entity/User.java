package com.example.microservices.serviceuser.dao.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author lixiaofeng
 * @date 2019/11/12
 */
@Data
@ApiModel(value = "用户实体类", description = "用户实体类")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID", example = "1")
    private Integer userId;
    @ApiModelProperty(value = "用户名", required = true, example = "测试用户")
    private String userName;
    @ApiModelProperty(value = "用户编码", required = true, example = "code1")
    private String userCode;
    @ApiModelProperty(value = "用户编码", required = true, example = "code1")
    private String sex;
    @ApiModelProperty(value = "性别", required = true, example = "0")
    private String phone;
    @ApiModelProperty(value = "手机号", required = true, example = "13333333333")
    private String birthday;
    @ApiModelProperty(value = "生日", required = true, example = "1999-11-11")
    private String remarks;
    @ApiModelProperty(value = "备注", required = true, example = "备注")
    private Integer deptId;
    @ApiModelProperty(value = "部门名称", required = true, example = "测试部门")
    private String deptName;
    @ApiModelProperty(value = "部门编码", required = true, example = "dept1")
    private String deptCode;

}
