package com.uma.lecture.dao.impl;

import com.uma.lecture.dao.ExpertDao;
import com.uma.lecture.dao.OrganizationDao;
import com.uma.lecture.domain.Expert;
import com.uma.lecture.domain.Organization;
import com.uma.lecture.util.DBUtil;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:49 2020/12/29
 */
public class ExpertDaoImpl implements ExpertDao {

    private OrganizationDao organizationDao = new OrganizationDaoImpl();
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    private static Expert initExpert (Map<String, Object> m) {

        OrganizationDao organizationDao = new OrganizationDaoImpl();
        Expert expert = new Expert();

        expert.setId(m.get("id").toString());
        String organizationId = m.get("organization_id").toString();
        Organization organization = organizationDao.findByPk(organizationId);
        expert.setOrganization(organization);
        expert.setName((String)m.get("name"));
        expert.setSex((String)m.get("sex"));
        expert.setJob((String)m.get("job"));
        expert.setAddress((String)m.get("address"));
        expert.setArea((String)m.get("area"));
        expert.setPhone((String)m.get("phone"));
        expert.setEmail((String)m.get("email"));

        return expert;
    }

    @Override
    public List<Expert> findAll() {
        String sql = "select * from expert";
        List<Map<String, Object>> lm = DBUtil.query(sql);
        List<Expert> le = new ArrayList<>();
        for (Map<String, Object> m : lm) {
            le.add(initExpert(m));
        }
        return le;
    }


    @Override
    public Expert findByPk(String expertId) {
        String sql = "select * from expert " +
                "where id=?";
        List<Map<String, Object>> lm = DBUtil.query(sql, expertId);
        Expert expert = null;
        for (Map<String, Object> m : lm) {
            expert = initExpert(m);
        }
        return expert;
    }

    @Override
    public boolean add(Expert expert, String organizationId) {
        // String id = expert.getId();
        String name = expert.getName();
        String sex = expert.getSex();
        String phone = expert.getPhone();
        String email = expert.getEmail();
        String job = expert.getJob();
        String address = expert.getAddress();
        String area = expert.getArea();

        String sql = "insert into expert " +
                "(organization_id,name,sex,job,phone,email,address,area) " +
                "values(?,?,?,?,?,?,?,?)";
        return DBUtil.update(sql,organizationId,name,sex,job,phone,email,address,area)>0;

    }

    @Override
    public boolean updateById (Expert expert, String organizationId) {
        String id = expert.getId();
        String name = expert.getName();
        String sex = expert.getSex();
        String phone = expert.getPhone();
        String email = expert.getEmail();
        Organization organization = organizationDao.findByPk(organizationId);
        String job = expert.getJob();
        String address = expert.getAddress();
        String area = expert.getArea();

        String sql = "update expert set " +
                "organization_id=?,name=?,sex=?,job=?,phone=?,email=?,address=?,area=? " +
                "where id=?";
        return DBUtil.update(sql,organizationId,name,sex,job,phone,email,address,area,id)>0;
    }

}
