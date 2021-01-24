package com.uma.lecture.service.impl;

import com.uma.lecture.dao.StudentDao;
import com.uma.lecture.dao.impl.StudentDaoImpl;
import com.uma.lecture.domain.Student;
import com.uma.lecture.service.StudentService;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 0:06 2020/12/30
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = new StudentDaoImpl();

    @Override
    public boolean addStudent(Student student) {
        // TODO
        return true;
    }

    @Override
    public List<String> findStudentIdOfLecture(String lectureId) {
        return studentDao.findIdByLectureId(lectureId);
    }
}
