package com.uma.lecture.dao;

import com.uma.lecture.domain.Organization;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:41 2020/12/29
 */
public interface OrganizationDao {

    Organization findByPk(String id);

}
