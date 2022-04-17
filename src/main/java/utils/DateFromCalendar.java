package utils;

import java.util.*;

public class DateFromCalendar {

    public Date DateFromCalendar(int year, int month, int day) {
        return getDate(year, month ,day);
    }

    private static int YEAR = 2022;

    private static Date getDate(int year, int month, int day) {

        Calendar calendar = new GregorianCalendar(year, month, day);
        Date date = calendar.getTime();
        System.out.println(date);
        return date;
    }
}
