package com.example.demo.controller;

import com.example.demo.entity.Result;
import com.example.demo.service.ExportExcelService;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@RestController
public class ExportExcelController {

    @Autowired
    private ExportExcelService exportExcelService;

    /**
     * 简单的导出一个excel
     * @param response
     * @return
     * @throws IOException
     */
    @GetMapping(value = "/exportExcel")
    public Result exportExcel(HttpServletResponse response) throws IOException {
        //创建一个excel的文档对象
        XSSFWorkbook wb = new XSSFWorkbook();

        XSSFCellStyle style = wb.createCellStyle();
        //水平居中
        style.setAlignment(HorizontalAlignment.CENTER);
        //垂直居中
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        //创建excel的一个表单
        XSSFSheet sheet = wb.createSheet("表单1");
        wb.createSheet("表单2");

        XSSFCell cell1 = sheet.createRow(0).createCell(0);
        cell1.setCellStyle(style);
        cell1.setCellValue("sadfk;jdslaf");
        CellRangeAddress cellAddresses = new CellRangeAddress(0, 0, 0, 2);
        sheet.addMergedRegion(cellAddresses);

        //创建第一行
        XSSFRow row1 = sheet.createRow(1);
        XSSFCell cell = row1.createCell(0);
        cell.setCellStyle(style);
        cell.setCellValue("工号");
        row1.createCell(1).setCellValue("姓名");

        //创建第二行
        XSSFRow row2 = sheet.createRow(2);
        row2.createCell(0).setCellValue("01");
        row2.createCell(1).setCellValue("袁中林");


        //输出Excel文件
        ServletOutputStream outputStream = response.getOutputStream();

        //设置下载
        String cnFileName = URLEncoder.encode("平台报表" + ".xlsx", "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + cnFileName );
        wb.write(outputStream);
        outputStream.close();
        return new Result(true, "导出成功");
    }


    /**
     * 使用多线程导出excel
     * @return
     */
    @GetMapping(value = "/threadExportExcel")
    public Result threadExportExcel(HttpServletResponse response){
        return this.exportExcelService.threadExport(response);
    }

}
