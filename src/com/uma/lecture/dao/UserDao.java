package com.uma.lecture.dao;

import com.uma.lecture.domain.User;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:43 2020/12/29
 */
public interface UserDao {

    boolean findByPk(User user);

    boolean insert(User user);

    List<String> findAllStudentId();

}
