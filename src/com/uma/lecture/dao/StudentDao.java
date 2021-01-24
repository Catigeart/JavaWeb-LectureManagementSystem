package com.uma.lecture.dao;

import com.uma.lecture.domain.Student;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:43 2020/12/29
 */
public interface StudentDao {

    List<String> findIdByLectureId(String LectureId);

}
