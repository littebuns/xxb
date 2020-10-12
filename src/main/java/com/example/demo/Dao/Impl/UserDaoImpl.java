package com.example.demo.Dao.Impl;

import com.example.demo.Dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> listAll() {
        String sql = "select * from user where ";
        Map<String, Object> paramMap = new HashMap<>();
        List<User> list = this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        return list;
    }

}
