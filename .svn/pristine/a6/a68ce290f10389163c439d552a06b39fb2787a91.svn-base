package com.ehootu.core.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 计数器工具类
 * @author zhangyong
 * @create 2017-10-18 13:24
 **/
public class Counter {

    private volatile static String key = getCurrentDateString(new Date());

    private volatile static AtomicInteger atomic = new AtomicInteger(0);

    private static final String DATE_PATTERN = "yyyy-MM-dd";
    private static SimpleDateFormat format =  new SimpleDateFormat(DATE_PATTERN);
    private static String getCurrentDateString(Date date) {
        String newDateStr = new SimpleDateFormat(DATE_PATTERN).format(date);
        return newDateStr;
    }

    /**
     * 判断当前日期与老的日期（也即key成员变量记录的值）是否一致
     *
     * @return
     */
    private  static boolean isDateEquals(String newDateStr) {
        String oldDateStr = key;
        if (!isBlank(oldDateStr) && oldDateStr.equals(newDateStr)) {
            return true;
        }
        return false;
    }
    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if(cs != null && (strLen = cs.length()) != 0) {
            for(int i = 0; i < strLen; ++i) {
                if(!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    public static Integer getCount(Date date) {
        String newDateStr = getCurrentDateString(date);
        if (isDateEquals(newDateStr)) {
            atomic.incrementAndGet();
        }else{
            atomic = new AtomicInteger(1);
            key = newDateStr;
        }
        return atomic.get();
    }

    /**
     * 三位数递增，每天从1开始递增 如 001 002...
     * @return 返回三位数 如 001 002 ...
     */
    public static String getCount() {
        String newDateStr = getCurrentDateString(new Date());
        //设置格式为3位数 如： 001 002 ...
        DecimalFormat format = new DecimalFormat("000");
        if (isDateEquals(newDateStr)) {
            atomic.incrementAndGet();
        }else{
            atomic = new AtomicInteger(1);
            key = newDateStr;
        }
        return format.format(atomic.get());
    }
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        for(int j=0;j<30;j++){
            if(j==16){
               long time =  date.getTime()+24*60*60*1000;
                String d = format.format(time);
               date= format.parse(d);
            }
            System.out.println("运行结果:Counter.count="+ j +"  :"+ key+"----   " + getCount());
        }
    }

}
