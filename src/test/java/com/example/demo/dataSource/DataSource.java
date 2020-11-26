package com.example.demo.dataSource;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author HP
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSource {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    static String info = "{\n" +
            "    \"slave\":\"\",\n" +
            "    \"password\":\"123456\",\n" +
            "    \"isMaster\":true,\n" +
            "    \"master1\":\"localhost:3306\",\n" +
            "    \"slave1\":\"\",\n" +
            "    \"user\":\"root\",\n" +
            "    \"master\":\"jdbc:mysql://localhost:3306/nova?characterEncoding=utf8&serverTimezone=UTC\"\n" +
            "}";

    @Test
    public void test() throws SQLException {
        Map map = JSON.parseObject(info, Map.class);
        String address = (String) map.get("master");
        String user = (String) map.get("user");
        String password = (String) map.get("password");

        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriver(new com.mysql.jdbc.Driver());
        dataSource.setPassword(password);
        dataSource.setUsername(user);
        dataSource.setUrl(address);

        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

        String sql = "select * from keystone.project limit 0,10";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, new HashMap<>());
        for (Map<String, Object> objectMap : list) {
            System.out.println(objectMap);
        }
    }
}
