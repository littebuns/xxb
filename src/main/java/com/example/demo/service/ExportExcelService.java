package com.example.demo.service;

import com.example.demo.entity.Result;

import javax.servlet.http.HttpServletResponse;

public interface ExportExcelService {

    Result threadExport(HttpServletResponse response);

}
