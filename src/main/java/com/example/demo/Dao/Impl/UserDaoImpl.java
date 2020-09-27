package com.example.demo.Dao.Impl;

import com.example.demo.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<Map<String, Object>> listAll() {
        String sql = "select * from user";
        Map<String, Object> paramMap = new HashMap<>();
        return this.namedParameterJdbcTemplate.queryForList(sql, paramMap);
    }
}
