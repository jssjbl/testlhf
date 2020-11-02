package com.example.testlhf.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2020/11/2 10:54
 * @Version 1.0
 **/
@Data
@ApiModel(value = "通用head")
public class Head {
    @ApiModelProperty("登录用户名")
    private String logInUserName;
    @ApiModelProperty("登录用户地址")
    private String longInAdress;
}
