package com.example.demo.base.java.regex;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {

    /**
     * 匹配多个子字符串
     */
    @Test
    public void t1() {
        String[] strings = {"xu sghdk", "xin 343", "bo;/,g.;'l,"};
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(strings));
        String regex = "(xu|xin|bo)";
        Pattern pattern = Pattern.compile(regex);
        for (String content : list) {
            Matcher matcher = pattern.matcher(content);
            if (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        }


    }

    @Test
    public void t2() {
        String str = "涉及项目 地点 截止日期/时间(当地) 具体要求 \n" +
                "Shipping instruction closing TIANJIN XINGANG 11-Nov-2021 Provide your final BL/SWB instructions\n" +
                "(CNTXG) 10:00\n" +
                "VGM cut-off TIANJIN XINGANG 11-Nov-2021 Provide verified container gross weight \n" +
                "(CNTXG) 01:00 (VGM)\n" +
                "Earliest container delivery date TIANJIN XINGANG 10-Nov-2021 First possible delivery of containers at \n" +
                "(CNTXG) 07:00 the export terminal\n" +
                "FCL delivery cut-off TIANJIN XINGANG 11-Nov-2021 Last possible delivery of regular \n" +
                "(CNTXG) 07:00 containers at the export terminal\n" +
                "Estimated time of arrival TIANJIN XINGANG 12-Nov-2021 For information\n" +
                "(CNTXG) 07:00";
//        String regex = "Shipping instruction closing\\s+(\\w+)\\s";
        String regex = "Shipping instruction closing.*?(\\d+-\\w+-\\d+).*?(\\d+:\\d+)";
        Pattern compile = Pattern.compile(regex, Pattern.DOTALL);
        Matcher matcher = compile.matcher(str);
        if (matcher.find()) {
            System.out.println("解析结果为:" + matcher.group(0) + "  "+ matcher.group(2));
        }
    }

    /**
     * 匹配换行
     */
    @Test
    public void t3(){
        String str =
                "Qingdao Qianwan Busan International MVS MSC GULSUN 144W 2021-11-06 2021-11-13 test\n";
//        String regex = "No. ETD ETA\\n.*?\\w+\\s+\\w+\\s+(\\w+)\\s+\\w+\\s+\\w+\\n";
        String regex = "Qingdao(.*?)\\n";
        Pattern compile = Pattern.compile(regex, Pattern.DOTALL);
        Matcher matcher = compile.matcher(str);
        if (matcher.find()) {
            System.out.println("解析结果为:" + matcher.group(1) );
        }
    }


    }
