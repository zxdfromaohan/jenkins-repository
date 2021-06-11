package com.daily.daily.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.daily.daily.yd.entity.BankEntity;

public class ReadFileUtil {

    //读取json文件
    public static String readJsonFile(String fileName) {
    	String path = ReadFileUtil.class.getClassLoader().getResource(fileName).getPath();
        String jsonStr = "";
        try {
            File jsonFile = new File(path);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {
       List<BankEntity> parseArray = JSON.parseArray(ReadFileUtil.readJsonFile("backList.json"),BankEntity.class);
       System.out.println(parseArray);
    }

}
