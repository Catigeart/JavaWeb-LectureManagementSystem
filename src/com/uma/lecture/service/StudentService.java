package com.uma.lecture.service;

import com.uma.lecture.domain.Student;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:23 2020/12/29
 */
public interface StudentService {

    boolean addStudent(Student student);

    List<String> findStudentIdOfLecture(String LectureId);

}
