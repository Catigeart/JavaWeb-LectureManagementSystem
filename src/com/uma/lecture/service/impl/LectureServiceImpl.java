package com.uma.lecture.service.impl;

import com.uma.lecture.dao.EntryRequirementDao;
import com.uma.lecture.dao.LectureDao;
import com.uma.lecture.dao.impl.EntryRequirementDaoImpl;
import com.uma.lecture.dao.impl.LectureDaoImpl;
import com.uma.lecture.domain.EntryRequirement;
import com.uma.lecture.domain.Lecture;
import com.uma.lecture.service.LectureService;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 0:04 2020/12/30
 */
public class LectureServiceImpl implements LectureService {

    private LectureDao lectureDao = new LectureDaoImpl();

    @Override
    public boolean add(Lecture lecture) {
        return lectureDao.add(lecture);
    }

    @Override
    public Lecture findByTopic (Lecture lecture) {
        return lectureDao.findByTopic(lecture);
    }
}
