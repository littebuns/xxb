package com.example.demo.dao.impl;

import com.example.demo.dao.OpenstackDao;
import com.example.demo.entity.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
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

    @Override
    public void save() {
        String sql = "insert into dog(name, age) values (:name, :age)";
        List<Map<String,Object>> list = new ArrayList<>();
        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("sdf"));
        dogList.add(new Dog("sgd"));
        SqlParameterSource[] parameterSources = new SqlParameterSource[dogList.size()];
        for (int i = 0; i < dogList.size(); i++) {
            BeanPropertySqlParameterSource parameterSource = new BeanPropertySqlParameterSource(dogList.get(i));
            System.out.println(Arrays.toString(parameterSource.getParameterNames()));
            parameterSources[i] = parameterSource;
        }

        namedParameterJdbcTemplate.batchUpdate(sql, parameterSources);
    }
}
