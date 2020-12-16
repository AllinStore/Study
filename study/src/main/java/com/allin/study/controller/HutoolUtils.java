package com.allin.study.controller;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.IdcardUtil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class HutoolUtils {
    public static void main(String[] args) {
        int a = 1;
        String aStr = Convert.toStr(a);
        System.out.println("aStr = " + aStr);

        int b= Convert.toInt(aStr);
        System.out.println("b = " + b);

        //文件复制
        BufferedInputStream in = FileUtil.getInputStream("d:/Temp/test.txt");

        BufferedOutputStream out = FileUtil.getOutputStream("d:/Temp/test2.txt");

        long copySise = IoUtil.copy(in,out,IoUtil.DEFAULT_BUFFER_SIZE);

        Snowflake snowflake = IdUtil.getSnowflake(1, 1);
        long id = snowflake.nextId();
        System.out.println("id = " + id);


        //身份证工具类
        String ID_18 = "342523199706143111";

        boolean valid = IdcardUtil.isValidCard(ID_18);
        System.out.println("valid = " + valid);

        String birth = IdcardUtil.getBirth(ID_18);
        System.out.println("birth = " + birth);

        String PY = IdcardUtil.getProvinceByIdCard(ID_18);
        System.out.println("PY = " + PY);

    }


}
