package com.uma.lecture.dao.impl;

import com.uma.lecture.dao.LectureDao;
import com.uma.lecture.domain.Lecture;
import com.uma.lecture.util.DBUtil;

import java.util.List;
import java.util.Map;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:57 2020/12/29
 */
public class LectureDaoImpl implements LectureDao {

    @Override
    public boolean add (Lecture lecture) {
        String sql = "insert into lecture " +
                "(plan_id,name,expert_id,topic,location,host,introduction,stu_cnt,stu_limit,begin_time,end_time," +
                "latest_time,work_year,job) " +
                "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        int cnt = DBUtil.update(sql,
                lecture.getPlanId(),
                lecture.getName(),
                lecture.getExpert().getId(),
                lecture.getTopic(),
                lecture.getLocation(),
                lecture.getHost(),
                lecture.getIntroduction(),
                lecture.getStudentNumber(),
                lecture.getMaxStudentNumber(),
                lecture.getBeginTime(),
                lecture.getEndTime(),
                lecture.getEntryRequirement().getLatestDate(),
                lecture.getEntryRequirement().getWorkingYear(),
                lecture.getEntryRequirement().getJob());
        return cnt > 0;
    }

    @Override
    public Lecture findByTopic (Lecture lecture) {
        String topic = lecture.getTopic();
        String sql = "select * from lecture " +
                "where topic=?";
        List<Map<String, Object>> lm = DBUtil.query(sql, topic);
        for (Map<String, Object> m : lm) {
            lecture.setId(m.get("id").toString());
        }
        return lecture;
    }
}
