package com.example.demo.Dao.Impl;

import com.example.demo.Dao.OpenstackDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OpenstackDaoImpl implements OpenstackDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public int count() {
        String sql = "select count(1) from openstack";
        Object object = this.namedParameterJdbcTemplate.queryForObject(sql, (Map<String, ?>) null, Integer.class);
        return (int) object;
    }

    @Override
    public List<Map<String, Object>> list(int index, int rows) {
        String sql = "select * from openstack limit :begin,:end";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("begin", index);
        paramMap.put("end", rows);
        return this.namedParameterJdbcTemplate.queryForList(sql, paramMap);
    }
}
