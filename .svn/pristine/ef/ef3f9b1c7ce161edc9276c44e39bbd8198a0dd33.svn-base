package com.ehootu.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Title:CalendarTest
 * @Author: KongXiaoPing
 * @Date: 2017-10-17 12:59
 * @Description: 判断一个日期 是否为 今天、昨天 工具类
 */
public class CalendarUtils {

    /**
     * @param args
     */
    public static void main(String[] args) {

//        String time = formatDateTime(DateUtils.formatDateTime(new Date()));
        String time = formatDateTime("2017-10-23 18:45");
        System.out.println("time:" + time);
        time = formatDateTime("2017-10-22 19:45");
        System.out.println("time:" + time);
        time = formatDateTime("2017-10-20 18:45");
        System.out.println("time:" + time);
    }

    /**
     * 格式化时间 返回 今天，昨天 其他等日期格式
     *
     * @param time
     * @return
     */
    public static String formatDateTime(String time) {
        SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm");
        if (time == null || "".equals(time)) {
            return "";
        }
        Date date = null;
        try {
            date = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar current = Calendar.getInstance();

        Calendar today = Calendar.getInstance();    //今天

        today.set(Calendar.YEAR, current.get(Calendar.YEAR));
        today.set(Calendar.MONTH, current.get(Calendar.MONTH));
        today.set(Calendar.DAY_OF_MONTH, current.get(Calendar.DAY_OF_MONTH));
        //  Calendar.HOUR——12小时制的小时数 Calendar.HOUR_OF_DAY——24小时制的小时数
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);

        Calendar yesterday = Calendar.getInstance();    //昨天

        yesterday.set(Calendar.YEAR, current.get(Calendar.YEAR));
        yesterday.set(Calendar.MONTH, current.get(Calendar.MONTH));
        yesterday.set(Calendar.DAY_OF_MONTH, current.get(Calendar.DAY_OF_MONTH) - 1);
        yesterday.set(Calendar.HOUR_OF_DAY, 0);
        yesterday.set(Calendar.MINUTE, 0);
        yesterday.set(Calendar.SECOND, 0);

        current.setTime(date);
        //今天
        if (current.after(today)) {
            return time.split(" ")[1];
            //昨天
        } else if (current.before(today) && current.after(yesterday)) {
            return "昨天" + time.split(" ")[1];
            //其他日期
        } else {
//            int index = time.indexOf("-")+1;
//            return time.substring(index, time.length());
            return time;
        }
    }

}