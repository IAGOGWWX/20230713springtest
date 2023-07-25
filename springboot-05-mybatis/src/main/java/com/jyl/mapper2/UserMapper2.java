package com.jyl.mapper2;

import com.jyl.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper2 {

    @Select("select * from user")
    List<User> getUsers();

}
