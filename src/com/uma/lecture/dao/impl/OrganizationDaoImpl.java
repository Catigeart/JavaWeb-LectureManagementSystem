package com.uma.lecture.dao.impl;

import com.uma.lecture.dao.OrganizationDao;
import com.uma.lecture.domain.Organization;
import com.uma.lecture.util.DBUtil;

import java.util.List;
import java.util.Map;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:58 2020/12/29
 */
public class OrganizationDaoImpl implements OrganizationDao {

    @Override
    public Organization findByPk(String id) {
        String sql = "select * from organization where id=?";
        List<Map<String, Object>> lm = DBUtil.query(sql, id);
        Organization organization = new Organization();
        for (Map<String, Object> m : lm) {
            organization.setId(m.get("id").toString());
            organization.setName((String)m.get("name"));
            organization.setType((String)m.get("type"));
            organization.setAddress((String)m.get("address"));
        }
        return organization;
    }
}
