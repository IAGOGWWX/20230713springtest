package com.jyl.mapper;

import com.jyl.model.User;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

}
