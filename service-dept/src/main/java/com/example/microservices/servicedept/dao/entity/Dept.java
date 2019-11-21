package com.example.microservices.servicedept.dao.entity;

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
@ApiModel(value = "部门实体类", description = "部门实体类")
public class Dept implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "部门ID")
    private String deptId;
    @ApiModelProperty(value = "部门名称", required = true)
    private String deptName;
    @ApiModelProperty(value = "部门编码", required = true)
    private String deptCode;


}
