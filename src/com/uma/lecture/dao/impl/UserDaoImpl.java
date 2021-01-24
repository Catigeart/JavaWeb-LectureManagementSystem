package com.uma.lecture.dao.impl;

import com.uma.lecture.dao.UserDao;
import com.uma.lecture.domain.User;
import com.uma.lecture.util.DBUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Catigeart
 * GitHub: https://github.com/Catigeart
 * Date: 0:00 2020/12/30
 */
public class UserDaoImpl implements UserDao {

    @Override
    public boolean findByPk(User user) {
        String sql = "select * from user " +
                "where username=?";
        List<Map<String, Object>> mapList = DBUtil.query(sql, user.getUsername());
        for (Map<String, Object> map : mapList) {
            if (user.getPassword().equals(map.get("password"))) {
                // user.setUsername(...);
                // user.setPassword(...);
                user.setType((String)map.get("type"));
                user.setSex((String)map.get("sex"));
                user.setNickname((String)map.get("nickname"));
                user.setName((String)map.get("name"));
                user.setPhone((String)map.get("phone"));
                user.setEmail((String)map.get("email"));
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean insert(User user) {
        /*
            private String username;
    private String password;
    private String type;
    private String sex;
    private String nickname;
    private String name;
    private String phone;
    private String email;
         */
        String sql = "insert into user values(?,?,?,?,?,?,?,?)";
        int cnt = DBUtil.update(sql,
                user.getUsername(),
                user.getPassword(),
                user.getType(),
                user.getSex(),
                user.getNickname(),
                user.getName(),
                user.getPhone(),
                user.getEmail());
        return cnt > 0;
    }

    @Override
    public List<String> findAllStudentId() {
        String sql = "select username from user where type='开发人员'";
        List<Map<String, Object>> lm = DBUtil.query(sql);
        List<String> studentIdList = new ArrayList<>();
        for (Map<String, Object> m : lm) {
            studentIdList.add((String)m.get("username"));
        }
        return studentIdList;
    }
}
