package com.ehootu.core.util;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * 日期工具类, 继承org.apache.commons.lang.time.DateUtils类
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {


	private static String[] parsePatterns = {
		"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM", 
		"yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
		"yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};

	private static SimpleDateFormat format =  new SimpleDateFormat(parsePatterns[0]);
	/**
	 * 得到当前日期字符串 格式（yyyy-MM-dd）
	 */
	public static String getDate() {
		return getDate("yyyy-MM-dd");
	}
	
	/**
	 * 得到当前日期字符串 格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static String getDate(String pattern) {
		return DateFormatUtils.format(new Date(), pattern);
	}
	
	/**
	 * 得到日期字符串 默认格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static String formatDate(Date date, Object... pattern) {
		String formatDate = null;
		if(date==null){
			return "";
		}
		if (pattern != null && pattern.length > 0) {
			formatDate = DateFormatUtils.format(date, pattern[0].toString());
		} else {
			formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
		}
		return formatDate;
	}
	
	/**
	 * 得到日期时间字符串，转换格式（yyyy-MM-dd HH:mm:ss）
	 */
	public static String formatDateTime(Date date) {
		return formatDate(date, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 得到当前时间字符串 格式（HH:mm:ss）
	 */
	public static String getTime() {
		return formatDate(new Date(), "HH:mm:ss");
	}

	/**
	 * 得到当前日期和时间字符串 格式（yyyy-MM-dd HH:mm:ss）
	 */
	public static String getDateTime() {
		return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 得到当前年份字符串 格式（yyyy）
	 */
	public static String getYear() {
		return formatDate(new Date(), "yyyy");
	}
	
	public static String getYear(Date date) {
		return formatDate(date, "yyyy");
	}

	/**
	 * 得到当前月份字符串 格式（MM）
	 */
	public static String getMonth() {
		return formatDate(new Date(), "MM");
	}
	
	public static String getMonth(Date date) {
		return formatDate(date, "MM");
	}
	

	/**
	 * 得到当前月份字符串 格式（MM）
	 */
	public static int getMonthNumber() {
		String month = formatDate(new Date(), "MM");
		return Integer.parseInt(month);
	}

	/**
	 * 得到当天字符串 格式（dd）
	 */
	public static String getDay() {
		return formatDate(new Date(), "dd");
	}
	
	public static String getDay(Date date) {
		return formatDate(date, "dd");
	}

	/**
	 * 得到当前星期字符串 格式（E）星期几
	 */
	public static String getWeek() {
		return formatDate(new Date(), "E");
	}
	
	/**
	 * 日期型字符串转化为日期 格式
	 * { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", 
	 *   "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm",
	 *   "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm" }
	 */
	public static Date parseDate(Object str) {
		if (str == null){
			return null;
		}
		try {
			return parseDate(str.toString(), parsePatterns);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * 获取过去的天数
	 * @param date
	 * @return
	 */
	public static long pastDays(Date date) {
		long t = new Date().getTime()-date.getTime();
		return t/(24*60*60*1000);
	}

	/**
	 * 获取过去的小时
	 * @param date
	 * @return
	 */
	public static long pastHour(Date date) {
		long t = new Date().getTime()-date.getTime();
		return t/(60*60*1000);
	}
	
	/**
	 * 获取过去的分钟
	 * @param date
	 * @return
	 */
	public static long pastMinutes(Date date) {
		long t = new Date().getTime()-date.getTime();
		return t/(60*1000);
	}
	
	/**
	 * 转换为时间（天,时:分:秒.毫秒）
	 * @param timeMillis
	 * @return
	 */
    public static String formatDateTime(long timeMillis){
		long day = timeMillis/(24*60*60*1000);
		long hour = (timeMillis/(60*60*1000)-day*24);
		long min = ((timeMillis/(60*1000))-day*24*60-hour*60);
		long s = (timeMillis/1000-day*24*60*60-hour*60*60-min*60);
		long sss = (timeMillis-day*24*60*60*1000-hour*60*60*1000-min*60*1000-s*1000);
		return (day>0?day+",":"")+hour+":"+min+":"+s+"."+sss;
    }
	
	/**
	 * 获取两个日期之间的天数
	 * 
	 * @param before
	 * @param after
	 * @return
	 */
	public static double getDistanceOfTwoDate(Date before, Date after) {
		long beforeTime = before.getTime();
		long afterTime = after.getTime();
		return (afterTime - beforeTime) / (1000 * 60 * 60 * 24);
	}
	
	/** 
     *  
     * 1 第一季度 2 第二季度 3 第三季度 4 第四季度 
     *  
     * @param date 
     * @return 
     */  
    public static int getSeason(Date date) {  
  
        int season = 0;  
  
        Calendar c = Calendar.getInstance();  
        c.setTime(date);  
        int month = c.get(Calendar.MONTH);  
        switch (month) {  
        case Calendar.JANUARY:  
        case Calendar.FEBRUARY:  
        case Calendar.MARCH:  
            season = 1;  
            break;  
        case Calendar.APRIL:  
        case Calendar.MAY:  
        case Calendar.JUNE:  
            season = 2;  
            break;  
        case Calendar.JULY:  
        case Calendar.AUGUST:  
        case Calendar.SEPTEMBER:  
            season = 3;  
            break;  
        case Calendar.OCTOBER:  
        case Calendar.NOVEMBER:  
        case Calendar.DECEMBER:  
            season = 4;  
            break;  
        default:  
            break;  
        }  
        return season;  
    } 


	/**  
     * 获取某年最后一天日期  
     * @param year 年份  
     * @return Date  
     */  
    public static Date getCurrYearLast(int year){   
        Calendar calendar = Calendar.getInstance();   
        calendar.clear();   
        calendar.set(Calendar.YEAR, year);   
        calendar.roll(Calendar.DAY_OF_YEAR, -1);   
        Date currYearLast = calendar.getTime();   
           
        return currYearLast;   
    }

	/**
	 * 判断时间是否是今天
	 * @param date
	 * @return
	 */
	public static boolean isToday(Date date){
		return formatDate(date).equals(getDate());
	}

	/**
	 * 判断时间是否是昨天
	 * @param date
	 * @return
	 */
	public static boolean isYesterday(Date date){
		try{
			long time = date.getTime()+24*60*60*1000;
			String stringDate = format.format(time);
			date = format.parse(stringDate);
			return isToday(date);
		}catch (Exception e) {
			return false;
		}
	}

	public static String getString(Date date){
		if (isToday(date)){
			return formatDate(date,"HH:mm");
		}else if (isYesterday(date)){
			return "昨天 "+formatDate(date,"HH:mm");
		}else {
			return formatDate(date,"yyyy/MM/dd HH:mm");
		}
	}

	/**
	 * 获取以当前日期为结束日期的一周内的时间
	 */
	public static String getWeekDate(){
//		String paramStartDate = "";
		String paramEndDate = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateNow = new Date();
		Date dateBefore = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateNow);
		cal.add(Calendar.DAY_OF_MONTH, -6);
		dateBefore = cal.getTime();
		paramEndDate = sdf.format(dateBefore);
//		paramStartDate = sdf.format(dateNow);
//		System.out.println(paramStartDate);
		System.out.println(paramEndDate);
		return paramEndDate;
	}
	/**
	 * 获取以当前日期为结束日期一个月内的时间
	 */
	public static String getMonthDate(){
//		String paramStartDate = "";
		String paramEndDate = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateNow = new Date();
		Date dateBefore = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateNow);
		cal.add(Calendar.MONTH, -1);
		dateBefore = cal.getTime();
		paramEndDate = sdf.format(dateBefore);
//		paramStartDate = sdf.format(dateNow);
//		System.out.println(paramStartDate);
		System.out.println(paramEndDate);
		return paramEndDate;
	}



	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
//		System.out.println(formatDate(parseDate("2010/3/6")));
//		System.out.println(getDate("yyyy年MM月dd日 E"));
//		long time = new Date().getTime()-parseDate("2012-11-19").getTime();
//		System.out.println(time/(24*60*60*1000));
		Date date = new Date();
		long time = date.getTime()+24*60*60*1000;
		String d = format.format(time);
format.parse(d);
for (int i=0;i<=10;i++){
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replaceAll("-","");
		System.out.println("d:"+uuid);}
//		System.out.println(isToday(new Date()));
	}
}
