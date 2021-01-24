package com.uma.lecture.service.impl;

import com.uma.lecture.dao.UserDao;
import com.uma.lecture.dao.impl.UserDaoImpl;
import com.uma.lecture.domain.User;
import com.uma.lecture.service.UserService;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 16:07 2020/11/23
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public boolean login(User user) {
        return userDao.findByPk(user);
    }

    @Override
    public boolean register(User user) {
        return userDao.insert(user);
    }

    @Override
    public String findType(User user) {
        //TODO
        return null;
    }

    @Override
    public List<String> findAllStudentId () {
        return userDao.findAllStudentId();
    }

}
