package com.uma.lecture.service;

import com.uma.lecture.domain.Expert;

import java.util.List;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:25 2020/12/29
 */
public interface ExpertService {

    boolean addExpert(Expert expert, String organizationId);

    List<Expert> findAllExpert();

    Expert findByPk(String expertId);

    boolean isExistId(String id);

    boolean updateExpert(Expert expert, String organizationId);

}
