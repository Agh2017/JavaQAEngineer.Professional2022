package utils;

import java.util.*;

public class DateFromCalendar {

  public DateFromCalendar(int year, int month, int day) {
  }

  private static int YEAR = 2022;

  public static Date getDate(int year, int month, int day) {

    Calendar calendar = new GregorianCalendar(year, month, day);
    Date date = calendar.getTime();
    System.out.println(date);
    return date;
  }
}
