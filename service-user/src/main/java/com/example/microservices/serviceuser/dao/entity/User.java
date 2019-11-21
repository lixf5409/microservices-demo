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
    @ApiModelProperty(value = "部门ID", required = true, example = "1")
    private Integer deptId;


}
