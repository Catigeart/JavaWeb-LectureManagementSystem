package com.uma.lecture.service.impl;


import com.uma.lecture.dao.ReleaseDao;
import com.uma.lecture.dao.impl.ReleaseDaoImpl;
import com.uma.lecture.domain.Release;
import com.uma.lecture.service.ReleaseService;
import com.uma.lecture.util.DBUtil;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 0:05 2020/12/30
 */
public class ReleaseServiceImpl implements ReleaseService {

    private ReleaseDao releaseDao = new ReleaseDaoImpl();

    @Override
    public boolean save (Release release) {
        return releaseDao.save(release);
    }
}
