package com.jyl.service.imp;

import com.jyl.dao.GuestDao;
import com.jyl.domain.Guest;
import com.jyl.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestService {

    @Autowired
    private GuestDao guestDao;
    @Override
    public List<Guest> list() {
        return guestDao.list();
    }

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

    @Override
    public void update(Guest guest) {
        guestDao.update(guest);
    }

    @Override
    public Guest get(String name) {
        return guestDao.get(name);
    }

    @Override
    public void delete(String name) {
        guestDao.delete(name);
    }
}
