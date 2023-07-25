package com.jyl.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.jyl.mapper2.UserMapper2;
import com.jyl.mybatis.mapper.UserPlusMapper;
import com.jyl.mapper.UserMapper;
import com.jyl.model.User;
import com.jyl.tk.mapper.UserTkMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

//    @Autowired
//    private  UserMapper mapper;
    @Autowired
    private UserMapper mapper;

    public List<User> list(){

        return mapper.getUsers();
    }
}
