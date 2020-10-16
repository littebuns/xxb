package com.example.demo.Controller;

import com.example.demo.entity.Result;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@RestController
public class ExportExcelController {

    @GetMapping(value = "/exportExcel")
    public Result exportExcel(HttpServletResponse response) throws IOException {
        //创建一个excel的文档对象
        HSSFWorkbook wb = new HSSFWorkbook();
        //创建excel的一个表单
        HSSFSheet sheet = wb.createSheet("表单1");

        //创建第一行
        HSSFRow row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("工号");
        row1.createCell(1).setCellValue("姓名");

        //创建第二行
        HSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("01");
        row2.createCell(1).setCellValue("袁中林");

        //输出Excel文件
        ServletOutputStream outputStream = response.getOutputStream();

        //设置下载
        String cnFileName = URLEncoder.encode("平台报表.xls", "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename = 袁中林.xls " + cnFileName );
        wb.write(outputStream);
        outputStream.close();
        return new Result(true, "导出成功");
    }

}
