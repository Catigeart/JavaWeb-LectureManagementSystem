package com.uma.lecture.dao.impl;

import com.uma.lecture.dao.StudentDao;
import com.uma.lecture.domain.Student;
import com.uma.lecture.service.StudentService;
import com.uma.lecture.util.DBUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:59 2020/12/29
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public List<String> findIdByLectureId (String lectureId) {
        String sql = "select stu_id from stu_lec where lecture_id=?";
        List<Map<String, Object>> lm = DBUtil.query(sql, lectureId);
        List<String> ids = new ArrayList<>();
        for (Map<String, Object> m : lm) {
            ids.add((String)m.get("stu_id"));
        }
        return ids;
    }

}
