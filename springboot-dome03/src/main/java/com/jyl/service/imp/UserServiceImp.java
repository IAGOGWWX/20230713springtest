package com.jyl.service.imp;

import com.jyl.dao.UserDao;
import com.jyl.domain.User;
import com.jyl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> list() {
        return userDao.list();
    }

    @Override
    public void add(User guest) {
        userDao.add(guest);
    }

    @Override
    public void update(User guest) {
        userDao.update(guest);
    }

    @Override
    public User get(String name) {
        return userDao.get(name);
    }

    @Override
    public void delete(String name) {

        userDao.delete(name);
    }
}
