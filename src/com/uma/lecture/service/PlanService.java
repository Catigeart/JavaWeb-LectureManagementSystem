package com.uma.lecture.service;

import com.uma.lecture.domain.Plan;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:47 2020/12/29
 */
public interface PlanService {

    boolean add (Plan plan);

    boolean updatePlanIsDone (String id);

    List<Plan> findAllPlan();

    Plan findByPk(String id);

}
