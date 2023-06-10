package com.atguigu.spring6.jdbc;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * @Description
 * @Author hliu
 * @Date 2023/6/1 22:02
 * @Version 1.0
 */

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testSelectObject() {
//        Emp query = jdbcTemplate.queryForObject("select * from t_emp where id = ?", (rs, rowNum) -> {
//            Emp emp = new Emp();
//            emp.setId(rs.getInt("id"));
//            emp.setName(rs.getString("name"));
//            emp.setAge(rs.getInt("age"));
//            emp.setSex(rs.getString("sex"));
//            return emp;
//        }, 1);
//
//        System.out.println(query);

        String sql = "select * from t_emp where id = ?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(emp);
    }

    @Test
    public void testSelectList() {
        String sql = "select * from t_emp";
        List<Emp> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(query);
    }

    @Test
    public void testSelectValue() {
        String sql = "select count(*) from t_emp";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);

        System.out.println(integer);
    }

    @Test
    public void testUpdate() {
//        String sql = "insert into t_emp values(null, ?, ?, ?)";
//
//        int update = jdbcTemplate.update(sql, "东方不败", 20, "未知");
//        int update = jdbcTemplate.update(sql, "岳不群", 40, "未知");
//        int update = jdbcTemplate.update(sql, "林平之", 20, "未知");
//
//        System.out.println(update);

//        String sql = "update t_emp set name = ? where id = ?";
//        int update = jdbcTemplate.update(sql, "林平之atguigu", 3);
//        System.out.println(update);


        String sql = "delete from t_emp where id = ?";
        int update = jdbcTemplate.update(sql, 3);
        System.out.println(update);
    }
}
