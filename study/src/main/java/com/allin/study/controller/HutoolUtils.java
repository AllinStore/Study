package com.allin.study.controller;

import cn.hutool.core.convert.Convert;

public class HutoolUtils {
    public static void main(String[] args) {
        int a = 1;
        String aStr = Convert.toStr(a);
        System.out.println("aStr = " + aStr);

        int b= Convert.toInt(aStr);
        System.out.println("b = " + b);

    }
}
