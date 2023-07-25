package com.jyl.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jyl.model.User;

import java.util.List;

public interface UserService {

    public List<User> list();
}