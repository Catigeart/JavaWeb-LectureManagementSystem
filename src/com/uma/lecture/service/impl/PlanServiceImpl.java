package com.uma.lecture.service.impl;

import com.uma.lecture.dao.PlanDao;
import com.uma.lecture.dao.impl.PlanDaoImpl;
import com.uma.lecture.domain.Plan;
import com.uma.lecture.service.PlanService;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 0:05 2020/12/30
 */
public class PlanServiceImpl implements PlanService {

    private PlanDao planDao = new PlanDaoImpl();

    @Override
    public boolean add (Plan plan) {
        return planDao.add(plan);
    }

    @Override
    public boolean updatePlanIsDone (String id) {
        return planDao.updateDoneByPk(id);
    }

    @Override
    public List<Plan> findAllPlan() {
        return planDao.findAll();
    }

    @Override
    public Plan findByPk(String id) {
        return planDao.findByPk(id);
    }

}
