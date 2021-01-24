package com.uma.lecture.service;

import com.uma.lecture.domain.Lecture;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:44 2020/12/29
 */
public interface LectureService {

    boolean add(Lecture lecture);

    Lecture findByTopic(Lecture lecture);

}
