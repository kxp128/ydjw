package com.ehootu.core.feature.initialServlet;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author Liaoxb
 * @Date 2017/12/14 0014 14:12:12
 */
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        simpleDateFormat.setLenient(false);
        try {
           return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args)  {
        String str = "2017-12-14 14:47:00";
        String str1 = "2017-12-14 14:47";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        simpleDateFormat.setLenient(false);
        try {
            System.out.println(simpleDateFormat.parse(str1));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
