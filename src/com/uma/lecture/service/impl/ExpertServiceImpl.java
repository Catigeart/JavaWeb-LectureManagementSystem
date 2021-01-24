package com.uma.lecture.service.impl;

import com.uma.lecture.dao.ExpertDao;
import com.uma.lecture.dao.impl.ExpertDaoImpl;
import com.uma.lecture.domain.Expert;
import com.uma.lecture.service.ExpertService;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 0:04 2020/12/30
 */
public class ExpertServiceImpl implements ExpertService {

    private ExpertDao expertDao = new ExpertDaoImpl();

    @Override
    public boolean addExpert(Expert expert, String organizationId) {
        return expertDao.add(expert, organizationId);
    }

    @Override
    public List<Expert> findAllExpert() {
        return expertDao.findAll();
    }

    @Override
    public Expert findByPk(String expertId) {
        return expertDao.findByPk(expertId);
    }

    @Override
    public boolean isExistId(String id) {
        return expertDao.findByPk(id) != null;
    }

    @Override
    public boolean updateExpert(Expert expert, String organizationId) {
        return expertDao.updateById(expert, organizationId);
    }

}
