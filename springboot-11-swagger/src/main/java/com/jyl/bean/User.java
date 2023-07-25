package com.jyl.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@ApiModel("用户")
public class User {

    @ApiModelProperty("用户名称")
    private String name;
    @ApiModelProperty("用户兴趣爱好")
    private String hobby;

}
