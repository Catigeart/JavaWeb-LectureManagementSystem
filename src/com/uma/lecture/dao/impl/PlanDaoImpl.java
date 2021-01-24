package com.uma.lecture.dao.impl;

import com.uma.lecture.dao.PlanDao;
import com.uma.lecture.domain.Plan;
import com.uma.lecture.util.DBUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 23:58 2020/12/29
 */
public class PlanDaoImpl implements PlanDao {

    @Override
    public boolean add (Plan plan) {
        String sql = "insert into plan " +
                "(topic,location,time,description,expert,expert_description,done)" +
                " values(?,?,?,?,?,?,?)";
        int cnt = DBUtil.update(sql,
                plan.getTopic(),
                plan.getLocation(),
                plan.getTime(),
                plan.getDescription(),
                plan.getExpert(),
                plan.getExpertDescription(),
                plan.isDone());
        return cnt > 0;
    }

    @Override
    public boolean updateDoneByPk (String id) {
        String sql = "update plan set done=1 where id=?";
        int cnt = DBUtil.update(sql, id);
        return cnt > 0;
    }

    @Override
    public List<Plan> findAll() {
        String sql = "select * from plan";
        List<Map<String, Object>> lm = DBUtil.query(sql);
        List<Plan> lp = new ArrayList<>();
        for (Map<String, Object> m : lm) {
            Plan plan = new Plan();
            plan.setId(m.get("id").toString());
            plan.setTopic((String)m.get("topic"));
            plan.setLocation((String)m.get("location"));
            plan.setTime((String)m.get("time"));
            plan.setDescription((String)m.get("description"));
            plan.setExpert((String)m.get("expert"));
            plan.setExpertDescription((String)m.get("expert_description"));
            plan.setDone(m.get("done").equals("1"));
            lp.add(plan);
        }
        return lp;
    }

    @Override
    public Plan findByPk(String id) {
        Plan plan = new Plan();
        plan.setId(id);
        // TODO
        return plan;
    }

}
