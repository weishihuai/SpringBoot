package com.wsh.springboot.repository;

import com.wsh.springboot.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/12/1.
 */
@Repository
public class JdbcTemplateRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveDemo(Demo demo) {
        String sql = "insert into test_demo(name) values(?)";
        jdbcTemplate.update(sql,new Object[]{demo.getName()});
    }

}
