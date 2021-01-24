package com.uma.lecture.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;

/**
 * self-use DB packing, copied from former project. Catigeart
 */
public class DBUtil {

    private static Properties info = new Properties();
    static {
        InputStream in = DBUtil.class.getClassLoader().getResourceAsStream("config.properties");
        try {
            info.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Class.forName(info.getProperty("driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Connection conn; // static单例模式，控制TCP连接数（并发场合改用连接池避免争用）
    private static void getConnection() {
        try {
            conn = DriverManager.getConnection(info.getProperty("url"), info);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int update(String sql, Object... args) {

        getConnection();
        PreparedStatement ps = null;

        int cnt = 0;

        try {
            ps = conn.prepareStatement(sql);
            for (int i=0; i<args.length; i++) {
                ps.setObject(i+1, args[i]);
            }
            cnt = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(conn, ps, null);
        }

        return cnt;
    }

    public static List<Map<String, Object>> query(String sql, Object... args) {

        getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Map<String, Object>> list = new ArrayList<>();

        try {
            ps = conn.prepareStatement(sql);
            for (int i=0; i<args.length; i++) {
                ps.setObject(i+1, args[i]);
            }
            rs = ps.executeQuery();
            int cnt = rs.getMetaData().getColumnCount();
            List<String> labelList = new ArrayList<>();
            for (int i=0; i<cnt; i++) {
                labelList.add(rs.getMetaData().getColumnLabel(i+1));
            }
            while(rs.next()) {
                Map<String, Object> map = new HashMap<>();
                for (int i=0; i<cnt; i++) {
                    String label = labelList.get(i);
                    map.put(label, rs.getObject(label));
                }
                list.add(map);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, ps, rs);
        }

        return list;
    }

    private static void close(Connection conn, PreparedStatement ps, ResultSet rs){
        try {
            if(conn != null) conn.close();
            if(ps != null) ps.close();
            if(rs != null) rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
