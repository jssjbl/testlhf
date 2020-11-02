package com.example.testlhf.request;

import com.example.testlhf.common.Head;
import com.example.testlhf.entity.Student;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2020/11/2 10:57
 * @Version 1.0
 **/
@Data
@ApiModel("添加学生请求体")
public class AddStudentRequset {
    @ApiModelProperty("通用head")
    private Head head;
    @ApiModelProperty("学生实体类")
    private Student student;
}
