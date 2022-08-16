package com.cognizant.medicare.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date convertToDate(String date) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            format.setLenient(false);
            return format.parse(date);
        } catch (ParseException e) {
            System.out.println("Date Format Went Wrong");
        }
        return null;
    }

    public static java.sql.Date convertUtilToSql(java.util.Date utilDate) {
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        return sqlDate;
    }

    public static Date convertStringToUtilDate(String sDate1) throws ParseException {
        java.util.Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
        return date1;
    }

}
