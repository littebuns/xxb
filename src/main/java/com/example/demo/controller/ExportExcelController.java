package com.example.demo.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.example.demo.entity.Result;
import com.example.demo.entity.User;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @RequestMapping("/export")
    @ResponseBody
    public void export(HttpServletResponse response){
        List<User> list = new ArrayList<>();
        list.add(new User("zhangsan","1231",new Date()));
        list.add(new User("zhangsan1","1232",new Date()));
        list.add(new User("zhangsan2","1233",new Date()));
        list.add(new User("zhangsan3","1234",new Date()));
        list.add(new User("zhangsan4","1235",new Date()));
        list.add(new User("zhangsan5","1236", DateUtil.date(new Date())));
        // 通过工具类创建writer，默认创建xls格式
        ExcelWriter writer = ExcelUtil.getWriter();
        //自定义标题别名
        writer.addHeaderAlias("name", "姓名");
        writer.addHeaderAlias("age", "年龄");
        writer.addHeaderAlias("birthDay", "生日");
        // 合并单元格后的标题行，使用默认标题样式
        writer.merge(2, "申请人员信息");
        // 一次性写出内容，使用默认样式，强制输出标题
        writer.write(list, true);
        //out为OutputStream，需要写出到的目标流
        //response为HttpServletResponse对象
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        //test.xls是弹出下载对话框的文件名，不能为中文，中文请自行编码
//        String name = StringUtils.toUtf8String("申请学院");
        String name = "1";
        response.setHeader("Content-Disposition","attachment;filename="+name+".xls");
        ServletOutputStream out= null;
        try {
            out = response.getOutputStream();
            writer.flush(out, true);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            // 关闭writer，释放内存
            writer.close();
        }
        //此处记得关闭输出Servlet流
        IoUtil.close(out);
    }

}
