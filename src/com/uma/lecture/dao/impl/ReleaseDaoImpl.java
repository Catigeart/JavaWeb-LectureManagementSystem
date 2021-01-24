package com.uma.lecture.dao.impl;

import com.uma.lecture.dao.ReleaseDao;
import com.uma.lecture.domain.Release;
import com.uma.lecture.util.DBUtil;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:58 2020/12/29
 */
public class ReleaseDaoImpl implements ReleaseDao {

    @Override
    public boolean save (Release release) {
        String sql = "insert into rlease " +
                "(worker_username,lecture_id,time,sent_website,sent_email) " +
                "values (?,?,?,?,?)";
        int cnt = DBUtil.update(sql,
                release.getWorkerName(),
                release.getLectureId(),
                release.getTime(),
                release.isSentWebsite(),
                release.isSentEmail());
        return cnt > 0;
    }

}
