package com.uma.lecture.service;

import com.uma.lecture.domain.User;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 15:58 2020/11/23
 */
public interface UserService {

    boolean login(User user);

    boolean register(User user);

    String findType(User user);

    List<String> findAllStudentId ();

}
