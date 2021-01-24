package com.uma.lecture.dao;

import com.uma.lecture.domain.Expert;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:41 2020/12/29
 */
public interface ExpertDao {

    List<Expert> findAll();

    Expert findByPk(String expertId);

    boolean add (Expert expert, String organizationId);

    boolean updateById(Expert expert, String organizationId);

}
