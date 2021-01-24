package com.uma.lecture.dao;

import com.uma.lecture.domain.Lecture;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:41 2020/12/29
 */
public interface LectureDao {

    boolean add (Lecture lecture);

    Lecture findByTopic (Lecture lecture);

}
