package com.example.demo.Dao;

import java.util.List;
import java.util.Map;

public interface OpenstackDao {

    int count();

    /**
     * 查询
     * @param index 从第几条开始查
     * @param rows 要查几条
     * @return
     */
    List<Map<String, Object>> list(int index, int rows);

    void save();
}
