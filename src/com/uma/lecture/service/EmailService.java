package com.uma.lecture.service;

import com.uma.lecture.domain.Release;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:44 2020/12/29
 */
public interface EmailService {

    boolean sendEmail(List<String> studentIds);

}
