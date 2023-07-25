package com.jyl.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data @AllArgsConstructor
public class User {

    @NotBlank(message = "{user.name.notblank}")
    private String name;
    @NotBlank
    private String hobby;
}
