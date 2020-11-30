package com.allin.study.controller;



import javafx.scene.input.DataFormat;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateStudy {
    public static void main(String[] args) throws ParseException {
        /*Date date = new Date();
        System.out.println("date = " + date);

        long time = date.getTime();
        System.out.println("time = " + time);
*/


        /*long time2 = System.currentTimeMillis();
        System.out.println("time2 = " + time2);

        String a = time>time2? "time大":"time2大";
        System.out.println("a = " + a);*/

       /* Date date = new Date();

        DateFormat format = new  SimpleDateFormat("yyyy ");
        String a = format.format(date);
        System.out.println("a = " + a);*/
/*

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date toDay = new Date();
        //System.out.println("toDay = " + toDay);
        String birthday = "2017-05-30";
        Date date = format.parse(birthday);
        //System.out.println("date = " + date);

        long todayDate =toDay.getTime();
        long birthdayDate = date.getTime();

        long temp = todayDate - birthdayDate;

        if (temp<0){
            System.out.println("error");
        }else {
            System.out.println("我们在一起"+temp/1000/60/60/24+"天啦！");
        }
*/
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date birthday = format.parse("1996-11-20");

        Date today = new Date();

        long birthdaySecond = birthday.getTime();
        long todaySecond = today.getTime();

        long temp = todaySecond - birthdaySecond;

        if (temp < 0){
            System.out.println("还没出生呢！");
        }else {
            //System.out.println("已经出生了"+temp/1000/60/60/24+"天");
        }

        Calendar calendar = Calendar.getInstance();
        //System.out.println("calendar = " + calendar);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println("i = " + i*4657766*7);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时"+(end-start));

    }


}
