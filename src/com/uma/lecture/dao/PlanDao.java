package com.uma.lecture.dao;

import com.uma.lecture.domain.Plan;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:42 2020/12/29
 */
public interface PlanDao {

    boolean add (Plan plan);

    boolean updateDoneByPk(String id);

    List<Plan> findAll();

    Plan findByPk(String id);

}
